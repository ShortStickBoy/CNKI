package com.sunzn.cnki.sample;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.sunzn.cnki.library.Format;
import com.sunzn.cnki.library.Marker;
import com.sunzn.cnki.library.Values;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        String s = Format.CAJ;
        String x = Marker.M1;
        String c = Values.EMPTY;
        String ccc = Marker.INSTANCE.route("");
    }

}
