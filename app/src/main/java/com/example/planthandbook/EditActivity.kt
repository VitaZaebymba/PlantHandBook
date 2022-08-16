package com.example.planthandbook

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.planthandbook.databinding.ActivityMainBinding

class EditActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    private var indexImage=0
    private var imageId=0

    private  val imageIdList = listOf(R.drawable.p1,
        R.drawable.p2,
        R.drawable.p3,
        R.drawable.p4,
        R.drawable.p5)



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private  fun initButtons() = with(binding){
        
    }
}