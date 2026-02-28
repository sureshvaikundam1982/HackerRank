package com.example.pagination.repository;

import com.example.pagination.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserReposirtory extends JpaRepository<User, Long> {

}
