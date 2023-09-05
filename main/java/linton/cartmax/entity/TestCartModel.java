package linton.cartmax.entity;

import linton.cartmax.CartMax;
import net.minecraft.client.model.*;
import net.minecraft.client.render.VertexConsumer;
import net.minecraft.client.render.entity.model.EntityModel;
import net.minecraft.client.render.entity.model.EntityModelPartNames;
import net.minecraft.client.render.entity.model.SinglePartEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.vehicle.MinecartEntity;
import org.spongepowered.include.com.google.common.collect.ImmutableList;

public class TestCartModel extends SinglePartEntityModel<TestCart> {

    private final ModelPart base;

    TestCartModel(ModelPart modelPart){
        this.base = modelPart;
    }


    public static TexturedModelData getTexturedModelData() {
        ModelData modelData = new ModelData();
        ModelPartData modelPartData = modelData.getRoot();
//        int i = true;
//        int j = true;
//        int k = true;
//        int l = true;
        modelPartData.addChild("bottom", ModelPartBuilder.create().uv(0, 10).cuboid(-10.0F, -8.0F, -1.0F, 20.0F, 16.0F, 2.0F), ModelTransform.of(0.0F, 4.0F, 0.0F, 1.5707964F, 0.0F, 0.0F));
        modelPartData.addChild("front", ModelPartBuilder.create().uv(0, 0).cuboid(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F), ModelTransform.of(-9.0F, 4.0F, 0.0F, 0.0F, 4.712389F, 0.0F));
        modelPartData.addChild("back", ModelPartBuilder.create().uv(0, 0).cuboid(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F), ModelTransform.of(9.0F, 4.0F, 0.0F, 0.0F, 1.5707964F, 0.0F));
        modelPartData.addChild("left", ModelPartBuilder.create().uv(0, 0).cuboid(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F), ModelTransform.of(0.0F, 4.0F, -7.0F, 0.0F, 3.1415927F, 0.0F));
        modelPartData.addChild("right", ModelPartBuilder.create().uv(0, 0).cuboid(-8.0F, -9.0F, -1.0F, 16.0F, 8.0F, 2.0F), ModelTransform.pivot(0.0F, 4.0F, 7.0F));
        return TexturedModelData.of(modelData, 64, 32);
    }

    @Override
    public void render(MatrixStack matrices, VertexConsumer vertices, int light, int overlay, float red, float green, float blue, float alpha) {
        ImmutableList.of(this.base).forEach((modelRenderer) -> {
            modelRenderer.render(matrices, vertices, light, overlay, red, green, blue, alpha);
        });
    }

    @Override
    public ModelPart getPart() {
        return this.base;
    }

    @Override
    public void setAngles(TestCart entity, float limbAngle, float limbDistance, float animationProgress, float headYaw, float headPitch) {

    }
}
