package com.example.myapplication2.adapter

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.post_layout.view.*

class PostViewHolder(itemView:View) : RecyclerView.ViewHolder(itemView){
    val txt_author = itemView.txt_author
    val txt_title  = itemView.txt_title
    val txt_content = itemView.txt_content
    val img:ImageView = itemView.imageView3
}