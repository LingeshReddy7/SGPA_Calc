package com.example.new_app.ui.slideshow;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class SlideshowViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public SlideshowViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Hi Welcome to 6 th Sem SGPA Calc!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}