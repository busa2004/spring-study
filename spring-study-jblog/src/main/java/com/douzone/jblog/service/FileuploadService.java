package com.douzone.jblog.service;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Calendar;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

@Service
public class FileuploadService {
	
	private static final String SAVE_PATH = "/uploads";
	private static final String URL = "/uploads/images";
	
	public String restore(MultipartFile multipartFile) {
		String url = "";
		try {
		if(multipartFile.isEmpty()) {
			return url; 
		}
		
		String originalFileName=multipartFile.getOriginalFilename();
		String extName = originalFileName.substring(originalFileName.lastIndexOf('.')+1);
		String saveFileName = generateSaveFileName(extName);
		long fileSize=multipartFile.getSize();
		
		System.out.println("_@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ " + originalFileName );
		System.out.println("_@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ " + extName );
		System.out.println("_@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ " + saveFileName );
		System.out.println("_@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@ " + fileSize );
		
		
		byte[] fileData = multipartFile.getBytes();
		OutputStream os =  new FileOutputStream(SAVE_PATH + "/" + saveFileName);
		os.write(fileData);
		os.close();
		url = URL + "/" + saveFileName;
		}catch(IOException ex) {
			new RuntimeException("upload fail");
		}
		//writeFile(multipartFile, saveFileName);
		return url;
	}

//	private void writeFile(MultipartFile multipartFile, String saveFileName) {
//		
//	}

	private String generateSaveFileName(String extName) {
		String fileName = "";
		Calendar calendar = Calendar.getInstance();
		
		fileName += calendar.get(Calendar.YEAR);
		fileName += calendar.get(Calendar.MONTH);
		fileName += calendar.get(Calendar.DATE);
		fileName += calendar.get(Calendar.HOUR);
		fileName += calendar.get(Calendar.MINUTE);
		fileName += calendar.get(Calendar.SECOND);
		fileName += calendar.get(Calendar.MILLISECOND);
		fileName += ("." + extName);
		
		
		
		return fileName;
	}

}
