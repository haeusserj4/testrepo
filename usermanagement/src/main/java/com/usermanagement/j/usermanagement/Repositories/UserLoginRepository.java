package com.usermanagement.j.usermanagement.Repositories;

import com.usermanagement.j.usermanagement.Entities.UserLogin;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserLoginRepository extends CrudRepository<UserLogin, Long>{
    
}


//public interface UserAccountRepository extends CrudRepository<UserAccount, Long> {