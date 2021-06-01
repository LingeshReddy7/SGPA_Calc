package com.example.new_app.ui.contacts;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class ContactsViewModel extends ViewModel {
    private MutableLiveData<String> mText;

    public ContactsViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Hi Welcome to 7 th Sem SGPA Calc!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}