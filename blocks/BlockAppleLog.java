package com.projectantiquer.survivebyapple.blocks;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockAppleLog extends BlockBase{

    public BlockAppleLog(String unlocalizedname){
        super(Material.WOOD, unlocalizedname);
        super.setLightLevel(1.0f);
        super.setHardness(1.0f);
        super.setCreativeTab(CreativeTabs.FOOD);
    }
}