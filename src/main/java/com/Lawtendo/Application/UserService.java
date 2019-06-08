package com.Lawtendo.Application;

import java.util.Map;

public interface UserService {
	
	Map<User,String> getUsers();
	
	User get(String id);
	
	void delete(String id);
	
	void update(String id, User user);
	
	User create(User user);


}
