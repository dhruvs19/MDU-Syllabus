package com.myfirstapp.dhruv.myfirstapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;


public class displaysecondsubs extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_displaysecondsubs);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_displaysecondsubs, menu);
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


    public void displaysem2(View view) {                                                               //2ND SEMESTER WEBVIEW


        Intent webview = new Intent(this, webviewactivity.class);
        webview.putExtra("sem","sem2");

        switch (view.getId()) {

            case R.id.mathsem2:
                webview.putExtra("sub", "maths");
                break;
            case R.id.engsem2:
                webview.putExtra("sub", "english");
                break;
            case R.id.physem2:
                webview.putExtra("sub", "physics");
                break;
            case R.id.chemsem2:
                webview.putExtra("sub", "chemistry");
                break;
            case R.id.wtsem2:
                webview.putExtra("sub","worktech");
                break;
            case R.id.etsem2:
                webview.putExtra("sub","electech");
                break;
            case R.id.egdsem2:
                webview.putExtra("sub","engdraw");
                break;
        }

    startActivity(webview);

    }


}
