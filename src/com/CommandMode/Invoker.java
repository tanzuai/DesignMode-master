package com.CommandMode;

public class Invoker {
	/**
	 * 调用者持有命令对象
	 */
	private Command command;

	/**
	 * 设置命令对象
	 * 
	 * @param command
	 */
	public void setCommand(Command command) {
		this.command = command;
	}

	public Command getCommand() {
		return command;
	}

	/**
	 * 执行命令
	 */
	public void runCommand() {
		command.execute();
	}

	/**
	 * 撤销命令
	 */
	public void unDoCommand() {
		command.undo();
	}
}