package com.example.boardVer10.service;

import org.springframework.stereotype.Service;

import com.example.boardVer10.model.member.Member;
import com.example.boardVer10.repository.MemberMapper;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Service
public class MemberService {
	private final MemberMapper memberMapper;
	
	public void saveMember(Member member) {
		memberMapper.saveMember(member);
	}
	
	public Member findMember(String id) {
		return memberMapper.findMemberById(id);
	}
	
	public Member findMember(Member member) {
        return memberMapper.findMemberByIdAndPassword(member);
    }
	
	public void updateMember (Member member) {
		memberMapper.updateMember(member);
	}
}
