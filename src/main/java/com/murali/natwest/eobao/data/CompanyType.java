package com.murali.natwest.eobao.data;

public enum CompanyType {

    PLC("Public limited company"),
    LTD("Private company limited by shares"),

    UNLTD("Unlimited company"),

    LLP("Limited liability partnership"),

    IPS("Industrial and provident society"),
    RC("Royal charter");

    private String desc;

    private CompanyType(String desc) {
        this.desc = desc;
    }
}

