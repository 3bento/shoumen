package br.com.kennycode.shoumen.model;

import java.util.Calendar;
import java.util.UUID;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class Account {

	private UUID uuid;
	@NotEmpty
	@Size(min=4, max=12)
	private String username;
	@NotEmpty
	@Size(min=4, max=64)
	private String password;
	private Calendar created;
	private Calendar updated;

	public UUID getUuid() {
		return uuid;
	}

	public void setUuid(UUID uuid) {
		this.uuid = uuid;
	}

	
	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Calendar getCreated() {
		return created;
	}

	public void setCreated(Calendar created) {
		this.created = created;
	}

	public Calendar getUpdated() {
		return updated;
	}

	public void setUpdated(Calendar updated) {
		this.updated = updated;
	}

	public boolean isExist(Account account) {
		if(getUuid() == null || account.getUuid() == null)
			return false;
		if(getUuid().equals(account.getUuid()))
			return false;
		return true;
	}

	public boolean isUsernameEqual(Account account) {
		if(getUsername().equals(account.getUsername()))
			return true;
		return false;
	}

	@Override
	public String toString() {
		return "Account [uuid=" + uuid + ", username=" + username + ", password=" + password + ", created=" + created
				+ ", updated=" + updated + "]";
	}
	
	
	
	
}