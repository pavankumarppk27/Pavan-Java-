package com.hibernate.controller;

import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.method.annotation.StreamingResponseBody;

import com.hibernate.entity.Document;
import com.hibernate.repository.DocumentRepository;

@Controller
public class DocumentController {
	
	@Autowired
	private DocumentRepository documentRepo;
	
	
	@GetMapping("/documentUpload")
	public String documentUpload() {
		
		return "documentUpload";
	}
	
	@PostMapping("/upload")
	public String uploadDocument(@RequestParam("document") MultipartFile file,Model model) throws Exception {
		
		Document document=new Document();
		
		document.setName(file.getOriginalFilename());
		document.setData(file.getBytes());
		
		documentRepo.save(document);
		
		
		return "documentUpload";
	}
	@GetMapping("/displayData")
	public String displayData(Model model) {
		List<Document> allDocs = documentRepo.findAll();
		model.addAttribute("allDocs", allDocs);
		return "documentUpload";
	}
	
	
	@GetMapping("/download")
	public StreamingResponseBody downloadFile(@RequestParam("id") Integer id,HttpServletResponse res) {
		
		Document document = documentRepo.findById(id).get();
		byte[] data = document.getData();
		
		 res.setHeader("Content-disposition", "attachment; filename="+document.getName()+".txt");
		 	
		return outPutStream->{
			outPutStream.write(data);
		};
	}
	
}
