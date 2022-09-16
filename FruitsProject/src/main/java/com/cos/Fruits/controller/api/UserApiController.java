package com.cos.Fruits.controller.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cos.Fruits.dto.ResponseDto;
import com.cos.Fruits.model.Boards;
import com.cos.Fruits.model.CartItem;
import com.cos.Fruits.model.Order;
import com.cos.Fruits.model.Reply;
import com.cos.Fruits.model.User;
import com.cos.Fruits.repository.UserRepository;
import com.cos.Fruits.service.BoardService;
import com.cos.Fruits.service.CartService;
import com.cos.Fruits.service.OrderService;
import com.cos.Fruits.service.ProductService;
import com.cos.Fruits.service.ReplyService;
import com.cos.Fruits.service.UserService;

@RestController
public class UserApiController {
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private UserService userService;
	@Autowired
	private BoardService boardService;
	@Autowired
	private ProductService productService;
	@Autowired
	private OrderService orderService;
	@Autowired
	private CartService cartService;
	@Autowired
	private ReplyService replyService;
	
	@PostMapping("/auth/joinProc")
	public ResponseDto<Integer> save(@RequestBody User user){
		System.out.println("UserApiController호출됨");
		
//		person.setRoles(RoleType.USER);
		
		userService.회원가입(user);
		return new ResponseDto<Integer>(HttpStatus.OK.value(),1);
	}
	
	
	@PutMapping("/user")
	public ResponseDto<Integer> update(@RequestBody User user){
		
		userService.회원수정(user);
		return new ResponseDto<Integer>(HttpStatus.OK.value(),1);
	}
	
	@PostMapping("/auth/findId")
	public ResponseDto<String> find(@RequestBody User user){
		
		
		User email= userService.회원찾기(user);
		return new ResponseDto<String>(HttpStatus.OK.value(),email.getUsername());

	}
	
	@PostMapping("/auth/findpwd")
	public ResponseDto<String> findpwd(@RequestBody User user,Model model) {
		User person = userRepository.findByUsername(user.getUsername())
				.orElseThrow(()->{
					return new IllegalArgumentException("아이디를 찾을 수 없습니다.");
				});

			if(person.getEmail().equals(user.getEmail())){
//				System.out.println("111");
				if(person.getName().equals(user.getName())){
//					System.out.println("2222");
					if(person.getTel().equals(user.getTel())){
						
						person.setPassword(user.getPassword());
						userService.회원수정(person);
						return new ResponseDto<String>(person.getId(),"비밀번호를 재설정했습니다.");
					}
				}
			}
		
		return new ResponseDto<String>(500,"회원정보가 틀렸습니다.");
	}
	
	@DeleteMapping("/user/updateForm/{id}")
	public ResponseDto<Integer> deleteById(@PathVariable int id){		
		
		List<Order> orders = orderService.주문목록();
		for(int i = 0 ; i<orders.size();i++) {
			if(orders.get(i).getUser().getId() == id) {
				orderService.주문삭제(orders.get(i).getId());
			}
		}
		
		List<Reply> replys = replyService.답변보기();
		for(int i = 0; i<replys.size(); i++) {
			if(replys.get(i).getBoards().getUsers().getId() == id) {
				replyService.답변삭제하기(replys.get(i).getId());
			}
		}
	
		
		List<Boards> boards = boardService.listUp();
		for(int i = 0 ; i<boards.size();i++) {
			if(boards.get(i).getUsers().getId() == id) {				
				boardService.글삭제하기(boards.get(i).getId());
			}
		}
		List<CartItem> cartItems = cartService.카트보기();
		for(int i = 0 ; i<cartItems.size();i++) {
			if(cartItems.get(i).getCart().getCartId() == id) {
				cartService.카트비우기(cartItems.get(i).getCartItemId());
			}
		}
		cartService.카트삭제(id);
		userService.회원탈퇴(id);
		return new ResponseDto<Integer>(HttpStatus.OK.value(),1);
	}
	

	
//	@PostMapping("/api/user/login")
//	public ResponseDto<Integer> login(@RequestBody person person,HttpSession session){
//		System.out.println("UserApiController :login 호출됨");
//		person principal= userService.로그인(person);
//		
//		if(principal !=null) {
//			session.setAttribute("principal", principal);
//		}
//		return new ResponseDto<Integer>(HttpStatus.OK.value(),1);
//	}
}
