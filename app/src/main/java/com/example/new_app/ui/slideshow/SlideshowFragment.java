package com.example.new_app.ui.slideshow;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.new_app.R;

public class SlideshowFragment extends Fragment implements View.OnClickListener{

    private EditText editTextNumber9,editTextNumber,editTextNumber3,editTextNumber4,editTextNumber5,editTextNumber6,editTextNumber7,editTextNumber8;
    private Button button;
    private TextView textView,textView5,text_view;
    private String s;
    private SlideshowViewModel slideshowViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        slideshowViewModel =
                ViewModelProviders.of(this).get(SlideshowViewModel.class);
        View root = inflater.inflate(R.layout.fragment_slideshow, container, false);
        text_view = root.findViewById(R.id.text_view);
        editTextNumber = (EditText) root.findViewById(R.id.editTextNumber);
        editTextNumber3 = (EditText) root.findViewById(R.id.editTextNumber3);
        editTextNumber4 = (EditText) root.findViewById(R.id.editTextNumber4);
        editTextNumber5 = (EditText) root.findViewById(R.id.editTextNumber5);
        editTextNumber6 = (EditText) root.findViewById(R.id.editTextNumber6);
        editTextNumber7 = (EditText) root.findViewById(R.id.editTextNumber7);
        editTextNumber8 = (EditText) root.findViewById(R.id.editTextNumber8);
        editTextNumber9 = (EditText) root.findViewById(R.id.editTextNumber9);
        textView = (TextView) root.findViewById(R.id.textView);
        button = (Button) root.findViewById(R.id.button);

        button.setOnClickListener(this);

        slideshowViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                text_view.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.button:
                textView.setText(" ");
//                textView5.setText(s);
                if(TextUtils.isEmpty(editTextNumber.getText().toString()) ||  TextUtils.isEmpty(editTextNumber3.getText().toString()) || TextUtils.isEmpty(editTextNumber4.getText().toString()) || TextUtils.isEmpty(editTextNumber5.getText().toString())
                        || TextUtils.isEmpty(editTextNumber6.getText().toString()) || TextUtils.isEmpty(editTextNumber7.getText().toString()) || TextUtils.isEmpty(editTextNumber8.getText().toString()) || TextUtils.isEmpty(editTextNumber9.getText().toString())){
                    if(TextUtils.isEmpty(editTextNumber.getText().toString()))
                        Toast.makeText(getActivity(), "   You Missed 1st Subject ..", Toast.LENGTH_LONG).show();
                    else if(TextUtils.isEmpty(editTextNumber3.getText().toString()))
                        Toast.makeText(getActivity(), "   You Missed 2nd Subject ..", Toast.LENGTH_LONG).show();
                    else if(TextUtils.isEmpty(editTextNumber4.getText().toString()))
                        Toast.makeText(getActivity(), "   You Missed 3rd Subject ..", Toast.LENGTH_LONG).show();
                    else if(TextUtils.isEmpty(editTextNumber5.getText().toString()))
                        Toast.makeText(getActivity(), "   You Missed 4th Subject ..", Toast.LENGTH_LONG).show();
                    else if(TextUtils.isEmpty(editTextNumber6.getText().toString()))
                        Toast.makeText(getActivity(), "   You Missed 5th Subject ..", Toast.LENGTH_LONG).show();
                    else if(TextUtils.isEmpty(editTextNumber7.getText().toString()))
                        Toast.makeText(getActivity(), "   You Missed 6th Subject ..", Toast.LENGTH_LONG).show();
                    else if(TextUtils.isEmpty(editTextNumber8.getText().toString()))
                        Toast.makeText(getActivity(), "   You Missed 7th Subject ..", Toast.LENGTH_LONG).show();
                    else
                        Toast.makeText(getActivity(), "   You Missed Mini Project..", Toast.LENGTH_SHORT).show();
                    textView.setText("SGPA");
                }
                else{
                    String i = editTextNumber.getText().toString();
                    String i3 = editTextNumber3.getText().toString();
                    String i4 = editTextNumber4.getText().toString();
                    String i5 = editTextNumber5.getText().toString();
                    String i6 = editTextNumber6.getText().toString();
                    String i7 = editTextNumber7.getText().toString();
                    String i8 = editTextNumber8.getText().toString();
                    String i9 = editTextNumber9.getText().toString();
                    float sgpa = ((Float.valueOf(Integer.parseInt(i)/10)+1)*4  + (Float.valueOf(Integer.parseInt(i3)/10)+1)*4 + (Float.valueOf(Integer.parseInt(i4)/10)+1)*4 +(Float.valueOf(Integer.parseInt(i5)/10)+1)*3 + (Float.valueOf(Integer.parseInt(i6)/10)+1)*3 + (Float.valueOf(Integer.parseInt(i7)/10)+1)*2 + (Float.valueOf(Integer.parseInt(i8)/10)+1)*2 +  (Float.valueOf(Integer.parseInt(i9)/10)+1)*2)/24;
                    //float sgpa = Float.valueOf((((Float.parseFloat(i)/10)+1)*4 + ((Integer.parseInt(i3)/10)+1)*3 + ((Integer.parseInt(i4)/10)+1)*3 +((Integer.parseInt(i5)/10)+1)*3 + ((Integer.parseInt(i6)/10)+1)*3 + ((Integer.parseInt(i7)/10)+1)*2 + ((Integer.parseInt(i8)/10)+1)*2)/25);
                    textView.setText(String.valueOf(sgpa));

                }
                break;
        }

    }
}