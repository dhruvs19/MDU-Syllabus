package com.myfirstapp.dhruv.myfirstapp;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.content.Intent;
import android.view.View;


public class semester extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_semester, menu);

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

public void DisplaySem1(View view){

Intent display = new Intent(this, displayfirstsubs.class);
startActivity(display);


}

    public void displaySem2(View view){

        Intent sem2 = new Intent(this, displaysecondsubs.class);
        startActivity(sem2);


    }


}
