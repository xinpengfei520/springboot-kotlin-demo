package com.vance.kotlindemo.controller

import com.vance.kotlindemo.bean.Message
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController
import java.util.concurrent.atomic.AtomicLong

/**
 * MyController
 * @author Vance :)
 * @date 2022/7/2
 */

@RestController
class MyController {

    val counter = AtomicLong()

    @GetMapping("register")
    fun register(@RequestParam(value = "name", defaultValue = "default") name: String): Message =
        Message(counter.incrementAndGet(), "注册成功，$name")

}