package com.Lawtendo.Application;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Component
@Service
public class UserServiceImpl implements UserService {

//	@Autowired
	private UserRepo userRepo;
	
	@Override
	public Map<User, String> getUsers() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User get(String id) {
		
		return userRepo.findById(id).orElse(new User());
		
	}

	@Override
	public void delete(String id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(String id, User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public User create(User user) {
		// TODO Auto-generated method stub
		System.out.println(user);
		User userObj = userRepo.save(user);
		System.out.println(userObj);
		return userRepo.save(userObj);
		
	}

}
