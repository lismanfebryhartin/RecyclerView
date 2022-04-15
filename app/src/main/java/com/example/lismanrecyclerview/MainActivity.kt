package com.example.lismanrecyclerview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superheroList = listOf<Superhero>(
            Superhero(
                R.drawable.ironman,
                "Iron Man",
                "IronMan adalah Avengers dan Superhero terkuat di Marvel"
            ),
            Superhero(
                R.drawable.captainamerica,
                "Captain America",
                "Captain America adalah sosok pahlawan super fiktif dari Marvel Comics."
            ),
            Superhero(
                R.drawable.flash,
                "The Flash",
                "The Flash adalah pahlawan super yang muncul dalam komik yang diterbitkan oleh DC Comics."
            ),
            Superhero(
                R.drawable.blackpanter,
                "Black Panther",
                "Black Panther adalah gelar seremonial yang diberikan kepada kepala Suku Panther dari negara maju di Afrika, Wakanda."
            ),
            Superhero(
                R.drawable.hulk,
                "Hulk",
                "Hulk adalah tokoh pahlawan super fiksi yang ada pada Marvel Comics."
            ),
            Superhero(
                R.drawable.ironman,
                "IronMan",
                "IronMan adalah Avengers dan Superhero terkuat di Marvel"
            ),
            Superhero(
                R.drawable.ironman,
                "IronMan",
                "IronMan adalah Avengers dan Superhero terkuat di Marvel"
            ),
            Superhero(
                R.drawable.ironman,
                "IronMan",
                "IronMan adalah Avengers dan Superhero terkuat di Marvel"
            ),
            Superhero(
                R.drawable.ironman,
                "IronMan",
                "IronMan adalah Avengers dan Superhero terkuat di Marvel"
            ),
            Superhero(
                R.drawable.ironman,
                "IronMan",
                "IronMan adalah Avengers dan Superhero terkuat di Marvel"
            )
        )

        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superheroList){
            val intent = Intent(this,DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }
    }
}