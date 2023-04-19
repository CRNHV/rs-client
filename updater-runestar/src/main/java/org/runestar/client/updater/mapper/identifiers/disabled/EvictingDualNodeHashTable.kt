package org.runestar.client.updater.mapper.identifiers.disabled

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.identifiers.classes.DualNode
import org.runestar.client.updater.mapper.identifiers.classes.IterableDualNodeQueue
import org.runestar.client.updater.mapper.identifiers.classes.IterableNodeHashTable
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2

@DependsOn(IterableDualNodeQueue::class, DualNode::class, IterableNodeHashTable::class)
class EvictingDualNodeHashTable : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.instanceFields.count { it.type == type<DualNode>() } == 1 }
            .and { it.instanceFields.count { it.type == type<IterableDualNodeQueue>() } == 1 }
            .and { it.instanceFields.count { it.type == type<IterableNodeHashTable>() } == 1 }

//    @DependsOn(IterableNodeHashTable::class)
//    class hashTable : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == type<IterableNodeHashTable>() }
//    }
//
//    @DependsOn(IterableDualNodeQueue::class)
//    class deque : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == type<IterableDualNodeQueue>() }
//    }
//
//    @MethodParameters()
//    @DependsOn(IterableNodeHashTable::class, IterableNodeHashTable.clear::class)
//    class clear : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
//                .and { it.instructions.any { it.isMethod && it.methodId == method<IterableNodeHashTable.clear>().id } }
//    }
//
//
//    @MethodParameters("value", "key")
//    @DependsOn(DualNode::class)
//    class put : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
//                .and { it.arguments.startsWith(type<DualNode>(), LONG_TYPE) }
//    }
//
//    @MethodParameters("key")
//    class remove : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
//                .and { it.arguments.startsWith(LONG_TYPE) }
//    }
//
//    @MethodParameters("key")
//    @DependsOn(DualNode::class)
//    class get : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == type<DualNode>() }
//                .and { it.arguments.startsWith(LONG_TYPE) }
//    }
//
//    @DependsOn(clear::class)
//    class capacity : OrderMapper.InMethod.Field(clear::class, 0) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == GETFIELD && it.fieldType == INT_TYPE }
//    }
//
//    @DependsOn(clear::class)
//    class remainingCapacity : OrderMapper.InMethod.Field(clear::class, 0) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
//    }
}