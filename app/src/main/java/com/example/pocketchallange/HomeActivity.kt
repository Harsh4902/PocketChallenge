package com.example.pocketchallange

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import com.example.pocketchallange.adapter.FoodContentAdapter
import com.example.pocketchallange.model.Food
import kotlinx.android.synthetic.main.activity_home.*

class HomeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        supportActionBar?.hide()

        var list : MutableList<Food> = mutableListOf(
            Food("PavBhaji",150,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT8HDsD9pKcHsEL1yvCX6qZChWgJL1XVPmTaQ&usqp=CAU"),
            Food("Dosa",100,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT8HDsD9pKcHsEL1yvCX6qZChWgJL1XVPmTaQ&usqp=CAU"),
            Food("Samosa",15,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT8HDsD9pKcHsEL1yvCX6qZChWgJL1XVPmTaQ&usqp=CAU"),
            Food("Pulav",80,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT8HDsD9pKcHsEL1yvCX6qZChWgJL1XVPmTaQ&usqp=CAU"),
            Food("Noodles",120,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT8HDsD9pKcHsEL1yvCX6qZChWgJL1XVPmTaQ&usqp=CAU"),
            Food("Panipuri",50,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT8HDsD9pKcHsEL1yvCX6qZChWgJL1XVPmTaQ&usqp=CAU"),
            Food("Pizza",250,"https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT8HDsD9pKcHsEL1yvCX6qZChWgJL1XVPmTaQ&usqp=CAU"),
        )

        rvItems.layoutManager = GridLayoutManager(this,2)
        val adapter = FoodContentAdapter(list)
        rvItems.adapter = adapter

    }
}