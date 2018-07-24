package com.sia.gemfire;

import com.sia.gemfire.function.MeanSSRFunctionOnServer;
import com.sia.gemfire.function.MeanSSRFunctionWithTwoOQL;
import org.apache.geode.cache.Region;
import org.apache.geode.cache.client.ClientCache;
import org.apache.geode.cache.client.ClientCacheFactory;
import org.apache.geode.cache.client.ClientRegionShortcut;
import org.apache.geode.cache.execute.FunctionService;

import java.util.List;

public class Application2 {
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );


        ClientCache cache = new ClientCacheFactory()
                .addPoolLocator("192.168.43.180", 10334).set("log-level", "WARN").create();

        final String regionName = "passenger";

        // create a local region that matches the server region

        Region<Object, Object> region = cache.<Object, Object>createClientRegionFactory(ClientRegionShortcut.CACHING_PROXY)
                .create(regionName);


        List<Object> output =
                (List<Object>) FunctionService.onServers(region.getRegionService()).setArguments(regionName)
                        .execute(new MeanSSRFunctionOnServer()).getResult();


        /*
        List<Object> output =
                (List<Object>) FunctionService.onRegion(region).setArguments(regionName)
                        .execute(new MeanSSRFunctionWithTwoOQL()).getResult();
        */

        for (Object itin :  output) {
            System.out.println("Result => "+ itin.toString());
        }

        cache.close();
    }
}
