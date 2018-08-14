package br.com.kennycode.shoumen.service;

import br.com.kennycode.shoumen.dao.AccountDAO;
import br.com.kennycode.shoumen.model.Account;

public class AuthenticationService {

	private AccountDAO accountDao;

	public AuthenticationService() {
		accountDao = new AccountDAO();
	}

	public boolean canLogin(Account account) {

		if (account == null)
			return false;

		Account toLogin = accountDao.findByUsername(account);

		if (toLogin == null)
			return false;

		if (toLogin.getPassword().equals(account.getPassword()))
			return true;

		return false;
	}
}