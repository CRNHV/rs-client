package org.runestar.client.updater.mapper.annotations

import org.runestar.client.updater.mapper.abstractclasses.Mapper
import java.lang.annotation.Inherited
import kotlin.reflect.KClass

@Inherited
@Target(AnnotationTarget.CLASS)
annotation class DependsOn(
        vararg val mappers: KClass<out Mapper<*>>
)