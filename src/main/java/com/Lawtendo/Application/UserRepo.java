package com.Lawtendo.Application;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends CrudRepository<User, String>  {
		List<User> findByUserName();
}
