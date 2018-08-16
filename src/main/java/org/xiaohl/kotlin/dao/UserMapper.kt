package org.xiaohl.kotlin.dao

import org.xiaohl.kotlin.entity.User

/**
 *
 * @author 肖红亮
 * @since JDK1.8
 * @version 1.0.0.0
 */
interface UserMapper {

    /**
     * 获取用户列表信息
     */
    fun findList(): List<User>

    /**
     * 根据用户名称获取用户信息
     */
    fun findByName(name:String): User

    /**
     * 新增用户信息
     */
    fun insert(user: User)
}