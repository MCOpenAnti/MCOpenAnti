package net.teaclient.anti

import org.bukkit.plugin.java.JavaPlugin

public var flags = mapOf<String, Int>()



class Plugin : JavaPlugin() {
    override fun onEnable() {
        logger.info("AntiCheat has been enabled!")
        server.pluginManager.registerEvents(Listener(), this)
    }
}