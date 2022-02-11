package com.gdcdc.frutasdelmundo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        this.supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerView)
        val adapter = CustomAdapter(listOf(
            Fruit(
                getString(R.string.pomelo),
                getString(R.string.detPomelo),
                R.drawable.toronja
            ),
            Fruit(
                getString(R.string.piña),
                getString(R.string.detPiña),
                R.drawable.pinna
            ),
            Fruit(
                getString(R.string.aguacate),
                getString(R.string.detAguacate),
                R.drawable.aguacate
            ),
            Fruit(
                getString(R.string.arándanos),
                getString(R.string.detArándanos),
                R.drawable.arandano
            ),
            Fruit(
                getString(R.string.manzanas),
                getString(R.string.detManzanas),
                R.drawable.manzana
            )
        ))

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = adapter
    }
}