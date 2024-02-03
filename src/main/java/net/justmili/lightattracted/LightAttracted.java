package net.justmili.lightattracted;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LightAttracted implements ModInitializer {
    public static final Logger LOGGER = LoggerFactory.getLogger("lightattracted");

    @Override
    public void onInitialize() {
        LOGGER.info("Initalizing LightAttracted Mod...");
    }
}