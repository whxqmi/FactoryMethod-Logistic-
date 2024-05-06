package com.example.logisticcompany

class AutoTransport(
    override var companyName: String,
    override var maxPayLoad: Double,
    override var maxDimension: String,
    private val roadType: String, // Intra-city, Long-distance or International
    private val vehicleType: String // Passenger or Cargo
):Transport {

    override fun deliver() {
        println("Deliver by auto transport(road type: $roadType, vehicle type: $vehicleType) by $companyName")
    }
}