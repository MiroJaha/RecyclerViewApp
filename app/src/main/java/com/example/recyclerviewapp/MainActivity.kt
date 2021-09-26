package com.example.recyclerviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val note=findViewById<ConstraintLayout>(R.id.mainL)
        var entry=findViewById<EditText>(R.id.Entry)
        val button=findViewById<Button>(R.id.BEnter)
        val myRV=findViewById<RecyclerView>(R.id.rvMain)
        val list= arrayListOf<String>()


        button.setOnClickListener {
            if(entry.text.isNotBlank()) {
                list.add(entry.text.toString())
                myRV.adapter= RecyclerViewAdapter(list)
                myRV.layoutManager= LinearLayoutManager(this)
                entry.text=null
            }
            else
                Snackbar.make(note,"Please Enter Valid Value",Snackbar.LENGTH_LONG).show()
        }




    }
}