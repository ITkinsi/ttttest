package com.example.boardVer10.model.member;

import javax.validation.constraints.Size;

import com.example.boardVer10.model.member.LoginForm;

import lombok.Data;

@Data
public class LoginForm {
	@Size(min = 4, max = 20)
    private String id;
    @Size(min = 4, max = 30)
    private String password;
    
    public Member toMember() {
        Member member = new Member();
        member.setId(id);
        member.setPassword(password);
        return member;
    }
}
