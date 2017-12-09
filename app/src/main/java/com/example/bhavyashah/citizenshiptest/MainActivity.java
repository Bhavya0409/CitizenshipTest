package com.example.bhavyashah.citizenshiptest;

import android.os.Bundle;
import android.speech.tts.TextToSpeech;
import android.support.v7.app.AppCompatActivity;

import java.util.Locale;

import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    public static TextToSpeech textToSpeech;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        textToSpeech = new TextToSpeech(getApplicationContext(), new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status!=TextToSpeech.ERROR) {
                    textToSpeech.setLanguage(Locale.US);
                }
            }
        });

        BaseFragment.replaceFragmentNotInBackstack(R.id.fragment_container,
                                                   this,
                                                   new HomeFragment(),
                                                   HomeFragment.class.getSimpleName());
    }

    @Override
    public void onBackPressed() {
        //TODO fix back button
        //        if (QuestionFragment.count > 0) {
        //            QuestionFragment.count--;
        //        }
        //        super.onBackPressed();
    }
}
