package com.leketo.lolilo.entity.core;

public enum PersonType {

    GENERIC("G"),
    JURIDICAL("J"),
    PHYSICAL("F");

    private String id;

    PersonType(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }
    public static PersonType fromId(String id) {
        for (PersonType at : PersonType.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }
}
