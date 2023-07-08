package com.example.letterplay;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button Playbutton;
    Button Displaybutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Playbutton = findViewById(R.id.Play);
        Displaybutton=findViewById(R.id.Results);

        try {
            Playbutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    MyFragment fragmentOne = new MyFragment();
                    FragmentTransaction transaction =getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.fragment_container, fragmentOne);
                    transaction.commit();
                }
            });
            Displaybutton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    DisplayFragment Frag = new DisplayFragment();
                    FragmentTransaction transaction =getSupportFragmentManager().beginTransaction();
                    transaction.replace(R.id.fragment_container, Frag);
                    transaction.commit();
                }
            });
        }
        catch (Exception e){
            Toast.makeText(this, ""+e.getMessage(), Toast.LENGTH_SHORT).show();
        }
    }
}