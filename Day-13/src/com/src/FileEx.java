package com.src;

import java.io.FileWriter;

public class FileEx {
	public String display( String str)
	{
	
	try 
	{
		 FileWriter fw=new FileWriter("C:\\Users\\User\\test\\Anusha.txt");
		fw.write(str);
		fw.close();
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	return str;
	

}
}