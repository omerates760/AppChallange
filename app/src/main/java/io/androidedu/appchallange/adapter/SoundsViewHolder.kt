package io.androidedu.appchallange.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import io.androidedu.appchallange.R
import io.androidedu.appchallange.dto.SoundsDTO


// Code with ❤️
//┌─────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK    │
//│ ─────────────────────────── │
//│ GokhanOzturk@AndroidEdu.IO  │            
//│ ─────────────────────────── │
//│ 8.09.2018 - 12:07           │
//└─────────────────────────────┘

class SoundsViewHolder(val parent: ViewGroup) : RecyclerView.ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.adapter_item_sound_list, parent, false)) {

    private val imgBackground by lazy { itemView.findViewById<ImageView>(R.id.imgBackground) }

    fun bindTo(soundsDTO: SoundsDTO, onItemClick: (view: View, soundsDTO: SoundsDTO) -> Unit) {

        Glide.with(itemView.context).load(soundsDTO.imageLink).into(imgBackground)

        itemView.setOnClickListener {

            onItemClick(it, soundsDTO)
        }
    }
}