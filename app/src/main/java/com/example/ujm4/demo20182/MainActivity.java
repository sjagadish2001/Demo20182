package com.example.ujm4.demo20182;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

   public void buttonClick(View view){
       EditText nameEditText = (EditText)findViewById(R.id.nameEditText);

       Log.i("Info","button 2 clicked");
       Log.i("Values",nameEditText.getText().toString());
   }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Code here executes on main thread after user presses button
                Log.i("info","Button clicked");
            }
        });
    }
}
