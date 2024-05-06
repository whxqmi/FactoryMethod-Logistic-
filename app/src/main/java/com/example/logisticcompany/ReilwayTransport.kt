package com.example.logisticcompany

class ReilwayTransport(
    override var companyName: String,
    override var maxPayLoad: Double,
    override var maxDimension: String,
    private val trackSize: String, // big or small
    private val hasBallast: Boolean
): Transport {

    override fun deliver() {
        println("Delivery by railway transport(track size: $trackSize, ballast: $hasBallast) by $companyName")
    }
}