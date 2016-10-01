package com.fiap.ws.exemplos;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService(targetNamespace = "http://exemplos.ws.fiap.com/", portName = "ArquivoPort", serviceName = "ArquivoService")
public class Arquivo {
	
	@WebMethod
	public void upload(String fileName, byte[] imageByte) throws IOException {
		
		String filePath = "D:/Temp/Upload/" +fileName;
		
		FileOutputStream fos = new FileOutputStream(filePath);
		BufferedOutputStream ostream = new BufferedOutputStream(fos);
		ostream.write(imageByte);
		ostream.close();
	}
	
	public byte[] download(String fileName) throws IOException {
		String filePath = "D:/Temp/Download/" + fileName;
		
		File file = new File(filePath);
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream istream = new BufferedInputStream(fis);
		byte[] fileBytes = new byte[(int) file.length()];
		istream.read(fileBytes);
		istream.close();
		return fileBytes;
		
	}

}
