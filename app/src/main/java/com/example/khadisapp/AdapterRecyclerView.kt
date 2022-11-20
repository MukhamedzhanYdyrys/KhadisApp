package com.example.khadisapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.khadisapp.model.allHadeest.Data
import com.example.khadisapp.model.allHadeest.allHadeest
import com.example.khadisapp.databinding.KhadisItemBinding

class AdapterRecyclerView : RecyclerView.Adapter<AdapterRecyclerView.RecViewHolder>() {

    var list = emptyList<Data>()

    class RecViewHolder(view: View): RecyclerView.ViewHolder(view){
        val binding = KhadisItemBinding.bind(view)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.khadis_item, parent, false)
        return RecViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecViewHolder, position: Int) {
        with(holder.binding){
            title.text = list.get(position).title
        }
    }

    override fun getItemCount(): Int = list.size

    fun setList(obj: allHadeest){
        val newList : ArrayList<Data> = ArrayList()
        for(item in obj.data){
            newList.add(item)
        }
        list = newList
        notifyDataSetChanged()
    }
}