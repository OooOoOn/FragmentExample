package com.example.arminvojnikovic.fragmentexample;

import android.app.Fragment;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Armin Vojnikovic on 2017-03-30.
 */

public class TopFragment extends Fragment {

    //we tell our app how the layout look like
    EditText topTextInput;
    EditText bottomTextInput;


    TopSectionListener activityCommander;
    public interface TopSectionListener{
        void createText(String top, String bottom);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        try{
            activityCommander = (TopSectionListener)context;
        }catch (ClassCastException e){
            throw new ClassCastException(context.toString());
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.top_section_fragment,container,false);

        topTextInput = (EditText)view.findViewById(R.id.top_TextInput);
        bottomTextInput = (EditText)view.findViewById(R.id.bottom_TextInput);
        Button button = (Button)view.findViewById(R.id.button1);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                activityCommander.createText(topTextInput.getText().toString(),bottomTextInput.getText().toString());
            }
        });

        return view;

    }
}
