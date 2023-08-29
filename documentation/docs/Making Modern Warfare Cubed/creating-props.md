---
pagination_next: null
pagination_prev: null
description: Creating Props with Modern Warfare Cubed
tags:
  - Assets
sidebar_class_name: assets
sidebar_position: 4
---

# Creating Props 

:::note

This assumes that you have set up the development environment

:::

:::caution

The Modern Warfare Cubed documentation is under construction.

Documenting things takes time, like a lot of time, so please be patient.

:::

Props are defined in the TileEntities.java file. Here is an example of a created prop.

        new LootBoxConfiguration()
        .withMaterial(Material.WOOD)
        .withName("supply_drop")
        .withModelClassName("com.paneedah.mwc.models.SupplyDrop")
        .withTextureName("textures/models/supplydrop.png")
        .withCreativeTab(ModernWarfareMod.PropsTab)
        .withPositioning(tileEntity -> {
            GL11.glScalef(0.5f, 0.5f, 0.5f);
            GL11.glTranslatef(0.2f, 1.63f, 1.7f);
            GL11.glRotatef(90F, 0f, 1f, 0f);
        })
        .withEquipmentOption(Guns.AK101, EnumDifficulty.EASY, 2f)
        .withEquipmentOption(Guns.M38, EnumDifficulty.EASY, 2f)
        .withEquipmentOption(Guns.APS, EnumDifficulty.EASY, 4f)
        .withEquipmentDispenseTimeout(10)
        .build(ModernWarfareMod.MOD_CONTEXT);

### LootBoxConfiguration()
The framework for a prop. All props are Loot Boxs as the have the function to give loot. 

### .withMaterial()
Defines what bullet sounds are made when prop is shot.

### .withName()
The name of the prop gets used in its ID. Ex: mwc:supply_drop

### .withModelClassName()

### .withTextureName()

##
