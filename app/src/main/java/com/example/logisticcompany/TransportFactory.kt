package com.example.logisticcompany

object TransportFactory {
    fun createWaterTransport(companyName: String, type: String): WaterTransport {
        return WaterTransport(companyName, 1000.0, "10x5x3 m", type)
    }

    fun createRailTransport(companyName: String, trackSize: String, hasBallast: Boolean): ReilwayTransport {
        return ReilwayTransport(companyName, 2000.0, "20x3x4 m", trackSize, hasBallast)
    }

    fun createAutoTransport(companyName: String, roadType: String, vehicleType: String): AutoTransport {
        return AutoTransport(companyName, 500.0, "8x3x2 m", roadType, vehicleType)
    }

    fun createAviaTransport(companyName: String): AviaTransport {
        return AviaTransport(companyName, 1500.0, "15x3x4 m")
    }
}
