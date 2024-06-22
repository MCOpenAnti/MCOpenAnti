@file:Suppress("INTERFACE_WITH_SUPERCLASS", "OVERRIDING_FINAL_MEMBER", "RETURN_TYPE_MISMATCH_ON_OVERRIDE", "CONFLICTING_OVERLOADS")

package net.teaclient.anti.server

external interface NumberRange {
    var max: Number
    var min: Number
}

typealias ArgumentOutOfBoundsError = Error

typealias EngineError = Error

typealias InvalidArgumentError = Error

typealias PropertyOutOfBoundsError = Error