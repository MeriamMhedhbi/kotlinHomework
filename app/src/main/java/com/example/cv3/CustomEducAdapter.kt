package com.example.cv3


import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.NonNull
import androidx.recyclerview.widget.RecyclerView

internal class CustomEducAdapter(val itemsList: ArrayList<Education>) : RecyclerView.Adapter<CustomEducAdapter.MyViewHolder>() {
    internal inner class MyViewHolder(itemview: View): RecyclerView.ViewHolder(itemview) {

        var itemImageView: ImageView = itemview.findViewById(R.id.imageView)
        var itemName: TextView = itemview.findViewById(R.id.name)
        var itemStartDate: TextView = itemview.findViewById(R.id.start_date)
        var itemEndDate: TextView = itemview.findViewById(R.id.end_date)
        var itemCountry: TextView = itemview.findViewById(R.id.country)

    }

    @NonNull
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.educ_item, parent, false)
        return MyViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val item = itemsList[position]
        holder.itemImageView.setImageResource(item.imageItem);
        holder.itemCountry.text = item.country
        holder.itemStartDate.text = item.startDate
        holder.itemEndDate.text = item.endDate
        holder.itemName.text = item.Name
    }

    override fun getItemCount(): Int {
        return itemsList.size
    }

}