package org.runestar.client.updater.mapper.identifiers.disabled

import org.objectweb.asm.Type.INT_TYPE
import org.runestar.client.updater.mapper.abstractclasses.IdentityMapper
import org.runestar.client.updater.mapper.annotations.DependsOn
import org.runestar.client.updater.mapper.predicateutilities.and
import org.runestar.client.updater.mapper.predicateutilities.predicateOf
import org.runestar.client.updater.mapper.predicateutilities.type
import org.runestar.client.updater.mapper.wrappers.Class2

@DependsOn(Entity::class)
class WallDecoration : IdentityMapper.Class() {
    override val predicate = predicateOf<Class2> { it.superType == Any::class.type }
            .and { it.instanceFields.count { it.type == type<Entity>() } == 2 }
            .and { it.instanceFields.count { it.type == INT_TYPE } == 8 }

//    @DependsOn(Scene.newWallDecoration::class, Entity::class)
//    class entity1 : OrderMapper.InMethod.Field(Scene.newWallDecoration::class, 0) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == type<Entity>() }
//    }
//
//    @DependsOn(Scene.newWallDecoration::class, Entity::class)
//    class entity2 : OrderMapper.InMethod.Field(Scene.newWallDecoration::class, 1) {
//        override val predicate = predicateOf<Instruction2> { it.opcode == PUTFIELD && it.fieldType == type<Entity>() }
//    }
//
//    @DependsOn(Scene.newWallDecoration::class)
//    class tag : MethodPutField(Scene.newWallDecoration::class, 0, LONG_TYPE)
//
//    @DependsOn(Scene.newWallDecoration::class)
//    class flags : MethodPutField(Scene.newWallDecoration::class, 0, INT_TYPE)
//
//    @DependsOn(Scene.newWallDecoration::class)
//    class x : MethodPutField(Scene.newWallDecoration::class, 1, INT_TYPE)
//
//    @DependsOn(Scene.newWallDecoration::class)
//    class y : MethodPutField(Scene.newWallDecoration::class, 2, INT_TYPE)
//
//    @DependsOn(Scene.newWallDecoration::class)
//    class tileHeight : MethodPutField(Scene.newWallDecoration::class, 3, INT_TYPE)
//
//    // todo
//    @DependsOn(Scene.newWallDecoration::class)
//    class orientation : MethodPutField(Scene.newWallDecoration::class, 4, INT_TYPE)
//
//    // todo
//    @DependsOn(Scene.newWallDecoration::class)
//    class int7 : MethodPutField(Scene.newWallDecoration::class, 5, INT_TYPE)
//
//    @DependsOn(Scene.newWallDecoration::class)
//    class xOffset : MethodPutField(Scene.newWallDecoration::class, 6, INT_TYPE)
//
//    @DependsOn(Scene.newWallDecoration::class)
//    class yOffset : MethodPutField(Scene.newWallDecoration::class, 7, INT_TYPE)
}