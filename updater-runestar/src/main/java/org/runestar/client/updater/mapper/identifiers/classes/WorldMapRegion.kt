package org.runestar.client.updater.mapper.identifiers.classes

import org.objectweb.asm.Opcodes.PUTFIELD
import org.objectweb.asm.Type.INT_TYPE
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.abstractclasses.OrderMapper
import org.runestar.client.updater.mapper.annotations.MethodParameters
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.wrappers.Instruction2
import org.runestar.client.updater.mapper.wrappers.Method2
import java.util.*
import kotlin.collections.HashMap

class WorldMapRegion : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.instanceFields.count { it.type == HashMap::class.type } == 2 }
            .and { it.instanceFields.count { it.type == LinkedList::class.type } == 1 }

    class x : OrderMapper.InConstructor.Field(WorldMapRegion::class, 0) {
        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class y : OrderMapper.InConstructor.Field(WorldMapRegion::class, 1) {
        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
    }

    class iconsList : OrderMapper.InConstructor.Field(WorldMapRegion::class, 0) {
        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == List::class.type }
    }

    class iconsMap : OrderMapper.InConstructor.Field(WorldMapRegion::class, 0) {
        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == HashMap::class.type }
    }

    class fonts : OrderMapper.InConstructor.Field(WorldMapRegion::class, 1) {
        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == HashMap::class.type }
    }

    @MethodParameters()
    class icons : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.arguments.size in 0..1 }
                .and { it.returnType == List::class.type }
    }
}