package net.teaclient.anti

import net.teaclient.anti.server.system
import net.teaclient.anti.server.world

fun main() {
    println("Hello, World!")
    system.runInterval({
        world.getAllPlayers().forEach {
            it.onScreenDisplay.setActionBar("Hello, World! Server has been running for ${(system.currentTick / 20).toString()} seconds")
        }
    }, 20)

}

private operator fun Number.div(i: Int): Number {
    return this.toDouble() / i.toDouble()
}
