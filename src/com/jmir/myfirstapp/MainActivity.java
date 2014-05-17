package com.jmir.myfirstapp;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.os.Build;

public class MainActivity extends ActionBarActivity {

	public EditText etWords; 
	public TextView tvLabel;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); // link java src to the resource layout xml file

        //etWords = findViewById(R.id.etWords);
        etWords = (EditText) findViewById(R.id.etWords);
        tvLabel = (TextView) findViewById(R.id.tvLabel);
        
/*          if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new PlaceholderFragment())
                    .commit();
        } commented out per class instructions */
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }  /* this method isn't in the tutorial */
    
    public void onSubmit(View v) {
       // this fires with submit button	
    	String fieldVal = etWords.getText().toString();
    	tvLabel.setText(fieldVal);
    	Context context = getApplicationContext();
    	CharSequence text = fieldVal;
    	int duration = Toast.LENGTH_SHORT;
    	Toast toast = Toast.makeText(context, text, duration);
    	toast.show();
    } 

    /**
     * A placeholder fragment containing a simple view.
     */
 /*  public static class PlaceholderFragment extends Fragment {

        public PlaceholderFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                Bundle savedInstanceState) {
            View rootView = inflater.inflate(R.layout.fragment_main, container, false);
            return rootView;
        }
    } commented out per class instructions */

}
    
