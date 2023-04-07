package com.jsp.idfcmock.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jsp.idfcmock.dto.MockDto;
@RestController
@Component
public class MockController {
	@Autowired
	MockDao mockDao;
	
	@PostMapping("/save")
	public void insert(@RequestBody MockDto dto) {
	mockDao.insert(dto);
	}
	@DeleteMapping("/del")
	public void delete(@RequestBody MockDto dto) {
	int id=	dto.getId();
	String s=mockDao.delete(dto);

	}
	@GetMapping("/get")
	public MockDto get(@RequestBody MockDto dto) {
		 MockDto dto1=mockDao.fetch(dto);
		return dto1;
		
	}

}
