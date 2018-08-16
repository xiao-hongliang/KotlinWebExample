package org.xiaohl.kotlin.entity

import java.util.*

/**
 * 旅客信息
 *
 * @author 肖红亮
 * @since JDK1.8
 * @version 1.0.0.0
 */
data class User (
    val id:Int,
    val name:String,
    val sex:String,
    val phone:String,
    val account:String,
    val createTime:Date
)