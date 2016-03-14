package com.CommandMode;

/**
 * 命令接收者,命令真正执行人
 */
public class Receiver {
	public void action() {
		System.out.println("执行命令...");
	}

	public void unAction() {
		System.out.println("撤销命令...");
	}
}
