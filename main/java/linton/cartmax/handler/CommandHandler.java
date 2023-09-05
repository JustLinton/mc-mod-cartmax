package linton.cartmax.handler;

import linton.cartmax.CartMax;
import linton.cartmax.entity.TestCart;
import net.fabricmc.fabric.api.command.v2.CommandRegistrationCallback;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.passive.VillagerEntity;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.text.Text;

import static net.minecraft.server.command.CommandManager.literal;

public class CommandHandler {

    private static void test(ServerPlayerEntity player){
//        VillagerEntity villagerEntity = new VillagerEntity(EntityType.VILLAGER,player.getWorld());

        TestCart cart = new TestCart(CartMax.TESTCART,player.getWorld());
        player.getWorld().spawnEntity(cart);

        cart.setPosition(player.getPos());
        player.startRiding(cart,true);
    }

    public static void register(){
        CommandRegistrationCallback.EVENT.register((dispatcher, registryAccess, environment) -> dispatcher.register(literal("test")
                .executes(context -> {
                    ServerPlayerEntity player = context.getSource().getPlayer();
                    player.sendMessage(Text.literal("你好，欢迎来到Fabric!"));

                    test(player);

                    return 1;
                })));
    }
}
