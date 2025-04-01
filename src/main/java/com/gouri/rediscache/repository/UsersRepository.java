package com.gouri.rediscache.repository;

import com.gouri.rediscache.dto.response.UserResponse;
import com.gouri.rediscache.entity.Users;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<Users, Long> {

    @Cacheable(cacheNames = "userCache", key = "#email")
    Optional<UserResponse> findByEmailId(String email);


}
