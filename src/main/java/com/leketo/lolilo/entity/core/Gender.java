package com.leketo.lolilo.entity.core;

public enum Gender {

    MALE("M"),
    FEMALE("F");

    private String id;

    Gender(String value) {
        this.id = value;
    }

    public String getId() {
        return id;
    }

    public static Gender fromId(String id) {
        for (Gender at : Gender.values()) {
            if (at.getId().equals(id)) {
                return at;
            }
        }
        return null;
    }

}
