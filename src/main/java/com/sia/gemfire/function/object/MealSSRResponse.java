package com.sia.gemfire.function.object;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.io.Serializable;

@JsonInclude(value= JsonInclude.Include.NON_NULL)
public class MealSSRResponse implements Serializable {
    private static final long serialVersionUID = 1L;

    private OutputData outputData;
    //private WSErrorInformation wsErrorInformation;

    public OutputData getOutputData() {
        return outputData;
    }

    public void setOutputData(OutputData outputData) {
        this.outputData = outputData;
    }

    /*
    public WSErrorInformation getWsErrorInformation() {
        return wsErrorInformation;
    }
    public void setWsErrorInformation(WSErrorInformation wsErrorInformation) {
        this.wsErrorInformation = wsErrorInformation;
    }
    */
}