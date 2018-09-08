package com.example.k_sawa.mynendapp;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import net.nend.android.NendAdInterstitialVideo;

public class MainActivity extends AppCompatActivity{

    private NendAdInterstitialVideo mNendAdInterstitialVideo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mNendAdInterstitialVideo = new NendAdInterstitialVideo(this,802559,"e9527a2ac8d1f39a667dfe0f7c169513b090ad44");
        mNendAdInterstitialVideo.loadAd();


        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mNendAdInterstitialVideo.isLoaded())
                    mNendAdInterstitialVideo.showAd(MainActivity.this);
            }
        });

    }
}