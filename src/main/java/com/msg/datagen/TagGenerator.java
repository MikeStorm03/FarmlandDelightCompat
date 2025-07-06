package com.msg.datagen;

import java.util.concurrent.CompletableFuture;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.core.HolderLookup;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;

import vectorwing.farmersdelight.common.registry.ModBlocks;

public class TagGenerator extends FabricTagProvider<Block> {
	public TagGenerator(FabricDataOutput output, CompletableFuture<HolderLookup.Provider> registriesFuture) {
		super(output, Registries.BLOCK, registriesFuture);
	}

    public static final TagKey<Block> FARMLAND = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("farmland-delight-compat", "smelly_items"));

	@Override
	protected void addTags(HolderLookup.Provider wrapperLookup) {
        tag(FARMLAND).add(BuiltInRegistries.BLOCK.getResourceKey(Blocks.FARMLAND).get())
                    .add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.RICH_SOIL_FARMLAND.get()).get());

        tag(BlockTags.DIRT).add(BuiltInRegistries.BLOCK.getResourceKey(ModBlocks.RICH_SOIL.get()).get());
	}
}