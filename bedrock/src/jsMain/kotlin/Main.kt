package net.teaclient.anti

import kotlin.math.abs

import net.teaclient.anti.server.Vector3
import net.teaclient.anti.server.system
import net.teaclient.anti.server.world

fun Vector3.create(x: Double, y: Double, z: Double): Vector3 {
    this.x = x
    this.y = y
    this.z = z
    return this
}

fun Vector3.add(other: Vector3): Vector3 {
    return this.create(
        x.toDouble() + other.x.toDouble(),
        y.toDouble() + other.y.toDouble(),
        z.toDouble() + other.z.toDouble()
    )
}

fun Vector3.add(xV: Double, yV: Double, zV: Double): Vector3 {
    return this.create(
        xV + x.toDouble(),
        yV + y.toDouble(),
        zV + z.toDouble()
    )
}

private operator fun Number.plus(x: Number): Any {
    this as Double
    x as Double
    return this + x
}

fun main() {
    var savedPositions = mapOf<String, Array<Vector3>>()
    var flags = mapOf<String, Int>()
    system.runInterval({
        for (player in world.getAllPlayers()) {
            // wait a tick before running the code
            // cant continue?
            if (!player.isValid() || player.isInWater) continue
                savedPositions = savedPositions.plus(
                    player.id to (savedPositions[player.id] ?: arrayOf()).plus(player.location)
                )
                val lastPositions = savedPositions[player.id]
                if (lastPositions == null || lastPositions.size < 4) continue
                val position = lastPositions[lastPositions.size - 3]

                val yDistance = abs(player.location.y.toDouble() - position.y.toDouble())
                player.onScreenDisplay.setActionBar("You are $yDistance blocks away from your previous position.")

                if (yDistance < 0.05 && !player.isOnGround) {

                    val block = player.dimension.getBlock(player.location.add(0.0, -0.5, 0.0));
                    if (block != null && block.isSolid && block.isValid()) {
                        flags = flags.plus(player.id to 0)
                        continue
                    }
                    flags = flags.plus(player.id to (flags[player.id]?: 0) + 1)
                    if ((flags[player.id] ?: 0) >= 5) {
                        player.sendMessage("You have been flagged for teleportation.")
                        // delete all saved positions after flag
                        savedPositions = savedPositions.minus(player.id)
                        continue
                    }
            }
        }
    })
}