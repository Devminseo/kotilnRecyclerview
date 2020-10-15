package com.example.kotilnpractice.adapter

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.kotilnpractice.R
import com.example.kotilnpractice.holder.ContactsViewHolder
import com.example.kotilnpractice.model.Contacts

class ContactsListAdapter (val itemList : List<Contacts>) : RecyclerView.Adapter<ContactsViewHolder>() {

    override fun getItemCount(): Int {
        Log.d("mskimtest","count : "+itemList.size)
        return itemList.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContactsViewHolder {
        val inflatedView = LayoutInflater.from(parent.context).inflate(R.layout.item_list , parent, false)
        return ContactsViewHolder(inflatedView);
    }

    override fun onBindViewHolder(holder: ContactsViewHolder, position: Int) {
        val item = itemList[position]
        holder.apply { bind(item) }
    }
}