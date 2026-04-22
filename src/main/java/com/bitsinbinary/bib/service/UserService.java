package com.bitsinbinary.bib.service;

import org.springframework.stereotype.Service;
import com.bitsinbinary.bib.dto.user.UserRequest;
import com.bitsinbinary.bib.dto.user.UserResponse;
import com.bitsinbinary.bib.entity.User;
import com.bitsinbinary.bib.mapper.UserMapper;
import com.bitsinbinary.bib.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public UserResponse createUser(UserRequest request) {
        User user = UserMapper.toUser(request);
        user = userRepository.save(user);
        return UserMapper.toResponse(user);
    }
}
