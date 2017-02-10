package com.xamarinpocbanque.server.services.impl;

import javax.annotation.Resource;
import javax.transaction.Transactional;

import org.springframework.stereotype.Component;

import com.xamarinpocbanque.server.dao.UserRepository;
import com.xamarinpocbanque.server.entity.User;
import com.xamarinpocbanque.server.filter.UserService;

@Component()
@Transactional
public class UserServiceImpl implements UserService{

	@Resource
	UserRepository userRepository;
	
	@Override
	public User findByLoginAndPassword(Long login, Long passWord) {
		
		return userRepository.findByLoginAndPassword(login, passWord);		
	}
}
