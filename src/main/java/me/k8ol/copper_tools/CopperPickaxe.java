package me.k8ol.copper_tools;

import net.minecraft.item.PickaxeItem;

public class CopperPickaxe extends PickaxeItem {
    public CopperPickaxe(Settings settings) {
        super(CopperMaterial.INSTANCE, settings.attributeModifiers(createAttributeModifiers(CopperMaterial.INSTANCE, 3, -2.8F)));
    }
}
