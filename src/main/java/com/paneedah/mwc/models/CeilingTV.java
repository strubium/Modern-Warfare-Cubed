// Date: 2/18/2019 6:01:15 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX


package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class CeilingTV extends ModelBase {
    //fields
    ModelRenderer tv1;
    ModelRenderer tv2;
    ModelRenderer tv3;
    ModelRenderer tv4;
    ModelRenderer tv5;
    ModelRenderer tv6;
    ModelRenderer tv7;
    ModelRenderer tv8;

    public CeilingTV() {
        textureWidth = 256;
        textureHeight = 256;

        tv1 = new ModelRenderer(this, 0, 0);
        tv1.addBox(0F, 0F, 0F, 24, 1, 1);
        tv1.setRotationPoint(-12F, 6F, -5F);
        tv1.setTextureSize(256, 256);
        tv1.mirror = true;
        setRotation(tv1, 0.4089647F, 0F, 0F);
        tv2 = new ModelRenderer(this, 0, 0);
        tv2.addBox(0F, 1F, 0F, 1, 12, 1);
        tv2.setRotationPoint(-12F, 6F, -5F);
        tv2.setTextureSize(256, 256);
        tv2.mirror = true;
        setRotation(tv2, 0.4089647F, 0F, 0F);
        tv3 = new ModelRenderer(this, 0, 0);
        tv3.addBox(0F, 1F, 0F, 1, 12, 1);
        tv3.setRotationPoint(11F, 6F, -5F);
        tv3.setTextureSize(256, 256);
        tv3.mirror = true;
        setRotation(tv3, 0.4089647F, 0F, 0F);
        tv4 = new ModelRenderer(this, 0, 0);
        tv4.addBox(0F, 13F, 0F, 24, 1, 1);
        tv4.setRotationPoint(-12F, 6F, -5F);
        tv4.setTextureSize(256, 256);
        tv4.mirror = true;
        setRotation(tv4, 0.4089647F, 0F, 0F);
        tv5 = new ModelRenderer(this, 0, 0);
        tv5.addBox(0F, 0.5F, 0.5F, 23, 13, 1);
        tv5.setRotationPoint(-11.5F, 6F, -5F);
        tv5.setTextureSize(256, 256);
        tv5.mirror = true;
        setRotation(tv5, 0.4089647F, 0F, 0F);
        tv6 = new ModelRenderer(this, 0, 0);
        tv6.addBox(9F, 0.5F, 2.5F, 4, 4, 6);
        tv6.setRotationPoint(-11F, 9F, -5F);
        tv6.setTextureSize(256, 256);
        tv6.mirror = true;
        setRotation(tv6, 0.4089647F, 0F, 0F);
        tv7 = new ModelRenderer(this, 0, 0);
        tv7.addBox(9F, 0.5F, 2.5F, 3, 9, 3);
        tv7.setRotationPoint(-10.5F, 0.3F, -1.4F);
        tv7.setTextureSize(256, 256);
        tv7.mirror = true;
        setRotation(tv7, 0F, 0F, 0F);
        tv8 = new ModelRenderer(this, 0, 30);
        tv8.addBox(1F, 1F, 0.2F, 22, 12, 1);
        tv8.setRotationPoint(-12F, 6F, -5F);
        tv8.setTextureSize(256, 256);
        tv8.mirror = true;
        setRotation(tv8, 0.4089647F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        tv1.render(f5);
        tv2.render(f5);
        tv3.render(f5);
        tv4.render(f5);
        tv5.render(f5);
        tv6.render(f5);
        tv7.render(f5);
        tv8.render(f5);
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
