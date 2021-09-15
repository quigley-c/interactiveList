package com.example.interactivelist

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.View.view
import kotlinx.android.synthetic.main.activity_main.xml

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addBtn.setOnClickListener(this)
    }

    override fun OnClick(view: View?)   {
        when(view)  {
            addBtn -> {
                recyclerView.add(textView.getText())
                textiew.setText("")
            }
        }
    }
}