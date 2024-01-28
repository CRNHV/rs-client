package org.runestar.client.updater.mapper.identifiers.disabled

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2

@DependsOn(WorldMapLabelSize::class)
class WorldMapLabel : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.instanceFields.any { it.type == type<WorldMapLabelSize>() } }

//    class text : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == String::class.type }
//    }
//
//    class size : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == type<WorldMapLabelSize>() }
//    }
//
//    class width : OrderMapper.InConstructor.Field(WorldMapLabel::class, 0) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
//    }
//
//    class height : OrderMapper.InConstructor.Field(WorldMapLabel::class, 1) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
//    }
}