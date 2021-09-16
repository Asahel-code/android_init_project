package com.example.javaproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    public static void main(String[] args) {
        Course c = new Course("Computer science");

        System.out.println(c.getCourse_name());
    }

    EditText name;
    EditText email;
    EditText course;
    Button toProfile;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        course = findViewById(R.id.course);
        toProfile = findViewById(R.id.toProfile);

        name.setText("");
        email.setText("");
        course.setText("");

        toProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String getName = name.getText().toString();
                String getEmail = email.getText().toString();
                String getCourse = course.getText().toString();

                Intent intent = new Intent(view.getContext(), ProfileActivity.class);

                intent.putExtra("NAME", getName);
                intent.putExtra("EMAIL", getEmail);
                intent.putExtra("COURSE", getCourse);

                startActivity(intent);

                System.out.println(name.getText().toString());
                System.out.println(email.getText().toString());
                System.out.println(course.getText().toString());

            }
        });

    }
}