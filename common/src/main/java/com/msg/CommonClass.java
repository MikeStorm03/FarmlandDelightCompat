package com.msg;

import com.msg.platform.Services;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class CommonClass {

    public static final TagKey<Block> FARMLAND = TagKey.create(Registries.BLOCK, ResourceLocation.fromNamespaceAndPath("farmland-delight-compat", "farmland"));

    public static void init() {
        Constants.LOG.info("Mod {} is running on {}! we are currently in a {} environment!",
                            Constants.NAME,
                            Services.PLATFORM.getPlatformName(),
                            Services.PLATFORM.getEnvironmentName());

    }
}