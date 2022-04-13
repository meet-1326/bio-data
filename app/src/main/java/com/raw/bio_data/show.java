package com.raw.bio_data;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class show extends AppCompatActivity {

    TextView tvname,tvsurename,tvfathername,tvdate,tvgender,tvmothername,tvemail,tvphon,tvaddress,tvreligion,tveduction,tvhobby;
    String name,surename,fathername,date,gender,mothername,email,phon,address,religion,eduction,hobby;
    Button call;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        tvname = findViewById(R.id.tvname);
        tvsurename = findViewById(R.id.tvsurename);
        tvfathername = findViewById(R.id.tvfathername);
        tvmothername = findViewById(R.id.tvmothername);
        tvdate = findViewById(R.id.tvdate);
        tvgender = findViewById(R.id.tvgender);
        tvemail = findViewById(R.id.tvemail);
        tvphon = findViewById(R.id.tvphon);
        tvaddress = findViewById(R.id.tvaddress);
        tvreligion = findViewById(R.id.tvreligion);
        tveduction = findViewById(R.id.tveduction);
        tvhobby = findViewById(R.id.tvhobby);

        call = findViewById(R.id.call);

        name = getIntent().getStringExtra("name");
        surename = getIntent().getStringExtra("surename");
        fathername = getIntent().getStringExtra("fathername");
        mothername = getIntent().getStringExtra("mothername");
        gender = getIntent().getStringExtra("gender");
        date = getIntent().getStringExtra("date");
        email = getIntent().getStringExtra("email");
        phon = getIntent().getStringExtra("phon");
        address = getIntent().getStringExtra("address");
        religion = getIntent().getStringExtra("religion");
        eduction = getIntent().getStringExtra("eduction");
        hobby = getIntent().getStringExtra("hobby");

        tvname.setText(name);
        tvsurename.setText(surename);
        tvfathername.setText(fathername);
        tvmothername.setText(mothername);
        tvdate.setText(date);
        tvgender.setText(gender);
        tvemail.setText(email);
        tvphon.setText(phon);
        tvaddress.setText(address);
        tvreligion.setText(religion);
        tveduction.setText(eduction);
        tvhobby.setText(hobby);

        call.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:"+phon));
                startActivity(intent);
            }
        });

    }
}