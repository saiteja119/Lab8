package com.CapG.Lab8.Exercise2;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DisplayTimer implements Runnable {
	public void run() {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
		for(int time=0;time<10;time++)
		{
			try 
			{
				System.out.print(dtf.format(LocalDateTime.now())+"\r");
				Thread.sleep(10*1000);
			}
			catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public static void main(String[] args) {
		DisplayTimer dt = new DisplayTimer();
		Thread t =new Thread(dt);
		t.start();
	}
}
