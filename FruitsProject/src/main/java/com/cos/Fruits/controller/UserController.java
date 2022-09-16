package com.cos.Fruits.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.cos.Fruits.service.CartService;
import com.cos.Fruits.service.ProductService;
import com.cos.Fruits.service.UserService;


@Controller
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@Autowired
	private ProductService productService;
	
	@Autowired
	private CartService cartService;

	@GetMapping("/auth/joinForm")
	public String joinForm() {
		return "user/joinForm";
	}
	
	@GetMapping("/auth/loginForm")
	public String loginForm() {
		return "user/loginForm";
	}
	
	@GetMapping("/user/updateForm")
	public String updateForm() {
		return "user/updateForm";
	}
	
	@GetMapping("/auth/findId")
	public  String findId() {
		return "user/findId";
	}
	
	@GetMapping("/auth/findpwd")
	public  String findpwd() {
		return "user/findpwd";
	}
	
	@GetMapping({"/auth/season"})
	public String seasonProd(Model model, @PageableDefault(size = 10, sort = "productId", direction = Sort.Direction.DESC) Pageable pageable) {
		model.addAttribute("products", productService.상품목록(pageable));
		return "user/season";
		
	}
	
	@GetMapping({"/auth/korean"})
	public String koProd(Model model, @PageableDefault(size = 10, sort = "productId", direction = Sort.Direction.DESC) Pageable pageable) {
		model.addAttribute("products", productService.상품목록(pageable));
		return "user/korean";
		
	}
	
	@GetMapping({"/auth/imported"})
	public String imProd(Model model, @PageableDefault(size = 10, sort = "productId", direction = Sort.Direction.DESC) Pageable pageable) {
		model.addAttribute("products", productService.상품목록(pageable));
		return "user/imported";
		
	}

	
	@GetMapping({"/auth/other"})
	public String other(Model model, @PageableDefault(size = 10, sort = "productId", direction = Sort.Direction.DESC) Pageable pageable) {
		model.addAttribute("products", productService.상품목록(pageable));
		return "user/other";
		
	}
	
	@GetMapping({"/auth/good"})
	public String good(Model model, @PageableDefault(size = 10, sort = "productId", direction = Sort.Direction.DESC) Pageable pageable) {
		model.addAttribute("products", productService.상품목록(pageable));
		return "user/good";
		
	}
	
	@GetMapping({"/auth/all"})
	public String all(Model model, @PageableDefault(size = 10, sort = "productId", direction = Sort.Direction.DESC) Pageable pageable) {
		model.addAttribute("products", productService.상품목록(pageable));
		return "user/all";
		
	}
	
	@GetMapping({"/auth/about"})
	public String about() {		
		return "user/about";		
	}
	
	@GetMapping({"/auth/test"})
	public String test() {		
		return "user/test";		
	}
	
	
}
