package br.com.appconectatech

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton
import android.widget.VideoView

class PerfilActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_perfil)

        val imagebutton = findViewById<ImageButton>(R.id.imageButton)
        imagebutton.setOnClickListener {
            val telavideo = Intent(this, VideoActivity::class.java)
            startActivity(telavideo)
        }
    }
}