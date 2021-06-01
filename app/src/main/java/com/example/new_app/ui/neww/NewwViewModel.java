package com.example.new_app.ui.neww;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class NewwViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public NewwViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Hi Welcome to 8 th Sem SGPA Calc!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}