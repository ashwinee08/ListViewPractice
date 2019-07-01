package com.example.mylistviewapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getHold();

        listView.setAdapter(new ListViewAdapter(10, this));
    }



    private void getHold() {
        listView=findViewById(R.id.list_view);
    }
}
