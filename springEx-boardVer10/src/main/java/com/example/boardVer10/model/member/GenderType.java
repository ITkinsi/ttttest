package com.example.boardVer10.model.member;

public enum GenderType {
	MALE("����"),
    FEMALE("����");

    private String description;

    GenderType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}