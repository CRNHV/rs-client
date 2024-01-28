package org.runestar.client.updater.mapper.identifiers.classes

import org.objectweb.asm.Type
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.annotations.MethodParameters
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.wrappers.Method2

class Timer : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.instanceFields.count { it.type == Type.LONG_TYPE } == 5 }
            .and { it.instanceFields.count { it.type == Type.BOOLEAN_TYPE } == 1 }

    @MethodParameters("packet")
    @DependsOn(Packet::class)
    class write : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.arguments == listOf(type<Packet>()) }
    }
}