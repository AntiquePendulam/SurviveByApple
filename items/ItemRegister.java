package com.projectantiquer.survivebyapple.items;

import com.projectantiquer.survivebyapple.SurviveByApple;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

public class ItemRegister{
    public static void Register(IForgeRegistry<Item> register, Item item){
        item.setRegistryName( ((ItemBlock)item).getBlock().getRegistryName() );
        register.register(item);
    }

    public static void ItemRegistry(IForgeRegistry<Item> register){
        
    }

    @SideOnly(Side.CLIENT)
    public static void ModelRegister(){}

    @SideOnly(Side.CLIENT)
    public static void ModelRegistry(Item item, String modelName){
        net.minecraftforge.client.model.ModelLoader.setCustomModelResourceLocation
        (
            item, 0, new ModelResourceLocation(SurviveByApple.MODID + ":" + modelName, "inventory")
        );
    }
}