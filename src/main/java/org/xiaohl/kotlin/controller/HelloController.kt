package org.xiaohl.kotlin.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

/**
 *
 * @author 肖红亮
 * @date 2018/6/29
 * @since JDK1.7
 */
@RestController()
@RequestMapping("/api")
class HelloController {

    @RequestMapping("/hello")
    fun helloKotlin(): String {
        return "hello world!"
    }

}