// Date: 6/23/2019 2:26:27 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX


package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class M9Mag30 extends ModelBase {
    //fields
    ModelRenderer mag1;
    ModelRenderer mag2;
    ModelRenderer mag3;
    ModelRenderer mag4;

    public M9Mag30() {
        textureWidth = 128;
        textureHeight = 128;

        mag1 = new ModelRenderer(this, 0, 0);
        mag1.addBox(0F, 0F, 0F, 3, 25, 5);
        mag1.setRotationPoint(-3F, -5F, -5F);
        mag1.setTextureSize(128, 128);
        mag1.mirror = true;
        setRotation(mag1, 0.2230717F, 0F, 0F);
        mag2 = new ModelRenderer(this, 0, 0);
        mag2.addBox(0F, 0F, -0.5F, 2, 25, 1);
        mag2.setRotationPoint(-2.5F, -5F, -5F);
        mag2.setTextureSize(128, 128);
        mag2.mirror = true;
        setRotation(mag2, 0.2230717F, 0F, 0F);
        mag3 = new ModelRenderer(this, 0, 0);
        mag3.addBox(0F, 0F, 0F, 4, 2, 6);
        mag3.setRotationPoint(-3.5F, 18F, -0.5F);
        mag3.setTextureSize(128, 128);
        mag3.mirror = true;
        setRotation(mag3, 0F, 0F, 0F);
        mag4 = new ModelRenderer(this, 0, 0);
        mag4.addBox(0F, 0F, 0F, 3, 2, 7);
        mag4.setRotationPoint(-3F, 18F, -1.3F);
        mag4.setTextureSize(128, 128);
        mag4.mirror = true;
        setRotation(mag4, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        mag1.render(f5);
        mag2.render(f5);
        mag3.render(f5);
        mag4.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

    public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5, Entity entity) {
        super.setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    }

}
