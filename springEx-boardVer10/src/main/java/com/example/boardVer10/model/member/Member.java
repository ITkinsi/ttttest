package com.example.boardVer10.model.member;

import java.time.LocalDate;

import com.example.boardVer10.model.member.Member;

import lombok.Data;

@Data
public class Member {
	private String id;
    private String password;
    private String name;
    private GenderType gender;
    private LocalDate birth;
    private String email;
    
    public UpdateMemberForm toUpdateMemberForm() {
        UpdateMemberForm updateMemberForm = new UpdateMemberForm();
        updateMemberForm.setId(id);
        updateMemberForm.setPassword(password);
        updateMemberForm.setName(name);
        updateMemberForm.setGender(gender);
        updateMemberForm.setBirth(birth);
        updateMemberForm.setEmail(email);
        return updateMemberForm;
    }
}
