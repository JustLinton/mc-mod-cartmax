package linton.cartmax;

import linton.cartmax.entity.TestCart;
import linton.cartmax.entity.TestCartModel;
import linton.cartmax.entity.TestCartRenderer;
import linton.cartmax.handler.CommandHandler;
import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.client.rendereregistry.v1.EntityRendererRegistry;
import net.fabricmc.fabric.api.client.rendering.v1.EntityModelLayerRegistry;
import net.fabricmc.fabric.api.object.builder.v1.entity.FabricEntityTypeBuilder;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.client.render.entity.model.MinecartEntityModel;
import net.minecraft.entity.EntityDimensions;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.SpawnGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class CartMax implements ModInitializer {


    public static final EntityType<TestCart> TESTCART = Registry.register(
            Registries.ENTITY_TYPE,
            new Identifier("entitytesting", "cube"),
            FabricEntityTypeBuilder.create(SpawnGroup.MISC, TestCart::new).dimensions(EntityDimensions.fixed(0.75f, 0.75f)).build()
    );

    public static final EntityModelLayer MODEL_CUBE_LAYER = new EntityModelLayer(new Identifier("entitytesting", "cube"), "main");


//    MinecartEntityModel

    /**
     * Runs the mod initializer.
     */
    @Override
    public void onInitialize() {
        CommandHandler.register();



        EntityRendererRegistry.INSTANCE.register(CartMax.TESTCART, (context) -> {
            return new TestCartRenderer(context,MODEL_CUBE_LAYER);
        });

        EntityModelLayerRegistry.registerModelLayer(MODEL_CUBE_LAYER, TestCartModel::getTexturedModelData);
    }
}
