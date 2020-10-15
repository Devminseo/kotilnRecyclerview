package com.example.kotilnpractice

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.kotilnpractice.adapter.ContactsListAdapter
import com.example.kotilnpractice.model.Contacts
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {

    val contactsList : List<Contacts> = listOf(
        Contacts("john","010-0000-11111"),
        Contacts("mir","010-1111-2222"),
        Contacts("delp", "010-3333-4444"),
        Contacts("jacob", "010-3333-5555"),
        Contacts("sheu", "010-3333-6666"),
        Contacts("ma", "010-3333-7777"),
        Contacts("ham", "010-3333-8889")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("mskimtest","contactsList size : "+contactsList.size);
        val adapter = ContactsListAdapter(contactsList)
        recyclerview.adapter = adapter
    }




}