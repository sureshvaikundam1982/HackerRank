package com.example.pagination.service;

import com.example.pagination.PaginationApplication;
import com.example.pagination.model.User;
import com.example.pagination.repository.UserReposirtory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    final Logger logger = LoggerFactory.getLogger(UserService.class);

    @Autowired
    private UserReposirtory userRepository;

    public Page<User> getUsers(int page,int size){

        logger.info("User Service is called");

        Pageable pageable = PageRequest.of(page, size, Sort.by("username").ascending());

        return userRepository.findAll(pageable);
    }
}
