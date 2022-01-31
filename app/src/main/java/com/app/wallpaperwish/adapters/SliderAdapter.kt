package com.app.wallpaperwish.adapters

import android.app.Activity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.app.wallpaperwish.R
import kotlin.math.acos

class SliderAdapter ( val activity:Activity ,val list:ArrayList<Int>) : RecyclerView.Adapter<SliderAdapter.MyViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.slider_item,parent,false)
        return  MyViewHolder(view)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.view.setBackgroundColor( list[position])

    }

    override fun getItemCount(): Int {
        return list.size
    }

    class MyViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
        val view = itemView.findViewById<View>(R.id.view)
    }
}