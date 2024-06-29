package net.teaclient.anti

import net.kyori.adventure.text.Component
import org.bukkit.event.EventHandler
import org.bukkit.event.Listener
import org.bukkit.event.player.PlayerJoinEvent
import org.bukkit.event.player.PlayerMoveEvent
import org.bukkit.Bukkit.*
import org.bukkit.util.Vector

class Listener : Listener {

    @EventHandler
    fun onPlayerJoin(event: PlayerJoinEvent) {
        getOperators().forEach { operator ->
            // make [[TeaClientANTI]]: purple to red gradient using minecraft colors
            operator.player?.sendMessage(Component.text("[[TeaClientANTI]]: Player: " + event.player.name + " Is running on: " + event.player.clientBrandName))
        }
    }

    @EventHandler
    fun onPlayerMove(event: PlayerMoveEvent) {
        val player = event.player;
        var savedPositions = mapOf<String, Array<Vector>>()
        if (player.isValid || player.isInWater) {
            savedPositions = savedPositions.plus(player.name to (savedPositions[player.name] ?: arrayOf(player.location.toVector())))
            val lastPositions = savedPositions[player.name]
            if (lastPositions == null || lastPositions.size < 4) return

            player.sendMessage(Component.text("You are " + (player.location.y - lastPositions[lastPositions.size - 3].y) + " blocks away from your previous position."))
//            val position = lastPositions[lastPositions.size - 3]
//
//            val yDistance = (player.location.y - position.y)
//            player.sendMessage(Component.text("You are $yDistance blocks away from your previous position."))


        }

    }
}

