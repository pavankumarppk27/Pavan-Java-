package com.hibernate.controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hibernate.entity.ImageEntity;
import com.hibernate.repo.ImageRepository;

@RestController
public class ImageController {
	
	private static String UPLOADED_FOLDER = "C:\\Users\\pavan\\Downloads\\RRR.JPG";
	private static String READ_DATA = "F:\\New folder\\";

	
	@Autowired
	private ImageRepository repo;

	@GetMapping("/saveInput")
	public void saveImage() throws Exception {
		
		ImageEntity imageEntity=new ImageEntity();
		
		File file=new File(UPLOADED_FOLDER);
		byte[] fileContent=new byte[(int)file.length()];
		FileInputStream fileInputStream=new FileInputStream(file);
		fileInputStream.read(fileContent);
		
		imageEntity.setName("RRR IMAGE");
		imageEntity.setData(fileContent);
		
		repo.save(imageEntity);
		fileInputStream.close();
		 
	}
	
	@GetMapping("/readImage")
	public void readImage() throws Exception {
		
		ImageEntity imageEntity = repo.findById(2).get();
		
		File file=new File(READ_DATA+" movie"+".jpg");
		FileOutputStream fileOutPutStream=new FileOutputStream(file);
		fileOutPutStream.write(imageEntity.getData());
	    
		fileOutPutStream.close();
		
	}

}
