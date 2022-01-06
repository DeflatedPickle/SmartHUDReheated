/* Copyright (c) 2022 ChloeDawn,DeflatedPickle under the APACHE-2.0 license */

package com.deflatedpickle.smarthud.impl

data class Dodge(
    val upon: (Player) -> Boolean = { false },
    val offset: Pair<Int, Int> = Pair(0, 0),
)
