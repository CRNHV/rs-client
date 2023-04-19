package org.runestar.client.updater.mapper.identifiers.disabled

import org.objectweb.asm.Type
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2

@DependsOn(Coord::class)
class AbstractWorldMapIcon : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.instanceFields.size == 4 }
            .and { it.instanceFields.count { it.type == type<Coord>() } == 2 }
            .and { it.instanceFields.count { it.type == Type.INT_TYPE } == 2 }

//    @DependsOn(Coord::class)
//    class coord1 : OrderMapper.InConstructor.Field(AbstractWorldMapIcon::class, 0) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == type<Coord>() }
//    }
//
//    @DependsOn(Coord::class)
//    class coord2 : OrderMapper.InConstructor.Field(AbstractWorldMapIcon::class, 1) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == type<Coord>() }
//    }
//
//    @MethodParameters()
//    @DependsOn(WorldMapLabel::class)
//    class label : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == type<WorldMapLabel>() }
//    }
//
//    @MethodParameters()
//    class element : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == Type.INT_TYPE }
//                .and { Modifier.isPublic(it.access) && Modifier.isAbstract(it.access) }
//    }
}