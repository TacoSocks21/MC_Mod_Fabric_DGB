package net.tacosocks.gaming_blocks.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.tacosocks.gaming_blocks.DecorativeGamingBlocks;

public class ModItemGroups {
    public static final ItemGroup DECORATIVE_GAMING_BLOCKS_GROUP = Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(DecorativeGamingBlocks.MOD_ID, "decorative_gaming_blocks"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.PC_KEYBOARD))
                    .displayName(Text.translatable("itemgroup.gaming_blocks.decorative_gaming_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.PC_KEYBOARD);
                        entries.add(ModItems.PC_MOUSE);
                    })
                    .build()
    );
    // src\main\resources\assets\<your_mod_name>\lang

    public static void registerItemGroups() {
        DecorativeGamingBlocks.LOGGER.info("Registering item groups for " + DecorativeGamingBlocks.MOD_ID);


    }
}
