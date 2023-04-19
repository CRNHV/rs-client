package org.runestar.client.updater.mapper.identifiers.disabled

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2
import org.objectweb.asm.Type
import java.lang.reflect.Modifier

class Bounds : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == Any::class.java.type }
            .and { it.interfaces.isEmpty() }
            .and { it.instanceFields.size == 4 }
            .and { it.instanceFields.all { it.type == Type.INT_TYPE } }
            .and { it.instanceMethods.size == 9 }
            .and { !Modifier.isAbstract(it.access) }

//    @MethodParameters("x", "y")
//    class setLocation : OrderMapper.InConstructor.Method(Bounds::class, 0, 2) {
//        override val constructorPredicate = predicateOf<Method2> { it.arguments.size == 4 }
//        override val predicate = predicateOf<Instruction2> { it.opcode == INVOKEVIRTUAL }
//    }

//    @MethodParameters("width", "height")
//    class setSize : OrderMapper.InConstructor.Method(Bounds::class, 1, 2) {
//        override val constructorPredicate = predicateOf<Method2> { it.arguments.size == 4 }
//        override val predicate = predicateOf<Instruction2> { it.opcode == INVOKEVIRTUAL }
//    }

//    @DependsOn(setLocation::class)
//    class x : OrderMapper.InMethod.Field(setLocation::class, 0, 2) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD }
//    }
//
//    @DependsOn(setLocation::class)
//    class y : OrderMapper.InMethod.Field(setLocation::class, 1, 2) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD }
//    }

//    @DependsOn(setSize::class)
//    class width : OrderMapper.InMethod.Field(setSize::class, 0, 2) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD }
//    }
//
//    @DependsOn(setSize::class)
//    class height : OrderMapper.InMethod.Field(setSize::class, 1, 2) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD }
//    }
}