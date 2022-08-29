package com.example.boardVer10.model.member;

import java.time.LocalDate;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import com.example.boardVer10.model.member.GenderType;
import com.example.boardVer10.model.member.UpdateMemberForm;

import lombok.Data;

@Data
public class UpdateMemberForm {
	@Size(min = 4, max = 20)
    private String id;
    @Size(min = 2, max = 20)
    private String name;
    private String password;
    @NotEmpty
    private GenderType gender;
    @Past
    private LocalDate birth;
    private String email;
}
