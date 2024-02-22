package com.ryuandlee.nsurfer.user.ui

import com.ryuandlee.nsurfer.user.application.UserService
import lombok.RequiredArgsConstructor
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequiredArgsConstructor
@RequestMapping("/user")
class UserController (
    private val userService: UserService
        ){
}