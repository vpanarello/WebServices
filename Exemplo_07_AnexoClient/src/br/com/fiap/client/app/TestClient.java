package br.com.fiap.client.app;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import br.com.fiap.client.Arquivo;
import br.com.fiap.client.ArquivoService;
import br.com.fiap.client.IOException_Exception;

public class TestClient {
	
	public static void main(String[] args) throws IOException, IOException_Exception {
		
		// uploadFile();
		
		downloadFile();
		

		
	}

	private static void downloadFile() throws IOException_Exception, FileNotFoundException, IOException {
		ArquivoService service = new ArquivoService();
		Arquivo port = service.getArquivoPort();
		
		String fileName = "ryu.png";
		String filePath = "D:/" + fileName;
		
		byte[] fileBytes = port.download(fileName);
		
		FileOutputStream fos = new FileOutputStream(filePath);
		BufferedOutputStream ostream = new BufferedOutputStream(fos);
		ostream.write(fileBytes);
		ostream.close();
	}

	private static void uploadFile() throws FileNotFoundException, IOException, IOException_Exception {
		ArquivoService service = new ArquivoService();
		Arquivo port = service.getArquivoPort();
		
		String fileName = "ryu.png";
		String filePath = "D:/Temp/" + fileName;
		
		File file = new File(filePath);
		
		FileInputStream fis = new FileInputStream(file);
		BufferedInputStream iStream = new BufferedInputStream(fis);
		byte[] imageBytes = new byte[(int) file.length()];
		
		iStream.read(imageBytes);
		iStream.close();
		
		port.upload(fileName, imageBytes);
		System.out.println("Arquivo transferido");
	}

}
