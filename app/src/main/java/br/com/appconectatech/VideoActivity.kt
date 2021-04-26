package br.com.appconectatech

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.VideoView

class VideoActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_video)

        val video = findViewById<VideoView>(R.id.videoView)
        val videoFile = "android.resource://" + getPackageName() + "/" + R.raw.video1
        video.setVideoURI(Uri.parse(videoFile ))
        video.requestFocus()
        video.start()
    }
}