package com.leketo.lolilo.entity.core;

public enum JuridicalType {

    SA("S.A"),
    SRL("S.R.L");

    private String id;

    JuridicalType(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }
    public static JuridicalType fromId(String id) {
        for (JuridicalType at : JuridicalType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }


}
