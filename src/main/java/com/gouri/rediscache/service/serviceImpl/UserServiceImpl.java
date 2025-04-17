package com.gouri.rediscache.service.serviceImpl;

import com.gouri.rediscache.dto.request.UserRequest;
import com.gouri.rediscache.entity.Users;
import com.gouri.rediscache.repository.UsersRepository;
import com.gouri.rediscache.service.UserService;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UsersRepository usersRepository;

    public UserServiceImpl(UsersRepository usersRepository){
        this.usersRepository = usersRepository;
    }

    @Override
    public Users createUsers(UserRequest usersDto) {
        return  usersRepository.save(mapToUsers(usersDto));

    }

    public Users mapToUsers(UserRequest userRequest){
        return Users.builder().id(userRequest.id()).username(userRequest.username()).emailId(userRequest.emailId()).build();
    }

    @Override
    public Users updateUsersProfileByEmailId(String email){

        return null; //usersRepository.
    }
}
