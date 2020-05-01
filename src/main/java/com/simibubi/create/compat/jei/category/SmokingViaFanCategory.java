package com.simibubi.create.compat.jei.category;

import com.simibubi.create.AllItems;
import com.simibubi.create.foundation.gui.ScreenElementRenderer;

import net.minecraft.block.Blocks;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.SmokingRecipe;

public class SmokingViaFanCategory extends ProcessingViaFanCategory<SmokingRecipe> {

	public SmokingViaFanCategory() {
		super("smoking_via_fan", doubleItemIcon(AllItems.PROPELLER.get(), Items.BLAZE_POWDER));
	}

	@Override
	public Class<? extends SmokingRecipe> getRecipeClass() {
		return SmokingRecipe.class;
	}

	@Override
	public void renderAttachedBlock() {
		ScreenElementRenderer.renderBlock(() -> Blocks.FIRE.getDefaultState());
	}
}