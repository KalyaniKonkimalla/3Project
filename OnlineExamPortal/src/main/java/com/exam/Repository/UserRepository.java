package com.exam.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.exam.Model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long>{

}
