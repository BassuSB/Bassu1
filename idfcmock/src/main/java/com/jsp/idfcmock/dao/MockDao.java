package com.jsp.idfcmock.dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.jsp.idfcmock.dto.MockDto;
import com.jsp.idfcmock.repository.User;
//import com.ty.springbootbasic.dto.StudentDto;

@Component
public class MockDao {
	@Autowired
	User user;
//	public Object save;

//	public void insert(MockDto dto) {
//		// TODO Auto-generated method stub
//		user.save(dto);
//	}

	public void insert(MockDto dto) {
		// TODO Auto-generated method stub
		user.save(dto);
	}

	public String delete(MockDto dto) {
		// TODO Auto-generated method stub
		user.delete(dto);
		return "deleted";
	}

	public MockDto fetch(MockDto dto) {
		// TODO Auto-generated method stub
	Optional<MockDto> dto2	=user.findById(dto.getId());
		return dto2.get();
	}
	
	
}
