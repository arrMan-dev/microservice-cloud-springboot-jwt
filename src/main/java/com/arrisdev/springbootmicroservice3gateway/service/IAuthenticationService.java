package com.arrisdev.springbootmicroservice3gateway.service;

import com.arrisdev.springbootmicroservice3gateway.model.User;

/**
 * @author arrisdev
 * @date 09.05.2021
 * @time 13:21
 */
public interface IAuthenticationService
{
    String signInAndReturnJWT(User signInRequest);
}
