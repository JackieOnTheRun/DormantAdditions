package com.devjackie.dormant;

import jdk.jfr.Description;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.annotation.plugin.ApiVersion;
import org.bukkit.plugin.java.annotation.plugin.Plugin;
import org.bukkit.plugin.java.annotation.plugin.Website;
import org.bukkit.plugin.java.annotation.plugin.author.Author;

/**
 * Main class for DormantAdditions plugin.
 *
 * @author Jacklyn2549
 * @version 06.09.2021
 */
@Plugin(name="DormantAdditions", version="1.0.0")
@Description(value="Custom plugin for DormantMC!")
@Author("Jacklyn2549")
@Website(value="dormant.devjackie.com")
@ApiVersion(ApiVersion.Target.v1_16)
public class DormantAdditions extends JavaPlugin {

    public DormantAdditions() {

    }

    @Override
    public void onEnable() {

    }

    @Override
    public void onDisable() {

    }

}
