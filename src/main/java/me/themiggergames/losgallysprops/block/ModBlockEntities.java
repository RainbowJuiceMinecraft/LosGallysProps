package me.themiggergames.losgallysprops.block;

import me.themiggergames.losgallysprops.LosGallysProps;
import me.themiggergames.losgallysprops.block.trafficlightcontroller.TrafficLightControllerEntity;
import net.fabricmc.fabric.api.object.builder.v1.block.entity.FabricBlockEntityTypeBuilder;
import net.minecraft.block.entity.BlockEntityType;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class ModBlockEntities {
    public static BlockEntityType<TrafficLightControllerEntity> TRAFFIC_LIGHT_CONTROLLER_ENTITY = FabricBlockEntityTypeBuilder.create(TrafficLightControllerEntity::new, ModBlocks.TRAFFIC_LIGHT_CONTROLLER_BLOCK).build(null);
    public static BlockEntityType<TrafficLightControllerEntity> TRAFFIC_LIGHT_ENTITY = FabricBlockEntityTypeBuilder.create(TrafficLightControllerEntity::new, ModBlocks.MODERN_TRAFFIC_LIGHT).build(null);

    public static void registerBlockEntities(){
       registerBlockEntity("traffic_light_controller_entity", TRAFFIC_LIGHT_CONTROLLER_ENTITY);
       registerBlockEntity("traffic_light_entity", TRAFFIC_LIGHT_ENTITY);
    }
    public static BlockEntityType registerBlockEntity(String name, BlockEntityType block){
        return Registry.register(Registry.BLOCK_ENTITY_TYPE, new Identifier(LosGallysProps.MOD_ID, name), block);
    }
}
