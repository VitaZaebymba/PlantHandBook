package com.example.planthandbook

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.planthandbook.databinding.PlantItemBinding

class PlantAdapter: RecyclerView.Adapter<PlantAdapter.PlantHolder>() { //ViewHolder - специальный класс, который содержит ссылки на все view в элементе

    class PlantHolder(item: View): RecyclerView.ViewHolder(item) {
        val binding = PlantItemBinding.bind(item)
        fun bind(plant: Plant) = with(binding){
            im.setImageResource(plant.imageId)
            tvTitle.text = plant.title
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlantHolder { //создание view и загрузка в память
        val view = LayoutInflater.from(parent.context).inflate(R.layout.plant_item, parent, false)
    }

    override fun onBindViewHolder(holder: PlantHolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

}