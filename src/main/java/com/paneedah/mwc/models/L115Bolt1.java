// Date: 1/16/2017 12:15:09 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX


package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class L115Bolt1 extends ModelBase {
    //fields
    ModelRenderer gun1;
    ModelRenderer gun2;
    ModelRenderer gun3;
    ModelRenderer gun4;
    ModelRenderer gun5;
    ModelRenderer gun6;
    ModelRenderer gun7;
    ModelRenderer gun8;
    ModelRenderer gun9;

    public L115Bolt1() {
        textureWidth = 256;
        textureHeight = 128;

        gun1 = new ModelRenderer(this, 0, 100);
        gun1.addBox(0F, 0F, 0F, 1, 1, 5);
        gun1.setRotationPoint(2.3F, -16.8F, 5F);
        gun1.setTextureSize(64, 32);
        gun1.mirror = true;
        setRotation(gun1, 0F, 0F, 0F);
        gun2 = new ModelRenderer(this, 0, 100);
        gun2.addBox(0F, 0F, 0F, 2, 1, 5);
        gun2.setRotationPoint(1.5F, -15.8F, 5F);
        gun2.setTextureSize(64, 32);
        gun2.mirror = true;
        setRotation(gun2, 0F, 0F, 0F);
        gun3 = new ModelRenderer(this, 0, 100);
        gun3.addBox(0F, 0F, 0F, 1, 1, 5);
        gun3.setRotationPoint(2.5F, -16.6F, 5F);
        gun3.setTextureSize(64, 32);
        gun3.mirror = true;
        setRotation(gun3, 0F, 0F, 0F);
        gun4 = new ModelRenderer(this, 0, 100);
        gun4.addBox(0F, 0F, 0F, 1, 1, 8);
        gun4.setRotationPoint(1.9F, -16.6F, 0F);
        gun4.setTextureSize(64, 32);
        gun4.mirror = true;
        setRotation(gun4, 0F, 0F, 0F);
        gun5 = new ModelRenderer(this, 0, 100);
        gun5.addBox(0F, 0F, 0F, 1, 1, 2);
        gun5.setRotationPoint(1.9F, -16.6F, 5.9F);
        gun5.setTextureSize(64, 32);
        gun5.mirror = true;
        setRotation(gun5, 0F, 0F, 0F);
        gun6 = new ModelRenderer(this, 0, 100);
        gun6.addBox(0F, 0F, 0F, 1, 1, 2);
        gun6.setRotationPoint(1.7F, -16.8F, 8F);
        gun6.setTextureSize(64, 32);
        gun6.mirror = true;
        setRotation(gun6, 0F, 0F, 0F);
        gun7 = new ModelRenderer(this, 0, 100);
        gun7.addBox(0F, 0F, 0F, 1, 1, 8);
        gun7.setRotationPoint(1.9F, -15.8F, 0F);
        gun7.setTextureSize(64, 32);
        gun7.mirror = true;
        setRotation(gun7, 0F, 0F, 0F);
        gun8 = new ModelRenderer(this, 0, 100);
        gun8.addBox(0F, 0F, 0F, 1, 1, 8);
        gun8.setRotationPoint(2.3F, -16.6F, 0F);
        gun8.setTextureSize(64, 32);
        gun8.mirror = true;
        setRotation(gun8, 0F, 0F, 0F);
        gun9 = new ModelRenderer(this, 0, 100);
        gun9.addBox(0F, 0F, 0F, 1, 1, 8);
        gun9.setRotationPoint(2.4F, -15.8F, 0F);
        gun9.setTextureSize(64, 32);
        gun9.mirror = true;
        setRotation(gun9, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        gun1.render(f5);
        gun2.render(f5);
        gun3.render(f5);
        gun4.render(f5);
        gun5.render(f5);
        gun6.render(f5);
        gun7.render(f5);
        gun8.render(f5);
        gun9.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

}
