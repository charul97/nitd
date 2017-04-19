package com.example.charul.webservicedemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by charul on 18/4/17.
 */
public class BloodGroup extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.blood_group);
        Button buttonDonate = (Button)findViewById(R.id.proceed);

        buttonDonate.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the donate category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link MainActivity1}
                Intent a= new Intent(BloodGroup.this, NeedInfo.class);

                // Start the new activity
                startActivity(a);
            }
        });
    }
}
