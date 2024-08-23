package com.Evergent.CoreJava.OOPs;

public class userLogin {
	
	public void loginData() {
		System.out.println("Login Info");
	}
	public void loginData(String name, String pass) {
		System.out.println("name:"+name);
		System.out.println("pass:"+pass);
	}
	public void loginData(String name, String pass, String capcha) {
		System.out.println("name:"+name);
		System.out.println("pass:"+pass);
		System.out.println("capcha:"+capcha);
	}
	public void loginData(int mobile, String pass) {
		System.out.println("mobile:"+mobile);
		System.out.println("pass:"+pass);
	}
	
	public void show() {
		System.out.println("show method");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		userLogin login=new userLogin();
		login.loginData();
		login.loginData("Raj", "Raj123");
		login.loginData("Ravi", "Ravi123", "ABC");
		login.loginData(1234567, "welcome");
		login.show();

	}

}
