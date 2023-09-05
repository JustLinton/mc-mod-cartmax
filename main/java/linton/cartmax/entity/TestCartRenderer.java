package linton.cartmax.entity;

import linton.cartmax.CartMax;
import net.minecraft.client.render.entity.EntityRendererFactory;
import net.minecraft.client.render.entity.MinecartEntityRenderer;
import net.minecraft.client.render.entity.model.EntityModelLayer;
import net.minecraft.util.Identifier;

public class TestCartRenderer extends MinecartEntityRenderer<TestCart> {
    public TestCartRenderer(EntityRendererFactory.Context context, EntityModelLayer layer) {
        super(context, layer);
    }

    @Override
    public Identifier getTexture(TestCart abstractMinecartEntity) {
        return super.getTexture(abstractMinecartEntity);
    }
}
