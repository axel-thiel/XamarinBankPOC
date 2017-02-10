package com.xamarinpocbanque.server.filter;

import com.xamarinpocbanque.server.entity.User;

public interface UserService {
	User findByLoginAndPassword (Long login, Long passWord);
}
