package com.projectantiquer.survivebyapple.blocks;

import com.projectantiquer.survivebyapple.SurviveByApple;

import net.minecraft.block.Block;
import net.minecraft.block.material.MapColor;
import net.minecraft.block.material.Material;
import net.minecraft.util.ResourceLocation;

public class BlockBase extends Block{
    public BlockBase(Material material, String unlocalizedName){
        this(material, material.getMaterialMapColor(), unlocalizedName);
    }
    public BlockBase(Material material, MapColor mapColor, String unlocalizedName){
        super(material, mapColor);
        this.setUnlocalizedName(unlocalizedName);
        this.setRegistryName(new ResourceLocation(SurviveByApple.MODID, unlocalizedName));
    }
}