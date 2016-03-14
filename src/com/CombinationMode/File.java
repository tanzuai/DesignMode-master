package com.CombinationMode;

class File implements Node {
	private String fileName;

	public File(String fileName) {
		this.fileName = fileName;
	}

	public void copy() {
		System.out.println("¸´ÖÆÎÄ¼þ£º" + fileName);
	}
}