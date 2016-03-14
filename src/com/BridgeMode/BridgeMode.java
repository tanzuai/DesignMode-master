package com.BridgeMode;

public class BridgeMode {// 桥梁模式

	public static void test() {
		// 创建具体的实现对象
		MessageImplementor impl = new MessageSMS();
		// 创建普通消息对象
		AbstractMessage message = new CommonMessage(impl);
		message.sendMessage("加班申请速批", "李总");

		// 将实现方式切换成邮件，再次发送
		impl = new MessageEmail();
		// 创建加急消息对象
		message = new UrgencyMessage(impl);
		message.sendMessage("加班申请速批", "李总");
	}

}
