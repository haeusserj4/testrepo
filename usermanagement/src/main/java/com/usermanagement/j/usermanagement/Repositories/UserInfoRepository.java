package com.usermanagement.j.usermanagement.Repositories;

import com.usermanagement.j.usermanagement.Entities.UserInfo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoRepository extends CrudRepository<UserInfo, Long> {
    
}
