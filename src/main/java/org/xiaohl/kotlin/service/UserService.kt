package org.xiaohl.kotlin.service

import org.springframework.stereotype.Service
import org.xiaohl.kotlin.dao.UserMapper
import org.xiaohl.kotlin.entity.User
import org.xiaohl.kotlin.service.impl.IUserService
import javax.annotation.Resource

/**
 *
 * @author 肖红亮
 * @since JDK1.8
 * @version 1.0.0.0
 */
@Service
class UserService: IUserService {

    @Resource
    lateinit var userMapper: UserMapper

    override fun findList(): List<User> {
        return userMapper.findList()
    }

    override fun findByName(name: String): User {
        return userMapper.findByName(name)
    }

}