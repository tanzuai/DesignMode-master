package com.CommandMode;

public class CommandMode {
	public static void test() {
		// 创建接受者
		Receiver receiver = new Receiver();
		// 创建命令对象，并设置它的接受者
		Command command = new CreateCommand(receiver);

		// 创建调用者，将命令对象设置进去
		Invoker invoker = new Invoker();
		invoker.setCommand(command);

		// 这里可以测试一下
		invoker.runCommand();
		invoker.unDoCommand();
	}
}