package com.classiks.myamazingmod.init;

import com.classiks.myamazingmod.Myamazingmod;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ItemInit {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Myamazingmod.MODID);

    public static final RegistryObject<Item> EXAMPLE_ITEM = register("EXAMPLE", () -> new Item(new Item.Properties().tab(Myamazingmod.MyAmazingModTab)));

    private static <T extends Item> RegistryObject<T> register(final String name, final Supplier<T> item) {
        return ITEMS.register(name, item);
    }
}
