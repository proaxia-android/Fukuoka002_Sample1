package jp.co.proaxia_consulting.fukuoka002_sample1;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import android.view.*;
import android.view.View.*;
import android.widget.TextView;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.button).setOnTouchListener(new SampleTouchListener());
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

    class SampleTouchListener implements OnTouchListener
    {
        public boolean onTouch(View v, MotionEvent e)
        {
            TextView tv = (TextView) findViewById(R.id.textView2);

            if(e.getAction() == MotionEvent.ACTION_DOWN)
            {
                tv.setText("こんにちは");
            }
            else if(e.getAction() == MotionEvent.ACTION_UP)
            {
                tv.setText("さようなら");
            }
            return true;
        }
    }

}
