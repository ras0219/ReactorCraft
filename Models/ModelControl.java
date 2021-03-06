/*******************************************************************************
 * @author Reika Kalseki
 * 
 * Copyright 2014
 * 
 * All rights reserved.
 * Distribution of the software in any form is only allowed with
 * explicit, prior permission from the owner.
 ******************************************************************************/
// Date: 30/01/2014 7:42:13 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX

package Reika.ReactorCraft.Models;

import java.util.ArrayList;

import net.minecraft.client.model.ModelRenderer;

import org.lwjgl.opengl.GL11;

import Reika.RotaryCraft.Base.RotaryModelBase;

public class ModelControl extends RotaryModelBase
{
	//fields
	ModelRenderer Shape1;
	ModelRenderer Shape2;
	ModelRenderer Shape2a;
	ModelRenderer Shape3;
	ModelRenderer Shape3a;
	ModelRenderer Shape4;
	ModelRenderer Shape4a;
	ModelRenderer Shape4b;
	ModelRenderer Shape5;
	ModelRenderer Shape5a;
	ModelRenderer Shape5b;
	ModelRenderer Shape5c;
	ModelRenderer Shape5d;
	ModelRenderer Shape5e;
	ModelRenderer Shape5f;
	ModelRenderer Shape5g;
	ModelRenderer Shape5h;
	ModelRenderer Shape5i;
	ModelRenderer Shape5j;
	ModelRenderer Shape5k;
	ModelRenderer Shape6;
	ModelRenderer Shape6a;
	ModelRenderer Shape6b;
	ModelRenderer Shape6c;
	ModelRenderer Shape6d;
	ModelRenderer Shape6e;
	ModelRenderer Shape6f;
	ModelRenderer Shape6g;
	ModelRenderer Shape6h;
	ModelRenderer Shape6u;
	ModelRenderer Shape6i;
	ModelRenderer Shape6j;
	ModelRenderer Shape6k;
	ModelRenderer Shape6l;
	ModelRenderer Shape6m;
	ModelRenderer Shape6n;
	ModelRenderer Shape7;
	ModelRenderer Shape7a;
	ModelRenderer Shape7b;
	ModelRenderer Shape7c;
	ModelRenderer Shape8;
	ModelRenderer Shape9;
	ModelRenderer Shape9a;

	public ModelControl()
	{
		textureWidth = 128;
		textureHeight = 128;

		Shape1 = new ModelRenderer(this, 0, 0);
		Shape1.addBox(0F, 0F, 0F, 16, 1, 16);
		Shape1.setRotationPoint(-8F, 23F, -8F);
		Shape1.setTextureSize(128, 128);
		Shape1.mirror = true;
		this.setRotation(Shape1, 0F, 0F, 0F);
		Shape2 = new ModelRenderer(this, 38, 19);
		Shape2.addBox(0F, 0F, 0F, 2, 15, 16);
		Shape2.setRotationPoint(6F, 8F, -8F);
		Shape2.setTextureSize(128, 128);
		Shape2.mirror = true;
		this.setRotation(Shape2, 0F, 0F, 0F);
		Shape2a = new ModelRenderer(this, 0, 19);
		Shape2a.addBox(0F, 0F, 0F, 2, 15, 16);
		Shape2a.setRotationPoint(-8F, 8F, -8F);
		Shape2a.setTextureSize(128, 128);
		Shape2a.mirror = true;
		this.setRotation(Shape2a, 0F, 0F, 0F);
		Shape3 = new ModelRenderer(this, 29, 52);
		Shape3.addBox(0F, 0F, 0F, 12, 15, 2);
		Shape3.setRotationPoint(-6F, 8F, 6F);
		Shape3.setTextureSize(128, 128);
		Shape3.mirror = true;
		this.setRotation(Shape3, 0F, 0F, 0F);
		Shape3a = new ModelRenderer(this, 0, 52);
		Shape3a.addBox(0F, 0F, 0F, 12, 15, 2);
		Shape3a.setRotationPoint(-6F, 8F, -8F);
		Shape3a.setTextureSize(128, 128);
		Shape3a.mirror = true;
		this.setRotation(Shape3a, 0F, 0F, 0F);
		Shape4 = new ModelRenderer(this, 0, 71);
		Shape4.addBox(0F, 0F, 0F, 1, 15, 12);
		Shape4.setRotationPoint(3F, 8F, -6F);
		Shape4.setTextureSize(128, 128);
		Shape4.mirror = true;
		this.setRotation(Shape4, 0F, 0F, 0F);
		Shape4a = new ModelRenderer(this, 0, 71);
		Shape4a.addBox(0F, 0F, 0F, 1, 15, 12);
		Shape4a.setRotationPoint(-4F, 8F, -6F);
		Shape4a.setTextureSize(128, 128);
		Shape4a.mirror = true;
		this.setRotation(Shape4a, 0F, 0F, 0F);
		Shape4b = new ModelRenderer(this, 0, 99);
		Shape4b.addBox(0F, 0F, 0F, 2, 15, 12);
		Shape4b.setRotationPoint(-1F, 8F, -6F);
		Shape4b.setTextureSize(128, 128);
		Shape4b.mirror = true;
		this.setRotation(Shape4b, 0F, 0F, 0F);
		Shape5 = new ModelRenderer(this, 66, 0);
		Shape5.addBox(0F, 0F, 0F, 2, 15, 1);
		Shape5.setRotationPoint(4F, 8F, -4F);
		Shape5.setTextureSize(128, 128);
		Shape5.mirror = true;
		this.setRotation(Shape5, 0F, 0F, 0F);
		Shape5a = new ModelRenderer(this, 74, 0);
		Shape5a.addBox(0F, 0F, 0F, 2, 15, 2);
		Shape5a.setRotationPoint(-6F, 8F, -1F);
		Shape5a.setTextureSize(128, 128);
		Shape5a.mirror = true;
		this.setRotation(Shape5a, 0F, 0F, 0F);
		Shape5b = new ModelRenderer(this, 66, 0);
		Shape5b.addBox(0F, 0F, 0F, 2, 15, 1);
		Shape5b.setRotationPoint(-3F, 8F, -4F);
		Shape5b.setTextureSize(128, 128);
		Shape5b.mirror = true;
		this.setRotation(Shape5b, 0F, 0F, 0F);
		Shape5c = new ModelRenderer(this, 66, 0);
		Shape5c.addBox(0F, 0F, 0F, 2, 15, 1);
		Shape5c.setRotationPoint(1F, 8F, -4F);
		Shape5c.setTextureSize(128, 128);
		Shape5c.mirror = true;
		this.setRotation(Shape5c, 0F, 0F, 0F);
		Shape5d = new ModelRenderer(this, 66, 0);
		Shape5d.addBox(0F, 0F, 0F, 2, 15, 1);
		Shape5d.setRotationPoint(-6F, 8F, -4F);
		Shape5d.setTextureSize(128, 128);
		Shape5d.mirror = true;
		this.setRotation(Shape5d, 0F, 0F, 0F);
		Shape5e = new ModelRenderer(this, 66, 0);
		Shape5e.addBox(0F, 0F, 0F, 2, 15, 1);
		Shape5e.setRotationPoint(-6F, 8F, 3F);
		Shape5e.setTextureSize(128, 128);
		Shape5e.mirror = true;
		this.setRotation(Shape5e, 0F, 0F, 0F);
		Shape5f = new ModelRenderer(this, 66, 0);
		Shape5f.addBox(0F, 0F, 0F, 2, 15, 1);
		Shape5f.setRotationPoint(-3F, 8F, 3F);
		Shape5f.setTextureSize(128, 128);
		Shape5f.mirror = true;
		this.setRotation(Shape5f, 0F, 0F, 0F);
		Shape5g = new ModelRenderer(this, 66, 0);
		Shape5g.addBox(0F, 0F, 0F, 2, 15, 1);
		Shape5g.setRotationPoint(1F, 8F, 3F);
		Shape5g.setTextureSize(128, 128);
		Shape5g.mirror = true;
		this.setRotation(Shape5g, 0F, 0F, 0F);
		Shape5h = new ModelRenderer(this, 66, 0);
		Shape5h.addBox(0F, 0F, 0F, 2, 15, 1);
		Shape5h.setRotationPoint(4F, 8F, 3F);
		Shape5h.setTextureSize(128, 128);
		Shape5h.mirror = true;
		this.setRotation(Shape5h, 0F, 0F, 0F);
		Shape5i = new ModelRenderer(this, 74, 0);
		Shape5i.addBox(0F, 0F, 0F, 2, 15, 2);
		Shape5i.setRotationPoint(4F, 8F, -1F);
		Shape5i.setTextureSize(128, 128);
		Shape5i.mirror = true;
		this.setRotation(Shape5i, 0F, 0F, 0F);
		Shape5j = new ModelRenderer(this, 74, 0);
		Shape5j.addBox(0F, 0F, 0F, 2, 15, 2);
		Shape5j.setRotationPoint(1F, 8F, -1F);
		Shape5j.setTextureSize(128, 128);
		Shape5j.mirror = true;
		this.setRotation(Shape5j, 0F, 0F, 0F);
		Shape5k = new ModelRenderer(this, 74, 0);
		Shape5k.addBox(0F, 0F, 0F, 2, 15, 2);
		Shape5k.setRotationPoint(-3F, 8F, -1F);
		Shape5k.setTextureSize(128, 128);
		Shape5k.mirror = true;
		this.setRotation(Shape5k, 0F, 0F, 0F);
		Shape6 = new ModelRenderer(this, 84, 0);
		Shape6.addBox(0F, 0F, 0F, 2, 17, 2);
		Shape6.setRotationPoint(4F, 6F, -3F);
		Shape6.setTextureSize(128, 128);
		Shape6.mirror = true;
		this.setRotation(Shape6, 0F, 0F, 0F);
		Shape6a = new ModelRenderer(this, 84, 0);
		Shape6a.addBox(0F, 0F, 0F, 2, 17, 2);
		Shape6a.setRotationPoint(-6F, 6F, -6F);
		Shape6a.setTextureSize(128, 128);
		Shape6a.mirror = true;
		this.setRotation(Shape6a, 0F, 0F, 0F);
		Shape6b = new ModelRenderer(this, 84, 0);
		Shape6b.addBox(0F, 0F, 0F, 2, 17, 2);
		Shape6b.setRotationPoint(-3F, 6F, -6F);
		Shape6b.setTextureSize(128, 128);
		Shape6b.mirror = true;
		this.setRotation(Shape6b, 0F, 0F, 0F);
		Shape6c = new ModelRenderer(this, 84, 0);
		Shape6c.addBox(0F, 0F, 0F, 2, 17, 2);
		Shape6c.setRotationPoint(-6F, 6F, 4F);
		Shape6c.setTextureSize(128, 128);
		Shape6c.mirror = true;
		this.setRotation(Shape6c, 0F, 0F, 0F);
		Shape6d = new ModelRenderer(this, 84, 0);
		Shape6d.addBox(0F, 0F, 0F, 2, 17, 2);
		Shape6d.setRotationPoint(4F, 6F, -6F);
		Shape6d.setTextureSize(128, 128);
		Shape6d.mirror = true;
		this.setRotation(Shape6d, 0F, 0F, 0F);
		Shape6e = new ModelRenderer(this, 84, 0);
		Shape6e.addBox(0F, 0F, 0F, 2, 17, 2);
		Shape6e.setRotationPoint(1F, 6F, -6F);
		Shape6e.setTextureSize(128, 128);
		Shape6e.mirror = true;
		this.setRotation(Shape6e, 0F, 0F, 0F);
		Shape6f = new ModelRenderer(this, 84, 0);
		Shape6f.addBox(0F, 0F, 0F, 2, 17, 2);
		Shape6f.setRotationPoint(1F, 6F, -3F);
		Shape6f.setTextureSize(128, 128);
		Shape6f.mirror = true;
		this.setRotation(Shape6f, 0F, 0F, 0F);
		Shape6g = new ModelRenderer(this, 84, 0);
		Shape6g.addBox(0F, 0F, 0F, 2, 17, 2);
		Shape6g.setRotationPoint(-3F, 6F, -3F);
		Shape6g.setTextureSize(128, 128);
		Shape6g.mirror = true;
		this.setRotation(Shape6g, 0F, 0F, 0F);
		Shape6h = new ModelRenderer(this, 84, 0);
		Shape6h.addBox(0F, 0F, 0F, 2, 17, 2);
		Shape6h.setRotationPoint(-6F, 6F, -3F);
		Shape6h.setTextureSize(128, 128);
		Shape6h.mirror = true;
		this.setRotation(Shape6h, 0F, 0F, 0F);
		Shape6u = new ModelRenderer(this, 84, 0);
		Shape6u.addBox(0F, 0F, 0F, 2, 17, 2);
		Shape6u.setRotationPoint(-6F, 6F, 1F);
		Shape6u.setTextureSize(128, 128);
		Shape6u.mirror = true;
		this.setRotation(Shape6u, 0F, 0F, 0F);
		Shape6i = new ModelRenderer(this, 84, 0);
		Shape6i.addBox(0F, 0F, 0F, 2, 17, 2);
		Shape6i.setRotationPoint(-3F, 6F, 1F);
		Shape6i.setTextureSize(128, 128);
		Shape6i.mirror = true;
		this.setRotation(Shape6i, 0F, 0F, 0F);
		Shape6j = new ModelRenderer(this, 84, 0);
		Shape6j.addBox(0F, 0F, 0F, 2, 17, 2);
		Shape6j.setRotationPoint(1F, 6F, 1F);
		Shape6j.setTextureSize(128, 128);
		Shape6j.mirror = true;
		this.setRotation(Shape6j, 0F, 0F, 0F);
		Shape6k = new ModelRenderer(this, 84, 0);
		Shape6k.addBox(0F, 0F, 0F, 2, 17, 2);
		Shape6k.setRotationPoint(4F, 6F, 1F);
		Shape6k.setTextureSize(128, 128);
		Shape6k.mirror = true;
		this.setRotation(Shape6k, 0F, 0F, 0F);
		Shape6l = new ModelRenderer(this, 84, 0);
		Shape6l.addBox(0F, 0F, 0F, 2, 17, 2);
		Shape6l.setRotationPoint(4F, 6F, 4F);
		Shape6l.setTextureSize(128, 128);
		Shape6l.mirror = true;
		this.setRotation(Shape6l, 0F, 0F, 0F);
		Shape6m = new ModelRenderer(this, 84, 0);
		Shape6m.addBox(0F, 0F, 0F, 2, 17, 2);
		Shape6m.setRotationPoint(1F, 6F, 4F);
		Shape6m.setTextureSize(128, 128);
		Shape6m.mirror = true;
		this.setRotation(Shape6m, 0F, 0F, 0F);
		Shape6n = new ModelRenderer(this, 84, 0);
		Shape6n.addBox(0F, 0F, 0F, 2, 17, 2);
		Shape6n.setRotationPoint(-3F, 6F, 4F);
		Shape6n.setTextureSize(128, 128);
		Shape6n.mirror = true;
		this.setRotation(Shape6n, 0F, 0F, 0F);
		Shape7 = new ModelRenderer(this, 94, 0);
		Shape7.addBox(0F, 0F, 0F, 1, 1, 10);
		Shape7.setRotationPoint(4.5F, 5.2F, -5F);
		Shape7.setTextureSize(128, 128);
		Shape7.mirror = true;
		this.setRotation(Shape7, 0F, 0F, 0F);
		Shape7a = new ModelRenderer(this, 94, 0);
		Shape7a.addBox(0F, 0F, 0F, 1, 1, 10);
		Shape7a.setRotationPoint(-5.5F, 5.2F, -5F);
		Shape7a.setTextureSize(128, 128);
		Shape7a.mirror = true;
		this.setRotation(Shape7a, 0F, 0F, 0F);
		Shape7b = new ModelRenderer(this, 94, 0);
		Shape7b.addBox(0F, 0F, 0F, 1, 1, 10);
		Shape7b.setRotationPoint(1.5F, 5.2F, -5F);
		Shape7b.setTextureSize(128, 128);
		Shape7b.mirror = true;
		this.setRotation(Shape7b, 0F, 0F, 0F);
		Shape7c = new ModelRenderer(this, 94, 0);
		Shape7c.addBox(0F, 0F, 0F, 1, 1, 10);
		Shape7c.setRotationPoint(-2.5F, 5.2F, -5F);
		Shape7c.setTextureSize(128, 128);
		Shape7c.mirror = true;
		this.setRotation(Shape7c, 0F, 0F, 0F);
		Shape8 = new ModelRenderer(this, 28, 71);
		Shape8.addBox(0F, 0F, 0F, 12, 1, 12);
		Shape8.setRotationPoint(-6F, 4.5F, -6F);
		Shape8.setTextureSize(128, 128);
		Shape8.mirror = true;
		this.setRotation(Shape8, 0F, 0F, 0F);
		Shape9 = new ModelRenderer(this, 76, 20);
		Shape9.addBox(-1F, 0F, -1F, 2, 15, 2);
		Shape9.setRotationPoint(0F, 5F, 0F);
		Shape9.setTextureSize(128, 128);
		Shape9.mirror = true;
		this.setRotation(Shape9, 0F, 0.7853982F, 0F);
		Shape9a = new ModelRenderer(this, 76, 20);
		Shape9a.addBox(-1F, 0F, -1F, 2, 15, 2);
		Shape9a.setRotationPoint(0F, 5F, 0F);
		Shape9a.setTextureSize(128, 128);
		Shape9a.mirror = true;
		this.setRotation(Shape9a, 0F, 0F, 0F);
	}

	@Override
	public void renderAll(ArrayList li, float phi, float theta)
	{
		Shape1.render(f5);
		Shape2.render(f5);
		Shape2a.render(f5);
		Shape3.render(f5);
		Shape3a.render(f5);
		Shape4.render(f5);
		Shape4a.render(f5);
		Shape4b.render(f5);
		Shape5.render(f5);
		Shape5a.render(f5);
		Shape5b.render(f5);
		Shape5c.render(f5);
		Shape5d.render(f5);
		Shape5e.render(f5);
		Shape5f.render(f5);
		Shape5g.render(f5);
		Shape5h.render(f5);
		Shape5i.render(f5);
		Shape5j.render(f5);
		Shape5k.render(f5);

		double p = -phi/28D;
		GL11.glTranslated(0, p, 0);
		Shape6.render(f5);
		Shape6a.render(f5);
		Shape6b.render(f5);
		Shape6c.render(f5);
		Shape6d.render(f5);
		Shape6e.render(f5);
		Shape6f.render(f5);
		Shape6g.render(f5);
		Shape6h.render(f5);
		Shape6u.render(f5);
		Shape6i.render(f5);
		Shape6j.render(f5);
		Shape6k.render(f5);
		Shape6l.render(f5);
		Shape6m.render(f5);
		Shape6n.render(f5);
		Shape7.render(f5);
		Shape7a.render(f5);
		Shape7b.render(f5);
		Shape7c.render(f5);
		Shape8.render(f5);
		Shape9.render(f5);
		Shape9a.render(f5);
		GL11.glTranslated(0, -p, 0);
	}

	@Override
	public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.setRotationAngles(f, f1, f2, f3, f4, f5);
	}

}
