package org.xiaohl.kotlin.controller

import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.RestController
import org.xiaohl.kotlin.entity.User
import org.xiaohl.kotlin.service.impl.IUserService
import javax.annotation.Resource

/**
 *
 * @author 肖红亮
 * @date 2018/6/29
 * @since JDK1.7
 */
@RestController()
@RequestMapping("/api/user")
class UserController {

    @Resource
    lateinit var userService: IUserService

    @RequestMapping("list")
    @ResponseBody
    fun list(): List<User> {
        return userService.findList()
    }

}