package linton.cartmax.entity;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.mob.MobEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.vehicle.AbstractMinecartEntity;
import net.minecraft.entity.vehicle.AbstractMinecartEntity.Type;
import net.minecraft.entity.vehicle.MinecartEntity;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.world.World;

public class TestCart extends MinecartEntity {
    public TestCart(EntityType<? extends MinecartEntity> entityType, World world) {
        super(entityType, world);
    }
//    public TestCart(EntityType<?> entityType, World world) {
//        super(entityType, world);
//    }
//
//
//    public TestCart(World world) {
//        super(EntityType.MINECART, world);
//    }

//    public ActionResult interact(PlayerEntity player, Hand hand) {
//        if (player.shouldCancelInteraction()) {
//            return ActionResult.PASS;
//        } else if (this.hasPassengers()) {
//            return ActionResult.PASS;
//        } else if (!this.getWorld().isClient) {
//            return player.startRiding(this) ? ActionResult.CONSUME : ActionResult.PASS;
//        } else {
//            return ActionResult.SUCCESS;
//        }
//    }

    public Item getItem() {
        return null;
    }

//    public void onActivatorRail(int x, int y, int z, boolean powered) {
//        if (powered) {
//            if (this.hasPassengers()) {
//                this.removeAllPassengers();
//            }
//
//            if (this.getDamageWobbleTicks() == 0) {
//                this.setDamageWobbleSide(-this.getDamageWobbleSide());
//                this.setDamageWobbleTicks(10);
//                this.setDamageWobbleStrength(50.0F);
//                this.scheduleVelocityUpdate();
//            }
//        }
//
//    }

    public AbstractMinecartEntity.Type getMinecartType() {
        return Type.RIDEABLE;
    }
}