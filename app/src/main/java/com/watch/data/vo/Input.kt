package com.watch.data.vo

data class Input(
    val index: Int,
    val prev_out: PrevOut,
    val script: String,
    val sequence: Long,
    val witness: String
)