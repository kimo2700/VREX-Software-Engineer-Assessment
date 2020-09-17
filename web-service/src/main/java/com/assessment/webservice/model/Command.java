package com.assessment.webservice.model;

public class Command {

    private String speaker;
    private String command;

    public void setCommand(String command) {
        this.command = command;
    }

    public void setSpeaker(String speaker) {
        this.speaker = speaker;
    }

    public String getCommand() {
        return command;
    }

    protected String getSpeaker() {
        return speaker;
    }
    protected Command( ) {

    }
    public Command(String speaker,String command ) {
        this.speaker = speaker;
        this.command= command ;
    }
}
