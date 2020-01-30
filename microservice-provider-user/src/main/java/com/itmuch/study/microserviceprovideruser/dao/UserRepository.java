package com.itmuch.study.microserviceprovideruser.dao;

import com.itmuch.study.microserviceprovideruser.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {

}
