package com.noxfy.passionprojectmod.client.entities;

import com.noxfy.passionprojectmod.Passionprojectmod;
import net.fabricmc.fabric.api.client.rendering.v1.ModelLayerRegistry;
import net.minecraft.client.model.animal.allay.AllayModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.resources.Identifier;

public class ModEntityModelLayers {
    public static final ModelLayerLocation BATTLE_ALLAY = createMain("mini_golem");

    private static ModelLayerLocation createMain(String name) {
        return new ModelLayerLocation(Identifier.fromNamespaceAndPath(Passionprojectmod.MOD_ID, name), "main");
    }

    public static void registerModelLayers() {
        ModelLayerRegistry.registerModelLayer(ModEntityModelLayers.BATTLE_ALLAY, BattleAllayEntityModel::getTexturedModelData);
    }
}