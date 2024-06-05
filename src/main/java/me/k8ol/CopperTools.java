package me.k8ol;

import me.k8ol.copper_tools.*;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CopperTools implements ModInitializer {
	public static final String MOD_ID = "copper_tools";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	public static final Item COPPER_STICK = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "copper_stick"), new Item(new Item.Settings().maxCount(64)));

	public static final ToolItem COPPER_SWORD = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "copper_sword"), new CopperSword(new Item.Settings()));
	public static final ToolItem COPPER_PICKAXE = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "copper_pickaxe"), new CopperPickaxe(new Item.Settings()));
	public static final ToolItem COPPER_AXE = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "copper_axe"), new CopperAxe(new Item.Settings()));
	public static final ToolItem COPPER_SHOVEL = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "copper_shovel"), new CopperShovel(new Item.Settings()));
	public static final ToolItem COPPER_HOE = Registry.register(Registries.ITEM, new Identifier(MOD_ID, "copper_hoe"), new CopperHoe(new Item.Settings()));

	public static final ItemGroup COPPER_ITEM_GROUP = FabricItemGroup.builder()
			.icon(() -> new ItemStack(Items.COPPER_INGOT))
			.displayName(Text.translatable("itemGroup.copper_tools.copper_group"))
			.entries((context, entries) -> {
				entries.add(COPPER_STICK);
				entries.add(COPPER_SWORD);
				entries.add(COPPER_PICKAXE);
				entries.add(COPPER_AXE);
				entries.add(COPPER_SHOVEL);
				entries.add(COPPER_HOE);
			})
			.build();

	@Override
	public void onInitialize() {
		Registry.register(Registries.ITEM_GROUP, new Identifier(MOD_ID, "copper_group"), COPPER_ITEM_GROUP);
		LOGGER.info("Copper tools mod loaded!");
	}
}