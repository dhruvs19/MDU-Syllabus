package com.myfirstapp.dhruv.myfirstapp;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Toast;
import android.widget.ShareActionProvider;
public class MainActivity extends ActionBarActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;

    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
       // int id = item.getItemId();
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

        return super.onOptionsItemSelected(item);
    }



public void ChooseSem(View view){

Intent first = new Intent(this, semester.class);
startActivity(first);

}

    public void showtoast(View v){
        String message = "Coming In Next Versions Of The App!";
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();


    }


}

