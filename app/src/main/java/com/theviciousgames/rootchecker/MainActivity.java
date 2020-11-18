package com.theviciousgames.rootchecker;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Window;
import android.view.WindowManager;
import android.widget.RelativeLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView rootStatusTextView;
    private RelativeLayout relativeLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        declareVars();
        getInfo();
    }

    protected void declareVars()
    {
        relativeLayout=findViewById(R.id.relativeLayout);
        rootStatusTextView=findViewById(R.id.rootStatusTextView);
    }

    protected void getInfo()
    {
        if(!Tools.getRootStatus())
        {
            rootStatusTextView.setText("NOT\nROOTED");
            changeColors();
        }
    }

    protected void changeColors()
    {
        relativeLayout.setBackgroundColor(Color.RED);
        Window window = getWindow();
        window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
        window.setStatusBarColor(Color.RED);
        window.setNavigationBarColor(Color.RED);
    }
}