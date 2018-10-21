package com.titorialspoint.daoRepo;

import org.springframework.data.repository.CrudRepository;

import com.titorialspoint.model.User;

public interface daoRepo extends CrudRepository<User, Integer>{

}
