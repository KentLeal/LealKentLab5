package com.example.kjele.lealkentlab5;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
    }
    public void process(View v) {
        Intent i = null, chooser = null;
        if (v.getId() == R.id.actButton) {
            i = new Intent(this, MainActivity.class);
            startActivity(i);
        } else if (v.getId() == R.id.mapButton) {
            i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse("geo://14.5869° N, 120.9812° E"));
            chooser = Intent.createChooser(i, "Choose a Map App");
            startActivity(chooser);
        }
    }
}
