package com.movied.facebookcloneeko

import Model.Posts
import android.view.LayoutInflater
import android.view.TextureView
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter_Posts (private val list : List<Posts>):RecyclerView.Adapter<Adapter_Posts.ViewHolder>(){

    inner class ViewHolder(view : View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Adapter_Posts.ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.posts_page,parent,false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val sender = holder.itemView.findViewById<TextView>(R.id.id_name)
        sender.text = list[position].Sender

        val post = holder.itemView.findViewById<TextView>(R.id.id_posts)
        post.text = list[position].Post

        val date = holder.itemView.findViewById<TextView>(R.id.id_date)
        date.text = list[position].Date

        val like = holder.itemView.findViewById<TextView>(R.id.id_like)
        like.text = list[position].Likes

        val comment = holder.itemView.findViewById<TextView>(R.id.id_comment)
        comment.text = list[position].Comment

        val textcomment = holder.itemView.findViewById<TextView>(R.id.id_textcomment)
        textcomment.text = list[position].Firstcomment

        val commentsender = holder.itemView.findViewById<TextView>(R.id.id_commentsender)
        commentsender.text = list[position].Firstcommentsender
    }

    override fun getItemCount(): Int {
        return list.size
    }
}