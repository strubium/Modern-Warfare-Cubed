// Date: 2/16/2019 8:16:37 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX


package com.paneedah.mwc.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class DeskShelf extends ModelBase {
    //fields
    ModelRenderer shelf1;
    ModelRenderer shelf2;
    ModelRenderer shelf3;

    public DeskShelf() {
        textureWidth = 256;
        textureHeight = 256;

        shelf1 = new ModelRenderer(this, 0, 0);
        shelf1.addBox(0F, 0F, 0F, 16, 2, 8);
        shelf1.setRotationPoint(-8F, 15F, 0F);
        shelf1.setTextureSize(64, 32);
        shelf1.mirror = true;
        setRotation(shelf1, 0F, 0F, 0F);
        shelf2 = new ModelRenderer(this, 0, 50);
        shelf2.addBox(0F, 0F, 0F, 5, 2, 4);
        shelf2.setRotationPoint(-4.5F, 13F, 1F);
        shelf2.setTextureSize(64, 32);
        shelf2.mirror = true;
        setRotation(shelf2, 0F, -0.2974289F, 0F);
        shelf3 = new ModelRenderer(this, 0, 90);
        shelf3.addBox(0F, 0F, 0F, 6, 2, 4);
        shelf3.setRotationPoint(-6.1F, 11F, 2F);
        shelf3.setTextureSize(64, 32);
        shelf3.mirror = true;
        setRotation(shelf3, 0F, 0F, 0F);
    }

    public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
        super.render(entity, f, f1, f2, f3, f4, f5);
        setRotationAngles(f, f1, f2, f3, f4, f5, entity);
        shelf1.render(f5);
        shelf2.render(f5);
        shelf3.render(f5);
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
