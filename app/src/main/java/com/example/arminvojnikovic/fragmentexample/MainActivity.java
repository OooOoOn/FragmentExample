package com.example.arminvojnikovic.fragmentexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity implements TopFragment.TopSectionListener {

    //myunneccessary comment

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void createText(String top, String bottom) {
        BottomFragment bottomFragment = (BottomFragment)getFragmentManager().findFragmentById(R.id.fragment2);
        bottomFragment.setImgText(top,bottom);
    }
}
