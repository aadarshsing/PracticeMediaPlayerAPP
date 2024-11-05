package com.example.frenchteacherapp

import android.media.MediaPlayer
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() , View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val black : Button = findViewById(R.id.black);
        val green : Button = findViewById(R.id.green);
        val purple : Button = findViewById(R.id.purple);
        val red : Button = findViewById(R.id.red);

        black.setOnClickListener(this)
        green.setOnClickListener(this)
        purple.setOnClickListener(this)
        red.setOnClickListener(this)
    }

    override fun onClick(p0: View?) {
        var id = p0?.id


        if(id == R.id.black) playSound(R.raw.black)
        else if(id == R.id.green) playSound(R.raw.green)
        else if(id == R.id.purple) playSound(R.raw.purple)
        else if(id == R.id.red) playSound(R.raw.red)

    }
    fun playSound(id : Int){
        var mediaplayer = MediaPlayer.create(this,id);
        mediaplayer.start()

    }

    override fun onDestroy() {
        super.onDestroy()
    }
}