package com.plcoding.cryptotracker.crypto.data.mapper

import com.plcoding.cryptotracker.crypto.data.networking.dto.CoinDto
import com.plcoding.cryptotracker.crypto.domain.Coin

fun CoinDto.toCoin(): Coin {
    return Coin(
        id = id,
        rank = rank,
        name = name,
        symbol = symbol,
        priceUsd = priceUsd,
        marketCapUsd = marketCapUsd,
        changePercent24Hr = changePercent24Hr
    )
}