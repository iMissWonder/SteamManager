package com.steammanager.login.entity;

public class Login {

	private int id;
	private String username;
	private String password;
	private String steamid;
	public int getId() {
		return id;
	}
	public void setId(int userId) {
		this.id = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String userName) {
		this.username = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String userPassword) {
		this.password = userPassword;
	}
	public String getSteamid() {
		return steamid;
	}
	public void setSteamid(String steamid) {
		this.steamid = steamid;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + username +", id=" + password + "]";
	}
}
