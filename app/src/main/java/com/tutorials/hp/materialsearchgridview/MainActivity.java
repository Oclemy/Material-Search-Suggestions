package com.tutorials.hp.materialsearchgridview;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

import br.com.mauker.materialsearchview.MaterialSearchView;

public class MainActivity extends AppCompatActivity {

   MaterialSearchView msv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);


        msv= (MaterialSearchView) findViewById(R.id.msv);
        msv.addSuggestions(new String[]{"Casini","Andromeda","Europa","Voyager","Spitzer","Hubble"});

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                msv.openSearch();

            }
        });
    }

    @Override
    public void onBackPressed() {
       if(msv.isOpen())
       {
           msv.closeSearch();
       }else
       {
           super.onBackPressed();
       }
    }
}
