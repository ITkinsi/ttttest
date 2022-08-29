package com.example.boardVer10.model.member;

public enum GenderType {
	MALE("남자"),
    FEMALE("여자");

    private String description;

    GenderType(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}