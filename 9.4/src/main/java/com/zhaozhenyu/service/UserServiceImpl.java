package com.zhaozhenyu.service;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.zhaozhenyu.dao.UserDao;
@Service
public class UserServiceImpl implements UserService{
@Resource
private UserDao ud;
	@Override
	public List list(Map map) {
		// TODO Auto-generated method stub
		return ud.list(map);
	}

	
}
