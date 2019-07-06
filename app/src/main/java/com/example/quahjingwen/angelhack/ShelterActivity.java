package com.example.quahjingwen.angelhack;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class ShelterActivity extends AppCompatActivity {

    private Button button_alert;
    private Button button_friends;
    private Button button_shelter;
    private Button button_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shelter);

        button_alert = (Button)findViewById(R.id.button_alert);
        button_friends = (Button)findViewById(R.id.button_friends);
        button_shelter = (Button)findViewById(R.id.button_shelter);
        button_profile = (Button)findViewById(R.id.button_profile);

        button_alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShelterActivity.this, AlertActivity.class);
                startActivity(intent);
            }
        });

        button_friends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShelterActivity.this, MapsActivity.class);
                startActivity(intent);
            }
        });

        button_shelter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShelterActivity.this, ShelterActivity.class);
                startActivity(intent);
            }
        });

        button_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ShelterActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });

    }
}
