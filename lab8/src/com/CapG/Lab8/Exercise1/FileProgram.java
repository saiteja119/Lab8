package com.CapG.Lab8.Exercise1;
public class FileProgram {
	public static void main(String[] args) throws Exception {
		CopyDataThread cdt = new CopyDataThread();
		Thread t1 = new Thread(cdt);
		t1.start();
	}
}