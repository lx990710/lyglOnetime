package com.jk.service;

import com.jk.model.User;

import java.util.List;

public interface DubboService {

    public List<User> queryUser(User User);

    public void addUser(User User);
}
