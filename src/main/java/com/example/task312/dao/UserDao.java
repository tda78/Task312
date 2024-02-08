package com.example.task312.dao;

import com.example.task312.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.List;
@Repository
public interface UserDao extends CrudRepository<User, Long> {
}
