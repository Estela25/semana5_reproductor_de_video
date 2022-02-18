package com.example.semana5_reproductor_de_video;

import androidx.appcompat.app.AppCompatActivity;
import android.net.Uri;
import android.widget.VideoView;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
     VideoView videoView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        videoView = (VideoView) findViewById(R.id.videoView);

        String path = "android.resource://"+ getPackageName() + "/" +
                R.raw.rawr;
        videoView.setVideoURI(Uri.parse(path));
        videoView.start();
    }
}