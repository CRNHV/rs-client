package org.runestar.client.updater.mapper.identifiers.disabled

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.identifiers.classes.AbstractSound
import org.runestar.client.updater.mapper.identifiers.classes.Node
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.wrappers.Class2

@DependsOn(Node::class, AbstractSound::class)
class PcmStream : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == type<Node>() }
            .and { it.instanceFields.any { it.type == type<AbstractSound>() } }

//    class active : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == BOOLEAN_TYPE }
//    }
//
//    @DependsOn(PcmStream::class)
//    class after : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == type<PcmStream>() }
//    }
//
//    @MethodParameters()
//    @DependsOn(PcmStreamMixer.firstSubStream::class)
//    class firstSubStream : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.mark == method<PcmStreamMixer.firstSubStream>().mark }
//    }
//
//    @MethodParameters()
//    @DependsOn(PcmStreamMixer.nextSubStream::class)
//    class nextSubStream : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.mark == method<PcmStreamMixer.nextSubStream>().mark }
//    }
//
//    @MethodParameters("buffer", "start", "end")
//    class fill : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
//                .and { it.arguments == listOf(IntArray::class.type, INT_TYPE, INT_TYPE) }
//                .and { Modifier.isAbstract(it.access) }
//    }
//
//    @MethodParameters("length")
//    class skip : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE && it.arguments == listOf(INT_TYPE) }
//    }
//
//    @MethodParameters("buffer", "start", "end")
//    class update : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
//                .and { it.arguments == listOf(IntArray::class.type, INT_TYPE, INT_TYPE) }
//                .and { Modifier.isFinal(it.access) }
//    }
//
//    @DependsOn(AbstractSound::class)
//    class sound : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == type<AbstractSound>() }
//    }
}