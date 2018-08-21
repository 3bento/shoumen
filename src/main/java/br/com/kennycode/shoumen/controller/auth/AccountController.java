package br.com.kennycode.shoumen.controller.auth;

import javax.servlet.http.HttpSession;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import br.com.kennycode.shoumen.dao.AccountDAO;
import br.com.kennycode.shoumen.model.Account;
import br.com.kennycode.shoumen.service.AuthenticationService;

@Controller
@RequestMapping("auth")
public class AccountController {

	private AccountDAO accountDAO = new AccountDAO();
	private AuthenticationService authentication = new AuthenticationService();

	public AccountController() {
		accountDAO = new AccountDAO();
	}

	@RequestMapping(value = "signup", method = RequestMethod.GET)
	public String signup() {
		return "auth/signup";
	}

	@RequestMapping(value = "signup", method = RequestMethod.POST)
	public String save(@Valid Account account, BindingResult result) {
		
		if(result.hasErrors())
			return "auth/signup";

		account = accountDAO.save(account);
		System.out.println(account);

		if (account.getUuid() != null)
			return "redirect:signin";
		return "redirect:signup";
	}

	@RequestMapping(value = "signin", method = RequestMethod.GET)
	public String signin() {
		return "auth/signin";
	}

	@RequestMapping(value = "signin", method = RequestMethod.POST)
	public String login(@Valid Account account, HttpSession session, BindingResult result) {

		if(result.hasErrors())
			return "auth/signin";
		
		if (authentication.canLogin(account)) {
			session.setAttribute("account", account);
			return "redirect:/payments";
		}
		return "redirect:signin";
	}

	@RequestMapping(value = "logout", method = RequestMethod.GET)
	public String login(HttpSession session) {
		session.removeAttribute("account");
		return "redirect:/";
	}
}
