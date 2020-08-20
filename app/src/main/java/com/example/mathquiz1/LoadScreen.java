package com.example.mathquiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.ProgressBar;
import android.widget.TextView;

public class LoadScreen extends AppCompatActivity {

    ProgressBar progressBar;
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_load_screen);

        progressBar=findViewById(R.id.progress_bar_id);
        textView=findViewById(R.id.text_view_id);

        progressBar.setMax(100);
        progressBar.setScaleY(3f);

        progressAnimation();
    }

    private void progressAnimation() {
        ProgressBarAnimation progressBarAnimation=new ProgressBarAnimation(this,progressBar,textView,0f,100f);
        progressBarAnimation.setDuration(9000);
        progressBar.setAnimation(progressBarAnimation);
    }
}
