package org.runestar.client.updater.mapper.identifiers.classes

import org.objectweb.asm.Opcodes.*
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.wrappers.Class2
import org.objectweb.asm.Type.*
import org.runestar.client.updater.mapper.abstractclasses.OrderMapper
import org.runestar.client.updater.mapper.wrappers.Instruction2

@DependsOn(Enumerated::class)
class PlayerType : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.interfaces.contains(type<Enumerated>()) }
            .and { it.instanceFields.count { it.type == BOOLEAN_TYPE } == 2 }
            .and { it.instanceFields.count { it.type == INT_TYPE } == 2 }

    class id : OrderMapper.InConstructor.Field(PlayerType::class, 0) {
        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    // index into mod_icons sprites
    class modIcon : OrderMapper.InConstructor.Field(PlayerType::class, 1) {
        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    // is pmod or jmod
    class isPrivileged : OrderMapper.InConstructor.Field(PlayerType::class, 0) {
        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == BOOLEAN_TYPE }
    }

    // is not jmod
    class isUser : OrderMapper.InConstructor.Field(PlayerType::class, 1) {
        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == BOOLEAN_TYPE }
    }
}