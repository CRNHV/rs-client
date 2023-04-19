package org.runestar.client.updater.mapper.identifiers.classes

import org.objectweb.asm.Opcodes
import org.objectweb.asm.Type
import org.runestar.client.common.startsWith
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.abstractclasses.OrderMapper
import org.runestar.client.updater.mapper.annotations.MethodParameters
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2
import org.runestar.client.updater.mapper.wrappers.Field2
import org.runestar.client.updater.mapper.wrappers.Instruction2
import org.runestar.client.updater.mapper.wrappers.Method2
import java.io.IOException
import java.io.OutputStream

class BufferedSink : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.interfaces.contains(Runnable::class.type) }
            .and { it.superType == Any::class.type }
            .and { it.instanceFields.count { it.type == OutputStream::class.type } == 1 }

    class thread : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == Thread::class.type }
    }

    class outputStream : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == OutputStream::class.type }
    }

    class exception : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == IOException::class.type }
    }

    class buffer : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == ByteArray::class.type }
    }

    @MethodParameters()
    class close : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE }
                .and { it.instructions.any { it.isMethod && it.methodName == "join" } }
    }

    class position : OrderMapper.InConstructor.Field(BufferedSink::class, 0) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    class limit : OrderMapper.InConstructor.Field(BufferedSink::class, 1) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    class capacity : OrderMapper.InConstructor.Field(BufferedSink::class, 2) {
        override val predicate = predicateOf<Instruction2> { it.opcode == Opcodes.PUTFIELD && it.fieldType == Type.INT_TYPE }
    }

    class isClosed0 : IdentityMapper.InstanceField() {
        override val predicate = predicateOf<Field2> { it.type == Type.BOOLEAN_TYPE }
    }

    @MethodParameters()
    class isClosed : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.BOOLEAN_TYPE }
    }

    @MethodParameters("src", "srcIndex", "length")
    class write : IdentityMapper.InstanceMethod() {
        override val predicate = predicateOf<Method2> { it.returnType == Type.VOID_TYPE }
                .and { it.arguments.startsWith(ByteArray::class.type) }
    }
}