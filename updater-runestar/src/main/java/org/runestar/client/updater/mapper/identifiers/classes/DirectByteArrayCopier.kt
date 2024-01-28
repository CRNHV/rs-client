package org.runestar.client.updater.mapper.identifiers.classes

import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.annotations.MethodParameters
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.wrappers.Field2
import org.runestar.client.updater.mapper.wrappers.Method2
import java.nio.ByteBuffer

@DependsOn(AbstractByteArrayCopier::class)
class DirectByteArrayCopier : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == type<AbstractByteArrayCopier>() }

    @MethodParameters()
    @DependsOn(AbstractByteArrayCopier.get::class)
    class get : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.mark == method<AbstractByteArrayCopier.get>().mark }
    }

    @MethodParameters("array")
    @DependsOn(AbstractByteArrayCopier.set::class)
    class set : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.mark == method<AbstractByteArrayCopier.set>().mark }
    }

    class directBuffer : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == ByteBuffer::class.type }
    }
}