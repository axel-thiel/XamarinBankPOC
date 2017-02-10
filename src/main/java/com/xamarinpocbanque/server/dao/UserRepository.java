package com.xamarinpocbanque.server.dao;

import org.springframework.data.repository.CrudRepository;
import com.xamarinpocbanque.server.entity.User;


public interface UserRepository extends CrudRepository<User, Long> {
	User findByLoginAndPassword (Long login, Long passWord);
}
