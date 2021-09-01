package com.arrisdev.springbootmicroservice3gateway.service;

import com.arrisdev.springbootmicroservice3gateway.model.User;

import java.util.List;
import java.util.Optional;

/**
 * @author arrisdev
 * @date 09.06.2021
 * @time 12:11
 */
public interface IUserService
{
    User saveUser(User user);

    Optional<User> findBUsername(String username);

    List<User> findAllUsers();
}
