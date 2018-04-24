package com.example.a16022916.myimageview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    ImageView ivDay2;
    ImageView ivDay5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Get the ImageView obj and assign to ivDay2 (Dynamic)
        ivDay2 = (ImageView) findViewById(R.id.imageView2);
        ivDay5 = (ImageView) findViewById(R.id.imageView5);
        // Set the image
        ivDay2.setImageResource(R.drawable.day2);
        ivDay5.setImageResource(R.drawable.day5);
    }
}
