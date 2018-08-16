package org.xiaohl.kotlin.service.impl

import org.springframework.stereotype.Service
import org.xiaohl.kotlin.dao.UserMapper
import org.xiaohl.kotlin.entity.User
import org.xiaohl.kotlin.service.IUserService
import java.sql.Timestamp
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

    override fun insert(user: User) {
        user.createTime = Timestamp(System.currentTimeMillis())
        user.phone = "111"
        userMapper.insert(user)
    }

}