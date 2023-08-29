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
The framework for a prop. All props are Loot Boxs as they have the function of giving loot. 

### .withMaterial()
Defines what bullet sounds are made when the prop is shot.

### .withName()
The name of the prop gets used in its ID. Ex: mwc:supply_drop

### .withModelClassName()
The Icon of the prop

### .withTextureName()
The texture used to make the prop a 3D model

### .withCreativeTab()
The creative tab the prop will to stored under. Use PropsTab.

### .withBoundingBox()
Defines the Bounding box of a prop.

.withBoundingBox(0.3, 0, 0.3, 0.7, 3.5, 0.7)
.withBoundingBox(x1, y1, z1, x2, y2, z2)

### .withEquipentOption()
An item that will be given as loot

### .withEquipmentDispenseTimeout()
The cooldown between giving at item. 
