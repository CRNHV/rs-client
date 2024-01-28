package org.runestar.client.updater.mapper.identifiers.disabled

import org.objectweb.asm.Type.*
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.wrappers.Class2

@DependsOn(TextureLoader::class)
class TextureProvider : IdentityMapper.Class() {

    override val predicate = predicateOf<Class2> { it.interfaces.contains(type<TextureLoader>()) }

//    @DependsOn(NodeDeque::class)
//    class deque : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == type<NodeDeque>() }
//    }
//
//    @DependsOn(AbstractArchive::class)
//    class archive : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == type<AbstractArchive>() }
//    }
//
//    @DependsOn(Texture::class)
//    class textures : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == type<Texture>().withDimensions(1) }
//    }
//
//    class brightness0 : IdentityMapper.InstanceField() {
//        override val predicate = predicateOf<Field2> { it.type == DOUBLE_TYPE }
//    }
//
//    @MethodParameters("brightness")
//    class setBrightness : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
//                .and { it.arguments.size in 1..2 }
//                .and { it.arguments.startsWith(DOUBLE_TYPE) }
//    }
//
//    @DependsOn(TextureLoader.load::class)
//    class load : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.mark == method<TextureLoader.load>().mark }
//    }
//
//    class textureSize : OrderMapper.InConstructor.Field(TextureProvider::class, -1) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
//    }
//
//    class remaining : OrderMapper.InConstructor.Field(TextureProvider::class, 0) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
//    }
//
////    class capacity : OrderMapper.InConstructor.Field(TextureProvider::class, 2) {
////        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == INT_TYPE }
////    }
//
//    class isLowDetail : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == BOOLEAN_TYPE }
//                .and { it.instructions.any { it.opcode == BIPUSH && it.intOperand == 64 } }
//    }
//
//    @MethodParameters()
//    class clear : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
//                .and { it.arguments.isEmpty() }
//    }
//
//    @MethodParameters("n")
//    class animate : IdentityMapper.InstanceMethod() {
//        override val predicate = predicateOf<Method2> { it.returnType == VOID_TYPE }
//                .and { it.arguments == listOf(INT_TYPE) }
//    }
}