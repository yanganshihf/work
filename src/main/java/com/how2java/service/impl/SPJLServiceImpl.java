package com.how2java.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.how2java.mapper.SPJLMapper;
import com.how2java.pojo.SPJL;
import com.how2java.service.SPJLService;
@Service
public class SPJLServiceImpl implements SPJLService {
	@Autowired
	SPJLMapper spjlMapper;

	@Override
	public List<SPJL> list() {
		return spjlMapper.list();
	}

}
