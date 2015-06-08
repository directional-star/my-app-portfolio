package com.directionalstar.googleandroidnanodegree;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;
import android.view.*;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void sendMessage(View v){
        Button pressed = (Button)findViewById(v.getId());
        String toastText = "";
        switch (pressed.getId()) {
            case R.id.spotifyStreamAppButton: toastText = "This will launch Spotify Streamer App";
                break;
            case R.id.scoresAppButton: toastText = "This will launch Scores App";
                break;
            case R.id.xyzReaderAppButton: toastText = "This will launch XYZ Reader App ";
                break;
            case R.id.capstoneAppButton: toastText = "This will launch Capston App";
                break;
            case R.id.libraryAppButton: toastText = "This will launch Library App";
                break;
            case R.id.buildItBiggerAppButton: toastText = "This will launch Build It Bigger App";
                break;
            default: toastText = "Unknown Button pressed";
                break;

        }

        Toast.makeText(getApplicationContext(),toastText,Toast.LENGTH_SHORT).show();
    }
}
