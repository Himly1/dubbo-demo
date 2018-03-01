package com.himly.service;

import com.himly.model.User;

/**
 * create_at:MaZheng
 * create_by:${date} ${time}
 */
public interface UserService {
    public User getUserById(Long id) throws Exception;
}
