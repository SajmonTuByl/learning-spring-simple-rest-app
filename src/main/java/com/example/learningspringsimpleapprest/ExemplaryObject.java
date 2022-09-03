package com.example.learningspringsimpleapprest;
/*
This object defines a basic structure of data, which variables will be sent to a web service controller
 */
public class ExemplaryObject {
    private int valueInt;
    private String valueString;
    private boolean valueBoolean;

    ExemplaryObject(int valueInt, String valueString, boolean valueBoolean){

        this.valueInt = valueInt;
        this.valueString = valueString;
        this.valueBoolean = valueBoolean;
    }

    public int getValueInt(){
        return this.valueInt;
    }

    public void setValueInt(int valueInt){
        this.valueInt = valueInt;
    }

    public String getValueString() {
        return valueString;
    }

    public void setValueString(String valueString) {
        this.valueString = valueString;
    }

    public boolean isValueBoolean() {
        return valueBoolean;
    }

    public void setValueBoolean(boolean valueBoolean) {
        this.valueBoolean = valueBoolean;
    }
}
