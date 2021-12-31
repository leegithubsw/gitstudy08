package com.example.gitstudy08

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity(), View.OnClickListener {
    lateinit var tv1: TextView
    lateinit var et1: EditText
    lateinit var bt1: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        findfiew()
    }
    fun findfiew() {
        tv1 = findViewById(R.id.tv1)
        tv1.setText("diff 차이를 보기위해 빈 커밋을 표기하기위하여 수정")
        et1 = findViewById(R.id.et1)

        bt1 = findViewById(R.id.bt1)

        bt1.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        when(v) {
            bt1 -> Toast.makeText(this, "${bt1.text} clicked", Toast.LENGTH_SHORT).show()
        }
    }
}