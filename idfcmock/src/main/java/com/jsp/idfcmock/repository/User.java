package com.jsp.idfcmock.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jsp.idfcmock.dto.MockDto;

public interface User extends JpaRepository<MockDto, Integer>{

//	void save(MockDto dto);

}
