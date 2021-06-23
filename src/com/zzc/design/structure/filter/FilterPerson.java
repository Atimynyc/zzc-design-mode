package com.zzc.design.structure.filter;

public class FilterPerson {

    private String name;
    private String gender;
    private String maritalStatus;

    public FilterPerson(String name,String gender,String maritalStatus){
        this.name = name;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
    }

    public String getName() {
        return name;
    }
    public String getGender() {
        return gender;
    }
    public String getMaritalStatus() {
        return maritalStatus;
    }

}
