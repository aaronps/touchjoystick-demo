package com.aaronps.touchjoystickdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.TextView;

import com.aaronps.touchjoystick.SplitJoystick;

public class MainActivity extends AppCompatActivity implements SplitJoystick.Listener {

    final static String TAG = "Main";

    SplitJoystick mTouchJoystick;
    TextView mVerticalTextView;
    TextView mHorizontalTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

//        getWindow().setFlags( WindowManager.LayoutParams.FLAG_FULLSCREEN,
//                              WindowManager.LayoutParams.FLAG_FULLSCREEN );

        setContentView(R.layout.activity_main);

        mVerticalTextView = (TextView) findViewById(R.id.vertical_value);
        mHorizontalTextView = (TextView) findViewById(R.id.horizontal_value);

        mTouchJoystick = new SplitJoystick(this, this);
    }

    static int findRadius(int value) {
        return (value * 2) / 3;
    }

    @Override
    public void onVerticalJoyChange(float value) {
        mVerticalTextView.setText(String.format("%.02f", value));
    }

    @Override
    public void onHorizontalJoyChange(float value) {
        mHorizontalTextView.setText(String.format("%.02f", value));

    }
}
