package com.example.myapplicationfinances.ui.pendapatan;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class PendapatanViewModel extends ViewModel {

    private MutableLiveData<String> mText;

    public PendapatanViewModel() {
        mText = new MutableLiveData<>();
        mText.setValue("This is dashboard fragment");
    }

    public LiveData<String> getText() {
        return mText;
    }
}