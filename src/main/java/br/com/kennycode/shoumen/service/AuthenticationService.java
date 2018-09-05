package br.com.kennycode.shoumen.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.kennycode.shoumen.dao.AccountDAO;
import br.com.kennycode.shoumen.model.Account;

@Service
public class AuthenticationService {
	
	private AccountDAO accountDAO;

	@Autowired
	public AuthenticationService(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}

	public boolean canLogin(Account account) {

		if (account == null)
			return false;

		Account toLogin = accountDAO.findByUsername(account);

		if (toLogin == null)
			return false;

		if (toLogin.getPassword().equals(account.getPassword()))
			return true;

		return false;
	}
}