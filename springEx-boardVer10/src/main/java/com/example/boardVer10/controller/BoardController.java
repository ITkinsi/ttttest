package com.example.boardVer10.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.boardVer10.service.BoardService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
<<<<<<< HEAD
// aasdasdsadjkasnfbsdfjkbgsdfjkg
=======
// ㅁㄴㅇㅁㄴ
// 아무거나
>>>>>>> branch 'main' of https://github.com/ITkinsi/ttttest.git
@Slf4j
@RequiredArgsConstructor
@RequestMapping(path = "/board")
@Controller
public class BoardController {
	private final BoardService boardService;
	
	@GetMapping(value = "/write")
	public String writeForm() {
		return "board/writeFrom";
	}
	
	@PostMapping(value = "/write")
    public String write() {
        
        return "redirect:/board/list";
    }
	
	@GetMapping(value = "/list")
    public String list() {
        
        return "board/list";
    }
	
	@GetMapping(value = "/read/{id}")
    public String read() {
        
        return "board/read";
    }
	
	@GetMapping(value = "/update/{id}")
    public String updateForm() {
       
        return "board/updateForm";
    }
	
	@PostMapping(value = "/update")
    public String update() {
        
        return "redirect:/board/list";
    }
	
	@GetMapping(value = "remove/{id}")
    public String remove() {
       
        return "redirect:/board/list";
    }
}
