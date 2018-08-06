package com.flowable.spring.exercisetwo.rest;

// TODO: write a rest controller that returns the local time 
// as string as response in the /now endpoint
// TODO: retrieve the format pattern from the properties file
// TODO: use DateTimeService class to obtain now()
// and format it using dateStringFormat
public class DateTimeController {

    private String dateStringFormat;

    public String now() {
        return "now";
    }

}
