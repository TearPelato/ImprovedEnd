package net.tier1234.improve_the_end;

import com.mojang.logging.LogUtils;
import net.minecraft.resources.ResourceLocation;
import org.slf4j.Logger;

public class Constants {
    public static final String MOD_ID = "improved_end";
    public static final Logger LOGGER = LogUtils.getLogger();

    public static ResourceLocation id(String path){
        return ResourceLocation.fromNamespaceAndPath(MOD_ID,path);
    }
}
