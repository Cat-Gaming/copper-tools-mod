package me.k8ol.copper_tools;

import net.minecraft.item.SwordItem;

public class CopperSword extends SwordItem {
    public CopperSword(Settings settings) {
        super(CopperMaterial.INSTANCE, settings.attributeModifiers(createAttributeModifiers(CopperMaterial.INSTANCE, 5, -2.4F)));
    }
}
