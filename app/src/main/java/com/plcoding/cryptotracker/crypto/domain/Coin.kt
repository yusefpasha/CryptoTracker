package com.plcoding.cryptotracker.crypto.domain

data class Coin(
    val id: String,
    val rank: Int,
    val name: String,
    val symbol: String,
    val marketCapUsdL: Double,
    val priceUsd: Double,
    val changePercent24h: Double
)