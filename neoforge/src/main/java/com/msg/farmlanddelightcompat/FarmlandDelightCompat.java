package com.msg.farmlanddelightcompat;


import net.neoforged.bus.api.IEventBus;
import net.neoforged.fml.common.Mod;

@Mod(Constants.ID)
public class FarmlandDelightCompat {

    public FarmlandDelightCompat(IEventBus eventBus) {
        CommonClass.init();
    }
}