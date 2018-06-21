package com.example.android.sinemistanbultourappp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.widget.ImageView;
import android.widget.TextView;

public class TourDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tour_details);

        Intent intent = getIntent();
        int detailImage = intent.getIntExtra("picture",0);
        int detailName = intent.getIntExtra("name",0);
        int detailOpenHours = intent.getIntExtra("openHours",0);
        int detailTelephone = intent.getIntExtra("telephone",0);
        int detailPrice = intent.getIntExtra("price", 0);
        int detailAddress = intent.getIntExtra("address", 0);

        ImageView pictureImageView = findViewById(R.id.detail_picture);
        pictureImageView.setImageResource(detailImage);

        TextView nameTextView = findViewById(R.id.detail_name);
        nameTextView.setText(detailName);

        TextView openHoursTextView = findViewById(R.id.detail_open_hours);
        openHoursTextView.setText(detailOpenHours);

        TextView telephoneTextView = findViewById(R.id.detail_telephone);
        telephoneTextView.setText(detailTelephone);

        TextView priceTextView = findViewById(R.id.detail_price);
        priceTextView.setText(detailPrice);

        TextView addressTextView = findViewById(R.id.detail_address);
        addressTextView.setText(detailAddress);

    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                onBackPressed();
                return true;
        }

        return(super.onOptionsItemSelected(item));
    }

}
