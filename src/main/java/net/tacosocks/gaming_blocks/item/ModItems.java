package net.tacosocks.gaming_blocks.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.tacosocks.gaming_blocks.DecorativeGamingBlocks;

public class ModItems {
    private static Item registerItem(String name, Item item) {
        return Registry.register(
                Registries.ITEM,
                Identifier.of(DecorativeGamingBlocks.MOD_ID, name),
                item
        );
    }

    public static final Item PC_KEYBOARD = registerItem("pc_keyboard", new Item(new Item.Settings()));
    public static final Item PC_MOUSE = registerItem("pc_mouse", new Item(new Item.Settings()));

    public static void registerModItems() {
        DecorativeGamingBlocks.LOGGER.info("Registering items for " + DecorativeGamingBlocks.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(fabricItemGroupEntries -> {
            fabricItemGroupEntries.add(PC_KEYBOARD);
            fabricItemGroupEntries.add(PC_MOUSE);
        });
    }
}
