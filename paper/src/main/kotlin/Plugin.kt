package net.teaclient.anti

import org.bukkit.plugin.java.JavaPlugin

class Plugin : JavaPlugin() {
    override fun onEnable() {
        logger.info("AntiCheat has been enabled!")
        server.pluginManager.registerEvents(Listener(), this)
    }
}