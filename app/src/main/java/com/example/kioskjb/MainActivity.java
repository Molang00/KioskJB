package com.example.kioskjb;

import android.content.Intent;
import android.telephony.mbms.MbmsErrors;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        initializeLayout();
    }

    private void initializeLayout() {
        Button b = (Button)findViewById(R.id.button);
        b.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), ButtonActivity.class);
                startActivity(intent);
            }
        });
    }
}
