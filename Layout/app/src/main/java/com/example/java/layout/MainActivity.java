package com.example.java.layout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

import jp.wasabeef.recyclerview.adapters.AlphaInAnimationAdapter;
import jp.wasabeef.recyclerview.adapters.ScaleInAnimationAdapter;

public class MainActivity extends AppCompatActivity {

    String movieStrings[] = {
            "X-Men",
            "Captain",
            "X-Men1",
            "Captain2",
            "X-Men2",
            "Captain3",
            "X-Men33",
            "Captain33",
            "X-Men33",
            "Captai33n",
            "X-Me3n",
            "Capt3ain",
            "X-M3e3n",
            "Cap33tain",
            "X-M333en",
            "Cap33tain",
            "X-M333en",
            "Cap33333tain",
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.recycler_view);


        //Linear List
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(linearLayoutManager);
//        Grid List
/*        GridLayoutManager gridLayoutManager = new GridLayoutManager(getApplicationContext(),2);
        recyclerView.setLayoutManager(gridLayoutManager);*/
        ArrayList<Movie> movies = new ArrayList<>();

        for(int i=0; i<movieStrings.length;i++) {
            Movie movie = new Movie(movieStrings[i], "Action", "2016");
            movies.add(movie);
        }
        MoviesAdapter moviesAdapter = new MoviesAdapter(movies);
        recyclerView.setAdapter(new ScaleInAnimationAdapter(moviesAdapter));
//        recyclerView.setAdapter(moviesAdapter);

    }
}
