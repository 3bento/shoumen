package br.com.kennycode.shoumen.dao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.UUID;

import br.com.kennycode.shoumen.model.Account;

public class AccountDAO implements BaseDAO<Account> {

	private static List<Account> accounts;

	public AccountDAO() {
		accounts = new ArrayList<Account>();
	}

	/**
	 * Help to update and populate the object.
	 * 
	 * @param current
	 *            - it will receive new data.
	 * @param data
	 *            - it already has the new data.
	 * @return - return @corrent with more data.
	 */
	private Account toUpdate(Account current, Account data) {
		current.setUsername(data.getUsername());
		current.setPassword(data.getPassword());
		current.setUpdated(Calendar.getInstance());
		return current;
	}

	/**
	 * Help to populate the object.
	 * 
	 * @param current
	 *            - it will receive new data.
	 * @return - return same object with more data.
	 */
	private Account toSave(Account current) {
		current.setUuid(UUID.randomUUID());
		current.setCreated(Calendar.getInstance());
		current.setUpdated(Calendar.getInstance());
		return current;
	}

	@Override
	public Account save(Account account) {
		
		boolean isUsernameAvailable = true;
		for (Account current : accounts) {
			if (current.isUsernameEqual(account)) {
				isUsernameAvailable = false;
				break;
			}
			
			isUsernameAvailable = true;	
		}
		
		System.out.println(isUsernameAvailable);
		if(isUsernameAvailable) {
			account = toSave(account);
			accounts.add(account);
		}
		// can't save becuase the name is not avaliable.
		return account;
	}

	@Override
	public Account update(Account account) {
		for (Account current : accounts) {
			if (current.isExist(account)) {
				toUpdate(current, account);
				return current;
			}
		}
		// there is nothing to update
		return account;
	}

	@Override
	public Account remove(Account account) {
		for (Account current : accounts) {
			if (current.isExist(account)) {
				accounts.remove(current);
				return current;
			}
		}
		// there is nothing to remove.
		return account;
	}

	@Override
	public Account findByUuid(Account account) {
		for (Account current : accounts) {
			if (current.isExist(account)) {
				return current;
			}
		}
		// there is nothing to find.
		return account;
	}

	@Override
	public boolean isExist(Account account) {
		for (Account current : accounts) {
			if(current.isExist(account)) {
				return true;
			}
		}
		
		return false;
	}

	public Account findByUsername(Account account) {
		for (Account current : accounts) {
			if (current.getUsername().equals(account.getUsername())) {
				return current;
			}
		}
		// there is nothing to find.
		return null;
	}
	
	public List<Account> getAll(){
		return accounts;
	}
}