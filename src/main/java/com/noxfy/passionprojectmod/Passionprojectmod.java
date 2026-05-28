package com.noxfy.passionprojectmod;

import com.noxfy.passionprojectmod.entities.ModEntities;
import net.fabricmc.api.ModInitializer;

public class Passionprojectmod implements ModInitializer {
    public static final String MOD_ID = "passionprojectmod";

    @Override
    public void onInitialize() {
        ModItems.registerModItems();
        ModEntities.registerAttributes();
    }
}