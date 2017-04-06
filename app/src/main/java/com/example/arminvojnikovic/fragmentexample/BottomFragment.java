package com.example.arminvojnikovic.fragmentexample;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Armin Vojnikovic on 2017-03-30.
 */

public class BottomFragment extends Fragment {

    TextView topImgText;
    TextView bottomImgText;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottom_section_fragment,container,false);

        topImgText = (TextView)view.findViewById(R.id.top_img_text);
        bottomImgText = (TextView)view.findViewById(R.id.bottom_img_text);

        return view;
    }

    public void setImgText(String top, String bottom){
        topImgText.setText(top);
        bottomImgText.setText(bottom);
    }
}
