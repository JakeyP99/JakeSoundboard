package com.example.jakesoundboard;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    public SoundPool soundPool;
     public int sound1, sound2, sound3, sound4, sound5, sound6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button stopbtn = (Button) findViewById(R.id.stopbtn);

        stopbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(), "You can never stop me!", Toast.LENGTH_SHORT).show();
            }
        });


        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            AudioAttributes audioAttributes = new AudioAttributes.Builder()
                    .setUsage(AudioAttributes.USAGE_GAME)
                    .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                    .build();

            soundPool = new SoundPool.Builder()
                    .setMaxStreams(18)
                    .setAudioAttributes(audioAttributes)
                    .build();
        } else
            soundPool = new SoundPool(18, AudioManager.STREAM_MUSIC, 0);

        final int sound1 = soundPool.load(this, R.raw.bigoooff, 1);
        final int sound2 = soundPool.load(this, R.raw.drinking, 1);
        final int sound3 = soundPool.load(this, R.raw.eating, 1);
        final int sound4 = soundPool.load(this, R.raw.heythere, 1);
        final int sound5 = soundPool.load(this, R.raw.littleoooff, 1);
        final int sound7 = soundPool.load(this, R.raw.moan, 1);
        final int sound8 = soundPool.load(this, R.raw.moan_2, 1);
        final int sound9 = soundPool.load(this, R.raw.nma, 1);
        final int sound10 = soundPool.load(this, R.raw.oooff, 1);
        final int sound11 = soundPool.load(this, R.raw.pez, 1);
        final int sound12 = soundPool.load(this, R.raw.grrrr, 1);
        final int sound13 = soundPool.load(this, R.raw.growl, 1);
        final int sound14 = soundPool.load(this, R.raw.scratch_2, 1);
        final int sound15 = soundPool.load(this, R.raw.highhat, 1);
        final int sound16 = soundPool.load(this, R.raw.bass, 1);
        final int sound17 = soundPool.load(this, R.raw.scratch, 1);
        final int sound18 = soundPool.load(this, R.raw.highhat_2, 1);
        final int sound19 = soundPool.load(this, R.raw.wcyd, 1);
        final int sound20 = soundPool.load(this, R.raw.chuckle, 1);



        final Button oooffbtn = findViewById(R.id.oooffbtn);
        final Button bigoooffbtn = findViewById(R.id.bigoooffbtn);
        final Button littleooffbtn = findViewById(R.id.littleoooff);
        final Button PEZbtn = findViewById(R.id.PEZbtn);
        final Button WCYDbtn = findViewById(R.id.WCYDbtn);
        final Button moanbtn = findViewById(R.id.moan);
        final Button moan2btn = findViewById(R.id.moan2);
        final Button heytherebtn = findViewById(R.id.hey);
        final Button NMAbtn = findViewById(R.id.NMAbtn);
        final Button drinkingbtn = findViewById(R.id.drinking);
        final Button eatingbtn = findViewById(R.id.eating);
        final Button chucklebtn = findViewById(R.id.chuckle);
        final Button beatbox1btn = findViewById(R.id.beatbox);
        final Button beatbox2btn = findViewById(R.id.Beatbox2);
        final Button beatbox3btn = findViewById(R.id.Beatbox3);
        final Button beatbox4btn = findViewById(R.id.beatbox4);
        final Button beatbox5btn = findViewById(R.id.Beatbox5);
        final Button beatbox6btn = findViewById(R.id.Beatbox6);

        oooffbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(sound10, 1, 1, 0, 0, 1);
            }
        });

        bigoooffbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(sound1, 1, 1, 0, 0, 1);
            }
        });

        littleooffbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(sound5, 1, 1, 0, 0, 1);
            }
        });

        PEZbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(sound11, 1, 1, 0, 0, 1);
            }
        });

        WCYDbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(sound19, 1, 1, 0, 0, 1);
            }
        });

        moanbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(sound7, 1, 1, 0, 0, 1);
            }
        });

        moan2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(sound8, 1, 1, 0, 0, 1);
            }
        });

        chucklebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(sound20, 1, 1, 0, 0, 1);
            }
        });

        heytherebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(sound4, 1, 1, 0, 0, 1);
            }
        });

        NMAbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(sound9, 1, 1, 0, 0, 1);
            }
        });

        drinkingbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(sound2, 1, 1, 0, 0, 1);
            }
        });

        eatingbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(sound3, 1, 1, 0, 0, 1);
            }
        });

        beatbox1btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(sound16, 1, 1, 0, 0, 1);
            }
        });

        beatbox2btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(sound18, 1, 1, 0, 0, 1);
            }
        });

        beatbox3btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(sound15, 1, 1, 0, 0, 1);
            }
        });

        beatbox4btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(sound17, 1, 1, 0, 0, 1);
            }
        });

        beatbox5btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(sound14, 1, 1, 0, 0, 1);
            }
        });

        beatbox6btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                soundPool.play(sound13, 1, 1, 0, 0, 1);
            }

        });
    }}

