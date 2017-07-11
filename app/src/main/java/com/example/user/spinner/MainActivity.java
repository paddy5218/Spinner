package com.example.user.spinner;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import static com.example.user.spinner.R.id.parent;

public class MainActivity extends AppCompatActivity {
     Spinner  spinner;
     TextView textView;
     CheckBox checkbox;
     String[] fruit = new String[]{"香蕉","蘋果","鳳梨"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        spinner = (Spinner) findViewById(R.id.spinner);
        textView = (TextView) findViewById(R.id.textView);
        ArrayAdapter<String> adapterFruit = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, fruit);

        adapterFruit.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapterFruit);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                textView.setText(parent.getSelectedItem().toString());
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
          checkbox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
              @Override
              public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                  if(checkbox.isChecked())
                      Toast.makeText(MainActivity.this, "已選取", Toast.LENGTH_SHORT).show();
                  else
                      Toast.makeText(MainActivity.this, "未選取", Toast.LENGTH_SHORT).show();
              }
          });



    }
}