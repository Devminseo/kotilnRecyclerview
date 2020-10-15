package com.example.kotilnpractice.holder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.kotilnpractice.model.Contacts
import kotlinx.android.synthetic.main.item_list.view.*

class ContactsViewHolder (v: View) : RecyclerView.ViewHolder(v)  {


    var view : View =v

    fun bind (item : Contacts){
        view.name.text = item.name;
        view.number.text = item.tel;
    }
}