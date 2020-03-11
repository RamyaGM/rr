package com.example.play;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Music> arrayList;
    private CustomMusicAdapter adapter;
    private ListView songList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        songList = (ListView) findViewById(R.id.songList);
        arrayList = new ArrayList<>();
        arrayList.add(new Music("Afreen Afreen", "Rahat Fateh Ali Khan, Momina Mustehsan", R.raw.pp));
       arrayList.add(new Music("Aik Alif", "Saieen Zahoor, Noori", R.raw.qq));
       arrayList.add(new Music("Tajdar e haram", "Atif Aslam", R.raw.rr));
        arrayList.add(new Music("Aaj Rung", "Amjad Sabri,  Rahat Fateh Ali Khan", R.raw.ss));
        arrayList.add(new Music("Ae dil", "Ali Zafar, Sara Haider", R.raw.tt));
        arrayList.add(new Music("Man Amadeh am", "Atif Aslam, Gul Panrra", R.raw.uu));
        arrayList.add(new Music("Bewajah", "Nabeel Shaukat Ali", R.raw.vv));
        arrayList.add(new Music("Dinae Dinae", "Harshadeep Kaur", R.raw.ww));
        arrayList.add(new Music("Tera woh pyar", "Momina Mustehsan, Asim Azhar", R.raw.xx));
        arrayList.add(new Music("Shamaan Pai gaiyan", "Rachel Viccaji, Kashif Ali", R.raw.yy));







        adapter = new CustomMusicAdapter(this, R.layout.custom_music_item, arrayList);
        songList.setAdapter(adapter);
    }
}
