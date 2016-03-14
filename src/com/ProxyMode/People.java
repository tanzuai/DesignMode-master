package com.ProxyMode;

public class People implements Italk {
	public String username;
	public String age;

	public String getName() {
		return username;
	}

	public void setName(String name) {
		this.username = name;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public People(String name1, String age1) {
		this.username = name1;
		this.age = age1;
	}

	public void talk(String msg) {
		System.out.println(msg + "!你好,我是" + username + "，我年龄是" + age);
	}
}
