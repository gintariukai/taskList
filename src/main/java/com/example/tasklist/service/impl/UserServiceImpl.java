package com.example.tasklist.service.impl;

import com.example.tasklist.domain.user.User;
import com.example.tasklist.service.UserService;

public class UserServiceImpl implements UserService {

    @Override
    public User getById(Long id) {
        return null;
    }

    @Override
    public User getByUsername(String username) {
        return null;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public User create(User user) {
        return null;
    }

    @Override
    public boolean isTaskOwner(Long UserId, Long taskId) {
        return false;
    }

    @Override
    public void delete(Long id) {

    }
}
