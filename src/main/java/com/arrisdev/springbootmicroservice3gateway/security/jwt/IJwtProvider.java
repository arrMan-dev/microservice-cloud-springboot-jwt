package com.arrisdev.springbootmicroservice3gateway.security.jwt;

import com.arrisdev.springbootmicroservice3gateway.security.UserPrincipal;
import org.springframework.security.core.Authentication;

import javax.servlet.http.HttpServletRequest;

/**
 * @author arrisedev
 * @date 09.05.2021
 * @time 12:48
 */
public interface IJwtProvider
{
    String generateToken(UserPrincipal authentication);

    Authentication getAuthentication(HttpServletRequest request);

    boolean isTokenValid(HttpServletRequest request);
}
