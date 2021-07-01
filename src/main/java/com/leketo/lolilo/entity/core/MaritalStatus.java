package com.leketo.lolilo.entity.core;

public enum MaritalStatus {

    MARRIED("M"),
    SINGLE("S"),
    DIVORCED("D"),
    WIDOWED("W");

    private String id;

    MaritalStatus(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }
    public static MaritalStatus fromId(String id) {
        for (MaritalStatus at : MaritalStatus.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}
