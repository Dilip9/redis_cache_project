package com.gouri.rediscache.service;

import com.gouri.rediscache.dto.request.UserRequest;
import com.gouri.rediscache.dto.response.UserResponse;
import com.gouri.rediscache.entity.Users;

public interface UserService {

    Users createUsers(UserRequest usersDto );

    Users updateUsersProfileByEmailId(String email);
}
