package com.ryuandlee.nsurfer.user.infrastructure

import com.ryuandlee.nsurfer.user.domain.User
import org.springframework.data.jpa.repository.JpaRepository

interface UserRepository : JpaRepository<User, Long> {
}