package net.teaclient.anti

import net.kyori.adventure.text.Component
import org.bukkit.Bukkit.getOperators
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent

class Listener : Listener {

    @EventHandler
    fun onPlayerJoin(event: PlayerJoinEvent) {
        getOperators().forEach { operator ->
            // make [[TeaClientANTI]]: purple to red gradient using minecraft colors
            operator.player?.sendMessage(Component.text("[[TeaClientANTI]]: Player: " + event.player.name + " Is running on: " + event.player.clientBrandName))
        }
    }
}