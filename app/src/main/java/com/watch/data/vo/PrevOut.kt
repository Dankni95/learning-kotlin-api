package com.watch.data.vo

data class PrevOut(
    val addr: String,
    val n: Int,
    val script: String,
    val spending_outpoints: List<SpendingOutpoint>,
    val spent: Boolean,
    val tx_index: Long,
    val type: Int,
    val value: Int
)