package com.example.logisticcompany

interface Transport {
    var companyName: String
    var maxPayLoad: Double
    var maxDimension: String

    fun deliver()

}