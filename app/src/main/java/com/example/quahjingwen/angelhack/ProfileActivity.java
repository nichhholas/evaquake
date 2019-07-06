package com.example.quahjingwen.angelhack;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class ProfileActivity extends AppCompatActivity {

    private FirebaseAuth mAuth;
    private FirebaseUser user;
    private TextView Email;
    private TextView Uid;
    private Button logout;
    private Button map;

    private Button button_alert;
    private Button button_friends;
    private Button button_shelter;
    private Button button_profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        Email = (TextView)findViewById(R.id.profileEmail);
        Uid = (TextView)findViewById(R.id.profileUid);
        mAuth = FirebaseAuth.getInstance();
        logout = (Button)findViewById(R.id.button_logout);
        // map = (Button)findViewById(R.id.button_map);
        user = mAuth.getCurrentUser();

        button_alert = (Button)findViewById(R.id.button_alert);
        button_friends = (Button)findViewById(R.id.button_friends);
        button_shelter = (Button)findViewById(R.id.button_shelter);
        button_profile = (Button)findViewById(R.id.button_profile);


        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (v==logout){
                    if (user != null) {
                        mAuth.signOut();
                        startActivity(new Intent(getApplicationContext(), LoginActivity.class));
                    }
                }
            }
        });


        if (user != null){
            String email = user.getEmail();
            String uid = user.getUid();
            Email.setText(email);
            Uid.setText(uid);
        }

        button_alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, AlertActivity.class);
                startActivity(intent);
            }
        });

        button_friends.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, MapsActivity.class);
                startActivity(intent);
            }
        });

        button_shelter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, ShelterActivity.class);
                startActivity(intent);
            }
        });

        button_profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ProfileActivity.this, ProfileActivity.class);
                startActivity(intent);
            }
        });
    }
}