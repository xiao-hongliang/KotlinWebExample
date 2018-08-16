package org.xiaohl.kotlin.service.impl

import org.xiaohl.kotlin.entity.User

/**
 *
 * @author 肖红亮
 * @since JDK1.8
 * @version 1.0.0.0
 */
interface IUserService {

    fun findList(): List<User>

    fun findByName(name:String): User
}