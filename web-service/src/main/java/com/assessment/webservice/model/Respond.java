package com.assessment.webservice.model;

public class Respond {
    private String mostFrequentCommand;
    private double startProcessTime;
      private double stopProcessTime;

    public void setMostFrequentCommand(String mostFrequentCommand) {
        this.mostFrequentCommand = mostFrequentCommand;
    }

    public void setStartProcessTime(Long startProcessTime) {
        this.startProcessTime = startProcessTime;
    }

    public void setStopProcessTime(Long stopProcessTime) {
        this.stopProcessTime = stopProcessTime;
    }

    public String getMostFrequentCommand() {
        return mostFrequentCommand;
    }

    public double getStartProcessTime() {
        return startProcessTime;
    }

    protected Respond() {
    }

    public Respond(String mostFrequentCommand, double startProcessTime, double stopProcessTime) {
        this.mostFrequentCommand = mostFrequentCommand;
        this.startProcessTime = startProcessTime;
        this.stopProcessTime = stopProcessTime;
    }

    public double getStopProcessTime() {
        return stopProcessTime;
    }
}
