package io.androidedu.appchallange.ui

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import io.androidedu.appchallange.R
import io.androidedu.appchallange.adapter.SoundsAdapter
import io.androidedu.appchallange.dto.SoundsDTO
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val soundList = ArrayList<SoundsDTO>()

        soundList.add(SoundsDTO("https://newevolutiondesigns.com/images/freebies/animals-background-1.jpg"))
        soundList.add(SoundsDTO("https://newevolutiondesigns.com/images/freebies/animals-background-2.jpg"))
        soundList.add(SoundsDTO("https://newevolutiondesigns.com/images/freebies/animals-background-1.jpg"))
        soundList.add(SoundsDTO("https://newevolutiondesigns.com/images/freebies/animals-background-2.jpg"))
        soundList.add(SoundsDTO("https://newevolutiondesigns.com/images/freebies/animals-background-1.jpg"))
        soundList.add(SoundsDTO("https://newevolutiondesigns.com/images/freebies/animals-background-2.jpg"))
        soundList.add(SoundsDTO("https://newevolutiondesigns.com/images/freebies/animals-background-1.jpg"))
        soundList.add(SoundsDTO("https://newevolutiondesigns.com/images/freebies/animals-background-2.jpg"))
        soundList.add(SoundsDTO("https://newevolutiondesigns.com/images/freebies/animals-background-1.jpg"))
        soundList.add(SoundsDTO("https://newevolutiondesigns.com/images/freebies/animals-background-2.jpg"))
        soundList.add(SoundsDTO("https://newevolutiondesigns.com/images/freebies/animals-background-1.jpg"))
        soundList.add(SoundsDTO("https://newevolutiondesigns.com/images/freebies/animals-background-2.jpg"))
        soundList.add(SoundsDTO("https://newevolutiondesigns.com/images/freebies/animals-background-1.jpg"))
        soundList.add(SoundsDTO("https://newevolutiondesigns.com/images/freebies/animals-background-2.jpg"))
        soundList.add(SoundsDTO("https://newevolutiondesigns.com/images/freebies/animals-background-1.jpg"))
        soundList.add(SoundsDTO("https://newevolutiondesigns.com/images/freebies/animals-background-2.jpg"))
        soundList.add(SoundsDTO("https://newevolutiondesigns.com/images/freebies/animals-background-1.jpg"))
        soundList.add(SoundsDTO("https://newevolutiondesigns.com/images/freebies/animals-background-2.jpg"))
        soundList.add(SoundsDTO("https://newevolutiondesigns.com/images/freebies/animals-background-1.jpg"))
        soundList.add(SoundsDTO("https://newevolutiondesigns.com/images/freebies/animals-background-2.jpg"))
        recyclerView.apply {

            this.layoutManager = LinearLayoutManager(this@MainActivity)
            this.adapter = SoundsAdapter(soundList) { view, soundsDTO ->

                Toast.makeText(this@MainActivity, soundsDTO.imageLink, Toast.LENGTH_SHORT).show()
            }
        }
    }
}
