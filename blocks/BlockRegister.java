package com.projectantiquer.survivebyapple.blocks;

import com.projectantiquer.survivebyapple.SurviveByApple;
import com.projectantiquer.survivebyapple.items.ItemRegister;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

public class BlockRegister{

    public static final BlockAppleLog AppleLog = new BlockAppleLog("blockapplelog");

    public static void Registry(IForgeRegistry<Block> register){
        register.register(AppleLog);
    }

    public static void ItemBlockRegistry(IForgeRegistry<Item> register){
        ItemRegister.Register(register, new ItemBlock(AppleLog));
    }

    @SideOnly(Side.CLIENT)
    public static void ModelRegister(){
        ItemRegister.ModelRegistry(Item.getItemFromBlock(AppleLog), "log_apple_item_model");
    }
}