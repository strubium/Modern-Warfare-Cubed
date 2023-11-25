package com.paneedah.mwc.models.props.gravestones;

import com.paneedah.mwc.models.IModernModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

/**
 * Made with Blockbench 4.8.1
 *
 * @author Developer: Desoroxx
 */
@SuppressWarnings({"FieldCanBeLocal", "NullableProblems"})
public final class CrossGravestone3 extends ModelBase implements IModernModel {

    private final ModelRenderer bone;
    private final ModelRenderer bone3;
    private final ModelRenderer bone4;

    public CrossGravestone3() {
        textureWidth = 64;
        textureHeight = 64;

        bone = new ModelRenderer(this);
        bone.setRotationPoint(-6.0F, 24.0F, -4.0F);
        bone.cubeList.add(new ModelBox(bone, 0, 6, 0.0F, -2.0F, 1.0F, 12, 2, 6, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 12, 14, 1.0F, -4.0F, 2.0F, 10, 2, 4, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 14, 4.5F, -24.0F, 2.5F, 3, 20, 3, 0.0F, false));
        bone.cubeList.add(new ModelBox(bone, 0, 0, -2.0F, -19.0F, 2.501F, 16, 3, 3, 0.0F, false));

        bone3 = new ModelRenderer(this);
        bone3.setRotationPoint(4.5F, -23.0F, 2.5F);
        bone.addChild(bone3);
        setRotationAngle(bone3, 0.0F, 0.0F, -1.9897F);
        bone3.cubeList.add(new ModelBox(bone3, 30, 6, -2.0F, -3.0F, 0.499F, 2, 3, 2, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 12, 28, -11.21F, -1.7368F, 0.499F, 2, 3, 2, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 20, 22, -6.4865F, 2.7744F, 0.5F, 3, 2, 2, 0.0F, false));
        bone3.cubeList.add(new ModelBox(bone3, 12, 20, -7.68F, -6.5F, 0.5F, 3, 2, 2, 0.0F, false));

        bone4 = new ModelRenderer(this);
        bone4.setRotationPoint(7.5F, -23.0F, 2.5F);
        bone.addChild(bone4);
        setRotationAngle(bone4, 0.0F, 0.0F, 1.9897F);
        bone4.cubeList.add(new ModelBox(bone4, 20, 30, 0.0F, -3.0F, 0.499F, 2, 3, 2, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 12, 24, 3.4859F, 2.7895F, 0.5F, 3, 2, 2, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 20, 26, 4.6981F, -6.4452F, 0.5F, 3, 2, 2, 0.0F, false));
        bone4.cubeList.add(new ModelBox(bone4, 28, 28, 9.1788F, -1.7008F, 0.499F, 2, 3, 2, 0.0F, false));
    }

    @Override
    public void render(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch, float scale) {
        bone.render(scale);
    }
}