package me.k8ol.copper_tools;

import net.minecraft.item.AxeItem;

public class CopperAxe extends AxeItem {
    public CopperAxe(Settings settings) {
        super(CopperMaterial.INSTANCE, settings.attributeModifiers(createAttributeModifiers(CopperMaterial.INSTANCE, 8, -3.1F)));
    }
}
