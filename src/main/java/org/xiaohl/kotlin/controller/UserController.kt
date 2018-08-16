package org.xiaohl.kotlin.controller

import org.springframework.web.bind.annotation.*
import org.xiaohl.kotlin.entity.User
import org.xiaohl.kotlin.service.IUserService
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

    @RequestMapping("userInfo")
    @ResponseBody
    fun userInfo(name: String): User {
        return userService.findByName(name)
    }

    @PostMapping("insert")
    @ResponseBody
    fun insert(@RequestBody user: User): String {
        userService.insert(user)
        return "新增成功"
    }

}