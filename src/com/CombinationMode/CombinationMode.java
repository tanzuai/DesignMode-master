package com.CombinationMode;

public class CombinationMode {
	public static void test() {
		Folder document = new Folder("我的资料"); // 我的资料文件夹
		File book = new File("Java编程思想.pdf"); // 文档文件
		Folder music = new Folder("我的音乐"); // 我的音乐文件夹
		File music1 = new File("你是我的眼.mp3"); // 音乐文件1
		File music2 = new File("Without You.mp3"); // 音乐文件2
		// 确定树形结构关系
		document.add(book);
		document.add(music);
		music.add(music1);
		music.add(music2);

		document.copy(); // 复制“我的资料”文件夹，递归地复制了其下所有文件夹和文件。
	}
}
