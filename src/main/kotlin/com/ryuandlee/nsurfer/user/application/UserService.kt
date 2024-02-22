package com.ryuandlee.nsurfer.user.application

import com.ryuandlee.nsurfer.user.infrastructure.UserRepository
import lombok.RequiredArgsConstructor
import org.springframework.stereotype.Service

@Service
@RequiredArgsConstructor
class UserService (
    private val userRepository: UserRepository
) {

}