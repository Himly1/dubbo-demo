package com.himly.service.impl;

import com.himly.model.User;
import com.himly.service.UserService;
import org.apache.log4j.Logger;

import java.util.List;

/**
 * create_at:MaZheng
 * create_by:${date} ${time}
 */
public class UserServiceImpl implements UserService {
    private static final Logger log = Logger.getLogger(UserServiceImpl.class);

    public User getUserById(Long id) throws Exception {
        log.info("id is=="+id);

        User user = new User();
        user.setName("马正");
        user.setId(12L);
        return user;
    }
}
