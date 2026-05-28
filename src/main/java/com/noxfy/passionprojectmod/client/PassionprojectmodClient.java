package com.noxfy.passionprojectmod.client;

import com.noxfy.passionprojectmod.client.entities.ModEntityModelLayers;
import net.fabricmc.api.ClientModInitializer;

public class PassionprojectmodClient implements ClientModInitializer {

    @Override
    public void onInitializeClient() {
        ModEntityModelLayers.registerModelLayers();
    }
}
