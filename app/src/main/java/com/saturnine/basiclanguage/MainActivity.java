package com.saturnine.basiclanguage;
import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClicked(View view){
        int button_id = view.getId();
        String id = view.getResources().getResourceEntryName(button_id);
        int file_id = getResources().getIdentifier(id,"raw","com.saturnine.basiclanguage");
        MediaPlayer mediaPlayer = MediaPlayer.create(this, file_id);
        mediaPlayer.start();

    }
}