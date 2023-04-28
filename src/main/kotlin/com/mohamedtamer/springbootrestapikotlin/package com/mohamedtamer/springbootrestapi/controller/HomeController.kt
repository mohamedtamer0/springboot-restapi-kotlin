package com.mohamedtamer.springbootrestapikotlin.`package com`.mohamedtamer.springbootrestapi.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class HomeController {
    @RequestMapping("/")
    fun home(): String {
        return "Hello World!"
    }
}