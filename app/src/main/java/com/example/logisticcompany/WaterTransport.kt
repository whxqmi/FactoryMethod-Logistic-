package com.example.logisticcompany

class WaterTransport(
    override var companyName: String,
    override var maxPayLoad: Double,
    override var maxDimension: String,
    private val type: String // River or Sea
): Transport {

    override fun deliver() {
        println("Delivery by water transport ($type) by $companyName")
    }
}