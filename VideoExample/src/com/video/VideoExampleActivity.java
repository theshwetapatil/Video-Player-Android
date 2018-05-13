// VideoExampleActivity.java : Defines the entry point for the android application.
// Android: Video Player
// Author: Shweta Patil
// Copyright: Shweta Patil © 2018
package com.video;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import android.widget.MediaController;
import android.widget.VideoView;

public class VideoExampleActivity extends Activity {
	VideoView video;
	
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        video=(VideoView)findViewById(R.id.vv);
        video.setVideoURI(Uri.parse("android.resourse://com.video/"+R.raw.shayari));
        video.setMediaController(new MediaController(this));
        video.start();
    }
}