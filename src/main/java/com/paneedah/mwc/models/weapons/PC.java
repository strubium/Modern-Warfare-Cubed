package com.paneedah.mwc.models.weapons;

import com.paneedah.mwc.models.IModernModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.client.model.ModelBox;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.8.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class PC extends ModelBase implements IModernModel {
	private final ModelRenderer bone;
	private final ModelRenderer pc;
	private final ModelRenderer monitor;
	private final ModelRenderer Monitor9_r1;
	private final ModelRenderer mouse;
	private final ModelRenderer keyboard;
	private final ModelRenderer Keyboard2_r1;

	public PC() {
		textureWidth = 512;
		textureHeight = 512;

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.0F, 24.0F, 0.0F);
		

		pc = new ModelRenderer(this);
		pc.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(pc);
		pc.cubeList.add(new ModelBox(pc, 160, 100, -6.0F, -14.0F, 18.4F, 5, 5, 1, 0.0F, true));
		pc.cubeList.add(new ModelBox(pc, 0, 100, -10.0F, -20.0F, 19.0F, 19, 19, 8, 0.0F, true));
		pc.cubeList.add(new ModelBox(pc, 130, 100, 8.2F, -7.0F, 22.0F, 1, 2, 2, 0.0F, true));
		pc.cubeList.add(new ModelBox(pc, 100, 100, 8.1F, -19.0F, 19.5F, 1, 1, 7, 0.0F, true));
		pc.cubeList.add(new ModelBox(pc, 0, 100, -10.5F, -19.0F, 19.5F, 1, 17, 7, 0.0F, true));

		monitor = new ModelRenderer(this);
		monitor.setRotationPoint(2.7153F, -1.1688F, 0.0F);
		bone.addChild(monitor);
		monitor.cubeList.add(new ModelBox(monitor, 200, 0, -10.7153F, -0.8312F, -5.0F, 6, 1, 9, 0.0F, true));
		monitor.cubeList.add(new ModelBox(monitor, 200, 0, -8.7153F, -7.8312F, -2.0F, 1, 7, 3, 0.0F, true));

		Monitor9_r1 = new ModelRenderer(this);
		Monitor9_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		monitor.addChild(Monitor9_r1);
		setRotationAngle(Monitor9_r1, 0.0F, 0.0F, -0.1396F);
		Monitor9_r1.cubeList.add(new ModelBox(Monitor9_r1, 200, 0, -6.7F, -7.0F, -9.0F, 1, 1, 17, 0.0F, true));
		Monitor9_r1.cubeList.add(new ModelBox(Monitor9_r1, 200, 0, -6.7F, -20.0F, -9.0F, 1, 1, 17, 0.0F, true));
		Monitor9_r1.cubeList.add(new ModelBox(Monitor9_r1, 200, 0, -6.7F, -20.0F, -10.0F, 1, 14, 1, 0.0F, true));
		Monitor9_r1.cubeList.add(new ModelBox(Monitor9_r1, 200, 0, -6.7F, -20.0F, 8.0F, 1, 14, 1, 0.0F, true));
		Monitor9_r1.cubeList.add(new ModelBox(Monitor9_r1, 200, 40, -6.9F, -19.5F, -9.5F, 1, 13, 18, 0.0F, true));
		Monitor9_r1.cubeList.add(new ModelBox(Monitor9_r1, 200, 0, -7.5F, -19.5F, -9.5F, 1, 13, 18, 0.0F, true));
		Monitor9_r1.cubeList.add(new ModelBox(Monitor9_r1, 200, 0, -7.0F, -20.0F, -10.0F, 1, 14, 19, 0.0F, true));

		mouse = new ModelRenderer(this);
		mouse.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(mouse);
		mouse.cubeList.add(new ModelBox(mouse, 150, 30, -0.1F, -2.4F, 11.5F, 1, 1, 1, 0.0F, true));
		mouse.cubeList.add(new ModelBox(mouse, 150, 0, 0.0F, -2.0F, 10.5F, 4, 1, 3, 0.0F, true));
		mouse.cubeList.add(new ModelBox(mouse, 150, 0, 1.0F, -2.2F, 10.5F, 3, 1, 3, 0.0F, true));
		mouse.cubeList.add(new ModelBox(mouse, 150, 0, -0.1F, -2.2F, 10.5F, 1, 1, 1, 0.0F, true));
		mouse.cubeList.add(new ModelBox(mouse, 150, 0, -0.1F, -2.2F, 12.5F, 1, 1, 1, 0.0F, true));

		keyboard = new ModelRenderer(this);
		keyboard.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(keyboard);
		keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 3.7F, -2.4F, 5.5F, 1, 1, 2, 0.0F, true));
		keyboard.cubeList.add(new ModelBox(keyboard, 0, 0, -1.0F, -2.0F, -9.0F, 6, 1, 17, 0.0F, true));
		keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, -0.5F, -3.0F, -8.5F, 1, 1, 1, 0.0F, true));
		keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, -0.5F, -3.0F, -6.5F, 1, 1, 1, 0.0F, true));
		keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, -0.5F, -3.0F, -5.0F, 1, 1, 1, 0.0F, true));
		keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, -0.5F, -3.0F, -3.5F, 1, 1, 1, 0.0F, true));
		keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, -0.5F, -3.0F, -2.0F, 1, 1, 1, 0.0F, true));
		keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, -0.5F, -3.0F, -0.5F, 1, 1, 1, 0.0F, true));
		keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, -0.5F, -3.0F, 1.0F, 1, 1, 1, 0.0F, true));
		keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, -0.5F, -3.0F, 2.5F, 1, 1, 1, 0.0F, true));
		keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, -0.5F, -3.0F, 6.5F, 1, 1, 1, 0.0F, true));
		keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, -0.5F, -3.0F, 5.0F, 1, 1, 1, 0.0F, true));
		keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 1.3F, -2.8F, -8.5F, 1, 1, 1, 0.0F, true));
		keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 1.3F, -2.8F, -7.0F, 1, 1, 1, 0.0F, true));
		keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 1.3F, -2.8F, -5.5F, 1, 1, 1, 0.0F, true));
		keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 1.3F, -2.8F, -4.0F, 1, 1, 1, 0.0F, true));
		keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 1.3F, -2.8F, -2.5F, 1, 1, 1, 0.0F, true));
		keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 1.3F, -2.8F, -1.0F, 1, 1, 1, 0.0F, true));
		keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 1.3F, -2.8F, 0.5F, 1, 1, 1, 0.0F, true));
		keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 1.3F, -2.8F, 2.0F, 1, 1, 1, 0.0F, true));
		keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 1.3F, -2.8F, 3.5F, 1, 1, 1, 0.0F, true));
		keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 1.3F, -2.8F, 5.0F, 1, 1, 1, 0.0F, true));
		keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 1.3F, -2.8F, 6.5F, 1, 1, 1, 0.0F, true));
		keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 2.5F, -2.6F, -8.5F, 1, 1, 2, 0.0F, true));
		keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 2.5F, -2.6F, -6.0F, 1, 1, 1, 0.0F, true));
		keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 2.5F, -2.6F, -4.5F, 1, 1, 1, 0.0F, true));
		keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 2.5F, -2.6F, -3.0F, 1, 1, 1, 0.0F, true));
		keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 2.5F, -2.6F, -1.5F, 1, 1, 1, 0.0F, true));
		keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 2.5F, -2.6F, 0.0F, 1, 1, 1, 0.0F, true));
		keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 2.5F, -2.6F, 1.5F, 1, 1, 1, 0.0F, true));
		keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 2.5F, -2.6F, 3.0F, 1, 1, 1, 0.0F, true));
		keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 2.5F, -2.6F, 4.5F, 1, 1, 1, 0.0F, true));
		keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 2.5F, -2.6F, 6.0F, 1, 1, 1, 0.0F, true));
		keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 3.7F, -2.4F, -8.5F, 1, 1, 1, 0.0F, true));
		keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 3.7F, -2.4F, -7.0F, 1, 1, 1, 0.0F, true));
		keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 3.7F, -2.4F, -5.5F, 1, 1, 1, 0.0F, true));
		keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 3.7F, -2.4F, -4.0F, 1, 1, 6, 0.0F, true));
		keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 3.7F, -2.4F, 2.5F, 1, 1, 1, 0.0F, true));
		keyboard.cubeList.add(new ModelBox(keyboard, 100, 0, 3.7F, -2.4F, 4.0F, 1, 1, 1, 0.0F, true));

		Keyboard2_r1 = new ModelRenderer(this);
		Keyboard2_r1.setRotationPoint(-0.4804F, 0.1039F, 0.0F);
		keyboard.addChild(Keyboard2_r1);
		setRotationAngle(Keyboard2_r1, 0.0F, 0.0F, 0.1571F);
		Keyboard2_r1.cubeList.add(new ModelBox(Keyboard2_r1, 0, 0, -0.9F, -3.0F, -9.0F, 6, 1, 17, 0.0F, true));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		bone.render(f5);
	}
}