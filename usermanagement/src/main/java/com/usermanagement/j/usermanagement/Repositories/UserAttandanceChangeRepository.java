package com.usermanagement.j.usermanagement.Repositories;

import com.usermanagement.j.usermanagement.Entities.UserAttandanceChange;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserAttandanceChangeRepository extends CrudRepository<UserAttandanceChange, Long>{
    
}
