package com.journals.gsrj.ui.viewmodel;

import android.content.Context;
import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.google.gson.JsonObject;
import com.journals.gsrj.model.VolumeIssueResponse;
import com.journals.gsrj.network.JournalRepository;


import static android.content.ContentValues.TAG;

public class VolumeIssueViewModel extends ViewModel {
    private MutableLiveData<String> toastMessageObserver ;
    private MutableLiveData<Boolean> progressbarObservable;
    private MutableLiveData<VolumeIssueResponse> mutableLiveData;

    public void init(String journalcode, String volume, String issue, String year, Context context){
        if (mutableLiveData != null){
            return;
        }


        JournalRepository journalRepository = JournalRepository.getInstance(context);

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("journalcode",journalcode);
        jsonObject.addProperty("volume",volume);
        jsonObject.addProperty("issue",issue);
        jsonObject.addProperty("year",year);
        Log.d(TAG, "init: "+jsonObject);
        mutableLiveData = journalRepository.getVolumeIssueData(jsonObject);
        progressbarObservable = journalRepository.getProgressbarObservable();
        toastMessageObserver = journalRepository.getToastObserver();
    }

    public LiveData<VolumeIssueResponse> getVolumeIssueRepository() {
        return mutableLiveData;
    }

    public LiveData<String> getToastObserver(){
        return toastMessageObserver;
    }

    public MutableLiveData<Boolean> getProgressbarObservable() {
        return progressbarObservable;
    }

}