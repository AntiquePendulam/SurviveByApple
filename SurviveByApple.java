package com.projectantiquer.survivebyapple;

import com.projectantiquer.survivebyapple.blocks.BlockRegister;
import com.projectantiquer.survivebyapple.items.ItemRegister;

import org.apache.logging.log4j.Logger;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLConstructionEvent;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

@Mod(modid = SurviveByApple.MODID, name = SurviveByApple.NAME, version = SurviveByApple.VERSION)
public class SurviveByApple
{
    public static final String MODID = "survivebyapple";
    public static final String NAME = "Survive By Apple";
    public static final String VERSION = "0.0.1";

    @EventHandler
    public void construction(FMLConstructionEvent event){
        MinecraftForge.EVENT_BUS.register(this);
    }

    public static Logger log;
    @EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        log = event.getModLog();
    }

    @EventHandler
    public void init(FMLInitializationEvent event)
    {

    }

    @SubscribeEvent
    public void BlockRegister(RegistryEvent.Register<Block> event){
        BlockRegister.Registry(event.getRegistry());
    }

    @SubscribeEvent
    public void ItemRegister(RegistryEvent.Register<Item> event){
        IForgeRegistry<Item> itemReg = event.getRegistry();
        BlockRegister.ItemBlockRegistry(itemReg);
        ItemRegister.ItemRegistry(itemReg);
    }

    @SideOnly(Side.CLIENT)
    @SubscribeEvent
    public void ModelRegister(ModelRegistryEvent event){
        BlockRegister.ModelRegister();
    }
}
