package com.brautomatic.repository;

import com.brautomatic.model.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {

    @Query("from User u where u.username=:userName")
    User findUserByUserName(@Param("userName") String userName);
}
