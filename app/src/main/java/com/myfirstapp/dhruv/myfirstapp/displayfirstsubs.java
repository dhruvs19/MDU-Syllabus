package com.myfirstapp.dhruv.myfirstapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;


public class displayfirstsubs extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displayfirstsubs);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_displayfirstsubs, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        switch(item.getItemId()){

            case R.id.about:
                Intent aboutdev = new Intent(this, webviewactivity.class);
                aboutdev.putExtra("sem", "aboutdev");
                startActivity(aboutdev);
                return true;
            case R.id.action_share:
                Intent share = new Intent(android.content.Intent.ACTION_SEND);
                share.setType("text/plain");
                share.putExtra(Intent.EXTRA_TEXT, "Download the MDU B.tech Syllabus app: https://db.tt/StuzY9t3");
                startActivity(Intent.createChooser(share,"Share via"));
                return true;

        }

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }


public void maths(View view){

Intent webview = new Intent(this, webviewactivity.class);
    webview.putExtra("sem","sem1");
webview.putExtra("sub","maths");
startActivity(webview);

}

public void english(View view){

  Intent webview = new Intent(this, webviewactivity.class);
  webview.putExtra("sem","sem1");
  webview.putExtra("sub","english");
  startActivity(webview);

}

    public void physics(View view) {

        Intent webview = new Intent(this, webviewactivity.class);
        webview.putExtra("sem","sem1");
        webview.putExtra("sub", "physics");
        startActivity(webview);

    }

    public void boesem1(View view) {

        Intent webview = new Intent(this, webviewactivity.class);
        webview.putExtra("sem","sem1");
        webview.putExtra("sub", "boe");
        startActivity(webview);

    }


    public void focp(View view) {

        Intent webview = new Intent(this, webviewactivity.class);
        webview.putExtra("sem","sem1");
        webview.putExtra("sub", "focp");
        startActivity(webview);

    }

    public void bme(View view) {

        Intent webview = new Intent(this, webviewactivity.class);
        webview.putExtra("sem","sem1");
        webview.putExtra("sub", "bme");
        startActivity(webview);

    }

}
