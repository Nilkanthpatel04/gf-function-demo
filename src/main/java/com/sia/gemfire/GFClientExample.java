package com.sia.gemfire;

import org.apache.geode.cache.Region;
import org.apache.geode.cache.client.ClientCache;
import org.apache.geode.cache.client.ClientCacheFactory;
import org.apache.geode.cache.client.ClientRegionShortcut;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class GFClientExample {
    public static void main(String[] args) {
        final String HOSTNAME = "35.200.251.71";

        System.out.println("Sample GemFire client");

        Properties props = new Properties();
        props.put("log-level", "all");
        props.put("log-file", "/tmp/GFClient.log");
        //props.put("xxxx", "yyyy");

        ClientCache cache = new ClientCacheFactory(props).addPoolLocator(HOSTNAME, 10334).create();

        final String regionName = "example";

        // create a local region that matches the server region
        Region<String, String> region = cache.<String, String>createClientRegionFactory(ClientRegionShortcut.CACHING_PROXY)
                .create(regionName);

        region.put("k1", "v1");
        region.put("k2", "v2");
        region.put("k3", "v3");
        region.put("k4", "v4");
        region.put("k5", "v5");

        List<String> searchKeys = new ArrayList<String>();
        searchKeys.add("k1");
        searchKeys.add("k3");
        searchKeys.add("k5");
        Map<String, String> resultMap =  region.getAll(searchKeys);

        resultMap.forEach((k,v)->{
            System.out.println("[" + k + ", " + v + "]");
        });
    }


}
