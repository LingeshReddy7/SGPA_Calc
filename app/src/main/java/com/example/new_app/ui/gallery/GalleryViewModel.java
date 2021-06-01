package com.example.new_app.ui.gallery;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GalleryViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public GalleryViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("Hi Welcome to 5 th Sem SGPA Calc!");
    }

    public LiveData<String> getText() {
        return mText;
    }
}