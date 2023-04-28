package com.mohamedtamer.springbootrestapikotlin.`package com`.mohamedtamer.springbootrestapi.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class UsersController {
    @GetMapping("/userget")
    fun helloGet(): String {
        return "Hello(Get)!"
    }

    @PostMapping("/userpost")
    fun helloPost(): String {
        return "Hello(Post)!"
    }


    // Path Parameters
    @GetMapping("/users/{id}")
    fun helloPath(@PathVariable("id") uuid: String): String? {
        return "Hello!$uuid"
    }
}