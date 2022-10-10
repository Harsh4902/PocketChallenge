package com.example.pocketchallange.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.pocketchallange.R
import com.example.pocketchallange.model.Food
import kotlinx.android.synthetic.main.content_card.view.*

class FoodContentAdapter(
    var content : List<Food>
) : RecyclerView.Adapter<FoodContentAdapter.FoodContentViewHolder>() {

    inner class FoodContentViewHolder (itemView: View): RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FoodContentViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.content_card, parent, false)

        val viewHolder = FoodContentViewHolder(view)

        return viewHolder
    }

    override fun onBindViewHolder(holder: FoodContentViewHolder, position: Int) {
        holder.itemView.apply {
            tvfood.text = content[position].name
            val price = content[position].price
            tvPrice.text = "₹ $price"
            val image : ImageView = findViewById(R.id.ivImage)

            Glide.with(this).load(content[position].imageUrl).into(image)
        }
    }

    override fun getItemCount(): Int {
        return content.size
    }

}