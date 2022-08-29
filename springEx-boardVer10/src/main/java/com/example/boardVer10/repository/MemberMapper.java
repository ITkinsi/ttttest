package com.example.boardVer10.repository;

import org.apache.ibatis.annotations.Mapper;

import com.example.boardVer10.model.member.Member;
@Mapper
public interface MemberMapper {
	
	public int saveMember(Member member);
	
	public Member findMemberById(String id);
	
	public Member findMemberByIdAndPassword(Member member);

	public int updateMember(Member member);
}
