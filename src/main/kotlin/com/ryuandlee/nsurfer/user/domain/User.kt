package com.ryuandlee.nsurfer.user.domain

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.GenerationType.IDENTITY
import jakarta.persistence.Id
import jakarta.persistence.Table
import lombok.AccessLevel
import lombok.AccessLevel.PROTECTED
import lombok.Getter
import lombok.NoArgsConstructor


@NoArgsConstructor(access = PROTECTED)
@Getter
@Table(name = "users")
@Entity
class User (
    @Id @GeneratedValue(strategy = IDENTITY)
    private val id: Long,
    private val nickname: String,
    private val provider: String,
    private val email: String
){

}