package com.watch.data.vo

data class AddressDetails(
    val address: String,
    val final_balance: Int,
    val hash160: String,
    val n_tx: Int,
    val n_unredeemed: Int,
    val total_received: Int,
    val total_sent: Int,
    val txs: List<Tx>
)