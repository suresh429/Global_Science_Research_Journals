package com.journals.gsrj.ui.viewmodel;

import android.content.Context;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.google.gson.JsonObject;
import com.journals.gsrj.model.ContactResponse;
import com.journals.gsrj.model.JournalsListResponse;
import com.journals.gsrj.network.JournalRepository;


public class JournalListViewModel extends ViewModel {
    private MutableLiveData<String> toastMessageObserver ;
    private MutableLiveData<Boolean> progressbarObservable;
    private MutableLiveData<JournalsListResponse> journalsListResponseMutableLiveData;
    private MutableLiveData<ContactResponse> contactResponseMutableLiveData;

    public void journalList(String page, Context context){
        if (journalsListResponseMutableLiveData != null){
            return;
        }
        JournalRepository journalRepository = JournalRepository.getInstance(context);

        JsonObject jsonObject = new JsonObject();
        jsonObject.addProperty("page",page);
        journalsListResponseMutableLiveData = journalRepository.getJournalListDisplay(jsonObject);

        progressbarObservable = journalRepository.getProgressbarObservable();
        toastMessageObserver = journalRepository.getToastObserver();
    }


    public void contactData(String journalcode,String c_fname,String c_lname,String c_email,String c_phone,String c_question,Context context){
        if (contactResponseMutableLiveData != null){
            return;
        }
        JournalRepository journalRepository = JournalRepository.getInstance(context);

        JsonObject jsonObject1 = new JsonObject();
        jsonObject1.addProperty("journalcode",journalcode);
        jsonObject1.addProperty("c_fname",c_fname);
        jsonObject1.addProperty("c_lname",c_lname);
        jsonObject1.addProperty("c_email",c_email);
        jsonObject1.addProperty("c_phone",c_phone);
        jsonObject1.addProperty("c_question",c_question);
        jsonObject1.addProperty("source","android");
        contactResponseMutableLiveData = journalRepository.getContactData(jsonObject1);

        progressbarObservable = journalRepository.getProgressbarObservable();
        toastMessageObserver = journalRepository.getToastObserver();


    }

    public LiveData<JournalsListResponse> getJournalListRepository() {
        return journalsListResponseMutableLiveData;
    }

    public LiveData<ContactResponse> getContactRepository() {
        return contactResponseMutableLiveData;
    }

    public LiveData<String> getToastObserver(){
        return toastMessageObserver;
    }

    public MutableLiveData<Boolean> getProgressbarObservable() {
        return progressbarObservable;
    }



}