package com.example.logisticcompany

class AviaTransport(
    override var companyName: String,
    override var maxPayLoad: Double,
    override var maxDimension: String
):Transport {
    override fun deliver() {
        println()
    }
}