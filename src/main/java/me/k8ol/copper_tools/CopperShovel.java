package me.k8ol.copper_tools;

import net.minecraft.item.ShovelItem;

public class CopperShovel extends ShovelItem {
    public CopperShovel(Settings settings) {
        super(CopperMaterial.INSTANCE, settings.attributeModifiers(createAttributeModifiers(CopperMaterial.INSTANCE, 3, -3.0F)));
    }
}
