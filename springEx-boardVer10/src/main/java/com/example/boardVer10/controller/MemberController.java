package com.example.boardVer10.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.boardVer10.model.member.UpdateMemberForm;
import com.example.boardVer10.model.member.CreateMemberForm;
import com.example.boardVer10.model.member.LoginForm;
import com.example.boardVer10.model.member.Member;
import com.example.boardVer10.service.MemberService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/member")
@Controller
public class MemberController {
	
	private final MemberService memberService;
	
	@GetMapping(path = "/join")
    public String joinForm(Model model) {
        model.addAttribute("createMemberForm", new CreateMemberForm());
        return "member/joinForm";
    }
	
	@PostMapping(value = "/join")
    public String join(@Validated @ModelAttribute("createMemberForm") CreateMemberForm createMemberForm, BindingResult bindingResult) {
		 log.info("createMemberForm : {}", createMemberForm);
        
		 if(bindingResult.hasErrors()) {
			 return "member/joinForm";
		 }
		 memberService.saveMember(createMemberForm.toMember());
		 return "redirect:/";
    }
	
	@GetMapping(value = "/login")
    public String loginForm(Model model) {
       model.addAttribute("loginForm", new LoginForm());
        return "member/loginForm";
    }
	
	@PostMapping(value = "/login")
    public String login(@Validated @ModelAttribute("loginForm") LoginForm loginForm, BindingResult bindingResult, HttpServletRequest request) {
		log.info("loginForm : {}", loginForm);
		
		if(bindingResult.hasErrors()) {
			return "redirect:/board/list";
		}
		Member findMember = memberService.findMember(loginForm.toMember());
		if(findMember == null) {
			bindingResult.reject("loginError", "아이디 또는 패스워드가 맞지 않습니다.");
			return "member/loginForm";
		}
         
         HttpSession session = request.getSession();
         session.setAttribute("loginMember", findMember);
         return "redirect:/board/list";
	}
	
	@GetMapping(value = "/logout")
    public String logout(HttpServletRequest request) {
		 HttpSession session = request.getSession();
	        if (session != null) {
	            session.invalidate();
	        }
	        return "redirect:/";
    }
	
	@GetMapping(value = "/update/{id}")
    public String updateForm(@PathVariable String id, Model model) {
		 Member findMember = memberService.findMember(id);
	     model.addAttribute("member", findMember.toUpdateMemberForm());
	     return "member/updateForm";
    }
	
	@PostMapping(value = "/update")
    public String update(@Validated @ModelAttribute("updateMemberForm") UpdateMemberForm updateMemberForm, BindingResult bindingResult) {
    	return "redirect:/";
    }
}
