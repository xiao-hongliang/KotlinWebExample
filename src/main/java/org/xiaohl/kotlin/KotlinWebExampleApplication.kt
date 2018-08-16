package org.xiaohl.kotlin

import org.mybatis.spring.annotation.MapperScan
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

/**
 *
 * @author 肖红亮
 * @date 2018/6/29
 * @since JDK1.7
 */
@MapperScan("org.xiaohl.kotlin.dao")
@SpringBootApplication
class KotlinWebExampleApplication

fun main(args: Array<String>) {
    SpringApplication.run(KotlinWebExampleApplication::class.java, *args)
}
