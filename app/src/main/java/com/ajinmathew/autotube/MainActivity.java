package com.ajinmathew.autotube;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btnHolyMass,btnAbhishekgni,btnavilaSadan,btnMarimayam,btnChakkapazham;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btnHolyMass=findViewById(R.id.btnHolyMass);
        btnAbhishekgni=findViewById(R.id.btnAbhishekgni);
        btnavilaSadan=findViewById(R.id.btnAvilaSadan);
        btnChakkapazham=findViewById(R.id.btnChakkapapazham);
        btnMarimayam=findViewById(R.id.btnMarimayam);
        btnHolyMass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=null;
                try {
                    intent =new Intent(Intent.ACTION_VIEW);
                    intent.setPackage("com.google.android.youtube");
                    intent.setData(Uri.parse("http://www.youtube.com/results?search_query=holy+mass+malayalam+syro+malabar+latest"));
                    startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("http://www.youtube.com/results?search_query=holy+mass+malayalam+syro+malabar+latest"));
                    startActivity(intent);
                }
            }
        });
        btnAbhishekgni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=null;
                try {
                    intent =new Intent(Intent.ACTION_VIEW);
                    intent.setPackage("com.google.android.youtube");
                    intent.setData(Uri.parse("http://www.youtube.com/results?search_query=ABHISHEKAGNI"));
                    startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("http://www.youtube.com/results?search_query=ABHISHEKAGNI"));
                    startActivity(intent);
                }
            }
        });
        btnavilaSadan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=null;
                try {
                    intent =new Intent(Intent.ACTION_VIEW);
                    intent.setPackage("com.google.android.youtube");
                    intent.setData(Uri.parse("http://www.youtube.com/channel/UCaUmc1BLqvtYflcxMqmKevQ"));
                    startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("http://www.youtube.com/channel/UCaUmc1BLqvtYflcxMqmKevQ"));
                    startActivity(intent);
                }
            }
        });
        btnMarimayam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=null;
                try {
                    intent =new Intent(Intent.ACTION_VIEW);
                    intent.setPackage("com.google.android.youtube");
                    intent.setData(Uri.parse("http://www.youtube.com/results?search_query=marimayam+latest+episode"));
                    startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("http://www.youtube.com/results?search_query=marimayam+latest+episode"));
                    startActivity(intent);
                }
            }
        });
        btnChakkapazham.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=null;
                try {
                    intent =new Intent(Intent.ACTION_VIEW);
                    intent.setPackage("com.google.android.youtube");
                    intent.setData(Uri.parse("http://www.youtube.com/results?search_query=chakkappazham+latest+episode"));
                    startActivity(intent);
                } catch (ActivityNotFoundException e) {
                    intent = new Intent(Intent.ACTION_VIEW);
                    intent.setData(Uri.parse("http://www.youtube.com/results?search_query=chakkappazham+latest+episode"));
                    startActivity(intent);
                }
            }
        });

    }
}