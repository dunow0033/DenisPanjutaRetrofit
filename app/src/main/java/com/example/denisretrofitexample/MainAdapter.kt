package com.example.denisretrofitexample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import coil.load
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.transform.CircleCropTransformation
import com.example.denisretrofitexample.databinding.RvItemBinding
import com.example.denisretrofitexample.network.Character

class MainAdapter(val charactersList: List<Character>) : RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(RvItemBinding.inflate(LayoutInflater.from(parent.context), parent,false))
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        with(holder){
            with(charactersList[position]){
                binding.name.text = this.name
                binding.image.load(this.image){
                    transformations(CircleCropTransformation())
                }
            }
        }
    }

    override fun getItemCount(): Int {
        return charactersList.size
    }

    class MainViewHolder(val binding: RvItemBinding):RecyclerView.ViewHolder(binding.root)
}