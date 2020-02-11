package com.CapG.Lab8.Exercise1;
import java.io.FileInputStream;
import java.io.FileOutputStream;
public class CopyDataThread extends Thread {
	void copyfileThread(String source,String target) throws Exception 
	{
		FileInputStream fis = new FileInputStream(source);
		FileOutputStream fos =new FileOutputStream(target);
		int data = 0;
		while(fis.available()!=0)
		{ 
			if((fis.available()) != 0)
			{
			for(int loop1=1;loop1<10;++loop1)
			{
			    data= fis.read();
				fos.write(data);
			}
			}
			//System.out.println("10 Characters are printed");
			//Thread.sleep(1*1000);
		}
		System.out.println("Mission Accomplished");
		fis.close();
		fos.close();
	}
	public void run()
	{		
		String source="C:\\Users\\sai teja\\eclipse-workspace\\lab8\\source.txt";
		String target ="C:\\Users\\sai teja\\eclipse-workspace\\lab8\\target.txt";
		try
		{
			copyfileThread(source, target);
		}
		catch(Exception e)
		{
			System.out.println("Exception:"+e);
		}
}
}