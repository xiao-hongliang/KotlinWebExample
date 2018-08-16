package org.xiaohl.kotlin.entity

import java.sql.Timestamp


/**
 * 旅客信息
 *
 * @author 肖红亮
 * @since JDK1.8
 * @version 1.0.0.0
 */
data class User (
        val id:Long,
        val name:String,
        val sex:String,
        var phone:String,
        val account:String,
        var createTime: Timestamp
)