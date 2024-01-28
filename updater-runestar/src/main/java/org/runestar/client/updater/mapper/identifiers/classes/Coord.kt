package org.runestar.client.updater.mapper.identifiers.classes

import org.objectweb.asm.Opcodes.GETFIELD
import org.objectweb.asm.Opcodes.IOR
import org.objectweb.asm.Type.BOOLEAN_TYPE
import org.objectweb.asm.Type.INT_TYPE
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.abstractclasses.OrderMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.annotations.MethodParameters
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.mark
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.wrappers.Instruction2
import org.runestar.client.updater.mapper.wrappers.Method2

class Coord : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.instanceFields.size == 3 }
            .and { it.instanceFields.all { it.type == INT_TYPE } }
            .and { it.instanceMethods.any { it.mark == Any::hashCode.mark } }

//    class set : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
//                .and { it.arguments.startsWith(INT_TYPE, INT_TYPE, INT_TYPE) }
//                .and { it.arguments.size in 3..4 }
//    }

    @DependsOn(toString0::class)
    class y : OrderMapper.InMethod.Field(toString0::class, 0) {
        override val predicate = predicateOf<Instruction2> { it.opcode == GETFIELD && it.fieldType == INT_TYPE }
    }

    @DependsOn(toString0::class)
    class x : OrderMapper.InMethod.Field(toString0::class, 1) {
        override val predicate = predicateOf<Instruction2> { it.opcode == GETFIELD && it.fieldType == INT_TYPE }
    }

    @DependsOn(toString0::class)
    class z : OrderMapper.InMethod.Field(toString0::class, 2) {
        override val predicate = predicateOf<Instruction2> { it.opcode == GETFIELD && it.fieldType == INT_TYPE }
    }

    @MethodParameters("separator")
    class toString0 : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == String::class.type }
                .and { it.arguments == listOf(String::class.type) }
    }

    @MethodParameters("other")
    class equals0 : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == BOOLEAN_TYPE }
                .and { it.arguments == listOf(type<Coord>()) }
    }

    @MethodParameters()
    class packed : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == INT_TYPE }
                .and { it.instructions.any { it.opcode == IOR } }
    }
}