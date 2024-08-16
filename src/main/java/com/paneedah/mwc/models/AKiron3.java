// Date: 4/22/2017 7:57:43 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX


package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class AKiron3 extends ModelBase {
    //fields
    ModelRenderer Iron1;
    ModelRenderer Iron2;
    ModelRenderer Iron3;
    ModelRenderer Iron4;
    ModelRenderer Iron5;
    ModelRenderer Iron6;
    ModelRenderer Iron7;

    public AKiron3() {
        textureWidth = 64;
        textureHeight = 32;

        Iron1 = new ModelRenderer(this, 0, 0);
        Iron1.addBox(0F, 0F, 0F, 2, 8, 1);
        Iron1.setRotationPoint(0F, -5F, 0F);
        Iron1.setTextureSize(64, 32);
        Iron1.mirror = true;
        setRotation(Iron1, 0F, 0F, 0F);
        Iron2 = new ModelRenderer(this, 0, 0);
        Iron2.addBox(0F, 0F, 0F, 2, 4, 2);
        Iron2.setRotationPoint(0F, -5F, 1F);
        Iron2.setTextureSize(64, 32);
        Iron2.mirror = true;
        setRotation(Iron2, 0F, 0F, 0F);
        Iron3 = new ModelRenderer(this, 0, 0);
        Iron3.addBox(0F, 0F, 0F, 2, 1, 8);
        Iron3.setRotationPoint(0F, -5F, 3F);
        Iron3.setTextureSize(64, 32);
        Iron3.mirror = true;
        setRotation(Iron3, -1.189716F, 0F, 0F);
        Iron4 = new ModelRenderer(this, 0, 0);
        Iron4.addBox(0F, 0F, 0F, 2, 2, 1);
        Iron4.setRotationPoint(0F, -3F, 2.8F);
        Iron4.setTextureSize(64, 32);
        Iron4.mirror = true;
        setRotation(Iron4, 0F, 0F, 0F);
        Iron5 = new ModelRenderer(this, 0, 0);
        Iron5.addBox(0F, 0F, 0F, 2, 1, 5);
        Iron5.setRotationPoint(0F, 2F, 1F);
        Iron5.setTextureSize(64, 32);
        Iron5.mirror = true;
        setRotation(Iron5, 0F, 0F, 0F);
        Iron6 = new ModelRenderer(this, 0, 0);
        Iron6.addBox(0F, 0F, 0F, 2, 2, 1);
        Iron6.setRotationPoint(0F, 0F, 4F);
        Iron6.setTextureSize(64, 32);
        Iron6.mirror = true;
        setRotation(Iron6, 0F, 0F, 0F);
        Iron7 = new ModelRenderer(this, 0, 0);
        Iron7.addBox(0F, 0F, 0F, 2, 1, 3);
        Iron7.setRotationPoint(0F, -1.5F, 1F);
        Iron7.setTextureSize(64, 32);
        Iron7.mirror = true;
        setRotation(Iron7, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        Iron1.render(f5);
        Iron2.render(f5);
        Iron3.render(f5);
        Iron4.render(f5);
        Iron5.render(f5);
        Iron6.render(f5);
        Iron7.render(f5);
    }

    private void setRotation(ModelRenderer model, float x, float y, float z) {
        model.rotateAngleX = x;
        model.rotateAngleY = y;
        model.rotateAngleZ = z;
    }

}
