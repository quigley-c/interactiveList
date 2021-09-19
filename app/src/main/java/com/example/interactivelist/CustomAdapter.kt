package com.example.interactivelist

import android.os.Bundle
import android.View.view
import androidx.recyclerview
import kotlinx.android.synthetic.main.activity_main.xml

class CustomAdapter extends RecyclerView.Adapter<CustomAdapter.ViewHolder> {
    class ViewHolder {
        val textView: TextView
        init {
            textView = view.findViewById(R.id.textView)
        }
    }

    override fun onCreateViewHolder () {

    }

    override fun onBindViewHolder() {

    }

    override fun getItemCount() {

    }

}