package com.rhar.age;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class book_details extends AppCompatActivity {
    private TextView tvTitle, tvDescription, tvDispo;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book_details);
//        Toolbar toolbar = findViewById(R.id.toolbar);
//        setSupportActionBar(toolbar);

        FloatingActionButton fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        tvTitle = findViewById(R.id.bookTitle_id);
        tvDescription = findViewById(R.id.bookDescription_id);
        tvDispo = findViewById(R.id.bookStatut_id);
        img = findViewById(R.id.bookThumbnail_id);

        Intent intent = getIntent();
        String title = intent.getExtras().getString("carTitle");
        String description = intent.getExtras().getString("carDescription");
        int thumbnail = intent.getExtras().getInt("carThumbnail");
        boolean disponibility = intent.getExtras().getBoolean("carDisponibility");

        tvTitle.setText(title);
        tvDescription.setText(description);
        img.setImageResource(thumbnail);

        if (disponibility) {
            tvDispo.setText("Disponible");
        } else tvDispo.setText("Loué");

    }
}
