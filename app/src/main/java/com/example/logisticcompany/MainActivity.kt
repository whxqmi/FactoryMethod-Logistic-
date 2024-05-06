package com.example.logisticcompany

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    val autoTransport = TransportFactory.createAutoTransport("Road Logistic", "International", "Cargo")
    val waterTransport = TransportFactory.createWaterTransport("Sea Logistic", "Sea")
    val aviaTransport = TransportFactory.createAviaTransport("DHL")
    val railwayTransport = TransportFactory.createRailTransport("Rail Cargo", "Big", true )
}