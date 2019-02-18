package com.projectantiquer.survivebyapple.blocks;

import com.projectantiquer.survivebyapple.items.ItemRegister;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.registries.IForgeRegistry;

public class BlockRegister{

    public static final BlockAppleLog AppleLog = new BlockAppleLog("blockapplelog");

    public static void Registry(IForgeRegistry<Block> register){
        register.register(AppleLog);
    }

    public static void ItemBlockRegistry(IForgeRegistry<Item> register){
        ItemRegister.Register(register, ToItem(AppleLog));
    }

    public static void ModelRegister(){
        
    }

    private static Item ToItem(Block block){
        return new ItemBlock(block).setRegistryName(block.getRegistryName());
    }
}