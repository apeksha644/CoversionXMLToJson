package com.example;

import java.io.File;
import java.nio.file.Files;

import org.json.JSONObject;
import org.json.XML;

public class XJson 
{
	public static void main(String args[])throws Exception
	{
		File file1 =new File("employee.xml");
		
		byte [] b = Files.readAllBytes(file1.toPath());
		
		String xml = new String(b);
		
		JSONObject object = XML.toJSONObject(xml);
		
		System.out.println(object);
		
		
	}
}
