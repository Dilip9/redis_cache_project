package com.gouri.rediscache.service;

import com.gouri.rediscache.dto.request.UserRequest;
import com.gouri.rediscache.dto.response.UserResponse;

public interface UserService {

    public UserResponse createUsers(UserRequest usersDto );

}
