package com.example.planthandbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.planthandbook.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private  val adapter = PlantAdapter()
    private  val imageIdList = listOf(R.drawable.p1,
                                      R.drawable.p2,
                                      R.drawable.p3,
                                      R.drawable.p4,
                                      R.drawable.p5)

    private var index = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        init()
    }

    private fun init(){
        binding.apply {
            rcView.layoutManager = GridLayoutManager(this@MainActivity, 3)
            rcView.adapter = adapter
            buttonAdd.setOnClickListener {
                if(index > 4) index = 0
                val plant = Plant(imageIdList[index], "Plant $index")
                adapter.addPlant(plant)
                index++
            }
        }
    }
}