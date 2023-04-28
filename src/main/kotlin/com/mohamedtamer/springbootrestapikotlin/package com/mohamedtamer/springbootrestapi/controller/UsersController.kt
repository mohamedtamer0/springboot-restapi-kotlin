package com.mohamedtamer.springbootrestapikotlin.`package com`.mohamedtamer.springbootrestapi.controller

import org.springframework.web.bind.annotation.*


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
    @GetMapping("/usersPath/{id}")
    fun helloPath(@PathVariable("id") uuid: String): String? {
        return "Hello!$uuid"
    }

    // Query Parameters
    @GetMapping("/usersQuery/{id}")
    fun helloQuery(
        @PathVariable("id") uuid: String?,
        @RequestParam name: String,
        @RequestParam(required = false, defaultValue = "", name = "email") userEmail: String
    ): String? {
        return "Hello!" + name + "__" + userEmail
    }
}