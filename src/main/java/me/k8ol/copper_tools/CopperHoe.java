package me.k8ol.copper_tools;

import net.minecraft.item.HoeItem;

public class CopperHoe extends HoeItem {
    public CopperHoe(Settings settings) {
        super(CopperMaterial.INSTANCE, settings.attributeModifiers(createAttributeModifiers(CopperMaterial.INSTANCE, 0, -1.0F)));
    }
}
