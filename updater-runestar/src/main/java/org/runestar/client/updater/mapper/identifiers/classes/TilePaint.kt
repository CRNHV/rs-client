package org.runestar.client.updater.mapper.identifiers.classes

import org.objectweb.asm.Opcodes.PUTFIELD
import org.objectweb.asm.Type.BOOLEAN_TYPE
import org.objectweb.asm.Type.INT_TYPE
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.abstractclasses.OrderMapper
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.wrappers.Field2
import org.runestar.client.updater.mapper.wrappers.Instruction2

class TilePaint : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.interfaces.isEmpty() }
            .and { it.superType == Any::class.type }
            .and { it.instanceMethods.isEmpty() }
            .and { it.instanceFields.count { it.type == INT_TYPE } == 6 }
            .and { it.instanceFields.count { it.type == BOOLEAN_TYPE } == 1 }
            .and { it.instanceFields.size == 7 }

    class swColor : OrderMapper.InConstructor.Field(TilePaint::class, 0) {
        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class seColor : OrderMapper.InConstructor.Field(TilePaint::class, 1) {
        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class neColor : OrderMapper.InConstructor.Field(TilePaint::class, 2) {
        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class nwColor : OrderMapper.InConstructor.Field(TilePaint::class, 3) {
        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class texture : OrderMapper.InConstructor.Field(TilePaint::class, 4) {
        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class rgb : OrderMapper.InConstructor.Field(TilePaint::class, 5) {
        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class isFlat : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == BOOLEAN_TYPE }
    }
}