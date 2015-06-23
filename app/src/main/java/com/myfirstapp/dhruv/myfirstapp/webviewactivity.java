package com.myfirstapp.dhruv.myfirstapp;

import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebView;
import android.content.Intent;

public class webviewactivity extends ActionBarActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webviewactivity);
        ActionBar actionBar = getSupportActionBar();
        actionBar.hide();
        webView = (WebView) findViewById(R.id.webView1);
        webView.getSettings().setJavaScriptEnabled(true);

        Intent intent = getIntent();
        String subject = intent.getStringExtra("sub");
        String sem = intent.getStringExtra("sem");



        if (sem.equals("sem1")) {
               if (subject.equals("maths"))                                                              //     1'ST SEMESTER
            {   webView.loadUrl("file:///android_asset/sem1/maths.HTML"); }
              else if (subject.equals("english")) {
                webView.loadUrl("file:///android_asset/sem1/english.html");
            } else if (subject.equals("physics")) {
                webView.loadUrl("file:///android_asset/sem1/physics.html");
            } else if (subject.equals("boe")) {
                webView.loadUrl("file:///android_asset/sem1/boesem1.html");
            } else if (subject.equals("focp")) {
                webView.loadUrl("file:///android_asset/sem1/focp.html");
            } else if (subject.equals("bme")) {
                webView.loadUrl("file:///android_asset/sem1/bme.html");
            }
        }

        else if(sem.equals("sem2"))  {                                                                //    2'ND SEMESTER
            if (subject.equals("maths"))                                                              //     1'ST SEMESTER
        {   webView.loadUrl("file:///android_asset/sem2/maths.html"); }
            else if (subject.equals("english")) {
                webView.loadUrl("file:///android_asset/sem2/english.html"); }
            else if (subject.equals("physics")) {
                webView.loadUrl("file:///android_asset/sem2/physics.html"); }
            else if (subject.equals("chemistry")) {
                webView.loadUrl("file:///android_asset/sem2/chemistry.html"); }
            else if (subject.equals("worktech")) {
                webView.loadUrl("file:///android_asset/sem2/workshoptech.html"); }
            else if (subject.equals("electech")) {
                webView.loadUrl("file:///android_asset/sem2/electech.html"); }
            else if (subject.equals("engdraw")) {
                webView.loadUrl("file:///android_asset/sem2/engdrawing.html"); }


        }

        else if(sem.equals("aboutdev")){
                webView.loadUrl("file:///android_asset/about_developer.html");



        }

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_webviewactivity, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement


        return super.onOptionsItemSelected(item);
    }
}
