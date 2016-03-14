package com.CombinationMode;

import java.util.ArrayList;

class Folder implements Node {
	private String folderName;
	private ArrayList nodeList = new ArrayList(); // 用于存储文件夹下的文件夹或文件的信息

	public Folder(String folderName) {
		this.folderName = folderName;
	}

	public void add(Node node) { // 增加文件或文件夹
		nodeList.add(node);
	}

	public void copy() { // 文件夹复制操作实现递归
		System.out.println("复制文件夹：" + folderName);
		for (int i = 0; i < nodeList.size(); i++) {
			Node node = (Node) nodeList.get(i);
			node.copy();
		}
	}
}
