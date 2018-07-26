package br.com.kennycode.shoumen.controller.auth;

import java.util.Calendar;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.kennycode.shoumen.model.Account;

@Controller
@RequestMapping("auth")
public class AccountController {
	
	@RequestMapping(value="signup", method=RequestMethod.GET)
	public String signup() { 
		return "auth/signup";
	}

	@RequestMapping(value="signin", method=RequestMethod.GET)
	public String signin() {
		return "auth/signin";
	}

	@RequestMapping(value="save", method=RequestMethod.POST)
	public String save(Account account) {
		
		account.setDatePayment(Calendar.getInstance());
		System.out.println(account.toString());
		return "redirect:signin";
	}
}
