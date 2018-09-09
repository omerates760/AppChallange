package io.androidedu.appchallange.adapter

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import io.androidedu.appchallange.dto.SoundsDTO


// Code with ❤️
//┌─────────────────────────────┐
//│ Created by Gökhan ÖZTÜRK    │
//│ ─────────────────────────── │
//│ GokhanOzturk@AndroidEdu.IO  │            
//│ ─────────────────────────── │
//│ 8.09.2018 - 12:05           │
//└─────────────────────────────┘

class SoundsAdapter(private val soundList: List<SoundsDTO>,
                    private val onItemClick: (view: View, soundsDTO: SoundsDTO) -> Unit)

    : RecyclerView.Adapter<SoundsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SoundsViewHolder = SoundsViewHolder(parent)

    override fun getItemCount(): Int = soundList.size

    override fun onBindViewHolder(holder: SoundsViewHolder, position: Int) {

        holder.bindTo(soundList[position]) { view, soundsDTO ->

            onItemClick(view, soundsDTO)
        }
    }
}