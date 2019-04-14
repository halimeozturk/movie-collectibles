package com.movie.Repository;

import com.movie.Model.User;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface UserRepository extends CrudRepository<User, String> {

    @Query("FROM User u WHERE u.email = ?1 and u.password = ?2")
    User findUser(String email, String password);


    @Modifying
    @Transactional
    @Query("UPDATE User c SET c.username = :username WHERE c.id = :id")
    void setUserUpdate(String id, String username);

}

