package com.it2go.facesbootstarp.controller;

import java.io.Serializable;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;

@Named
@SessionScoped
public class LoginController implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8021092579229778411L;
	
	private LoginCredential credential;

	private boolean isLoggedin;
	
	
	public LoginController() {
		this.credential = new LoginCredential();
		this.isLoggedin = false;
	}

	public boolean isLoggedin() {
		return isLoggedin;
	}
	
	public boolean getIsLoggedin() {
		return isLoggedin;
	}
	
	public LoginCredential getCredential() {
		return credential;
	}

	public void setCredential(LoginCredential credential) {
		this.credential = credential;
	}

	public void setLoggedin(boolean isLoggedin) {
		this.isLoggedin = isLoggedin;
	}
	
	public void login(){
		this.setLoggedin(false);
		if(this.getCredential().getEmail() != null && this.getCredential().getEmail().length() > 5 && 
				this.getCredential().getPassword() != null && this.getCredential().getPassword().length() > 4){
			System.out.println("Email: "+this.getCredential().getEmail());
			System.out.println("Password: "+this.getCredential().getPassword());
			this.setLoggedin(true);
		}
	}

	public void logout(){
		this.credential = new LoginCredential();
		this.isLoggedin = false;
	}
	
}
