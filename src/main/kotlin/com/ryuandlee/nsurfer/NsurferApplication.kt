package com.ryuandlee.nsurfer

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class NsurferApplication

fun main(args: Array<String>) {
    runApplication<NsurferApplication>(*args)
}
