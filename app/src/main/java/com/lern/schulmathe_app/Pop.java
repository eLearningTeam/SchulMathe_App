package com.lern.schulmathe_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.TextView;

/**
 * Created by tavosh on 26/09/2016.
 */
public class Pop extends Activity {
    //
    public final static String POP_MESSAGE = "";
    TextView txtTitle, txtSentence1, txtSentence2;
    String cntntVw;

    @Override
    protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.popwindow);

        Intent intent = getIntent();
        cntntVw = intent.getExtras().getString(MainActivity.EXTRA_MESSAGE);

        txtTitle = (TextView) findViewById(R.id.textTitle);
        txtSentence1 = (TextView) findViewById(R.id.textSentence1);
        txtSentence2 = (TextView) findViewById(R.id.textSentence2);

        DisplayMetrics dm = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(dm);
        int width = dm.widthPixels;
        int height = dm.heightPixels;
        // width 80% of the screen and  Height 50%
        getWindow().setLayout((int)(width*.9),(int)(height*.2));

        if (cntntVw.equals("t")) {
            txtTitle.setText(getString(R.string.StartingTest));
            txtSentence1.setText(getString(R.string.Message2Test));
            txtSentence2.setText(getString(R.string.secondMessage2Test));
        } else if(cntntVw.equals("p")) {
            txtTitle.setText(getString(R.string.StartingPool));
            txtSentence1.setText(getString(R.string.Message2Pool));
            txtSentence2.setText(getString(R.string.secondMessage2Pool));
        }
    }

    /* Returns to the first screen */
    public void closePop(View view) {
        //Intent intent = new Intent(this, MainActivity.class);

        //sends the name of which layout to use to the new intent
        //int xmlScreen = R.layout.activity_main;
        //intent.putExtra(EXTRA_MESSAGE, xmlScreen);
        //startActivity(intent);
        //finish();
        System.exit(0);
    }
}
