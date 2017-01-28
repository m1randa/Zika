package com.auth.csd.zika;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

public class MapActivity extends AppCompatActivity {

    private Spinner spinner;
    private Button button;
    private EditText searchInput;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_map);

        spinner = (Spinner) findViewById(R.id.virus_spinner);
        spinner.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int pos, long l) {
                String virus = adapterView.getItemAtPosition(pos).toString();
                System.out.println("Virus selected: " + virus);
            }
        });

        button = (Button) findViewById(R.id.search_button);

        searchInput = (EditText) findViewById(R.id.search_text);

        WebView webview = (WebView) findViewById(R.id.web_view);
        webview.loadUrl("https://maps.google.com");

    }


    public void searchAddress(View view) {
        String address = searchInput.toString();
    }
}
