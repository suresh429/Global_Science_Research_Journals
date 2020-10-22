package com.journals.gsrj.ui.fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.google.android.material.snackbar.Snackbar;
import com.journals.gsrj.databinding.FragmentAbstractDisplayBinding;
import com.journals.gsrj.helper.utils;
import com.journals.gsrj.ui.viewmodel.AbstactDisplayViewModel;


import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link AbstractDisplayFragment#} factory method to
 * create an instance of this fragment.
 */
public class AbstractDisplayFragment extends Fragment {
    AbstactDisplayViewModel abstactDisplayViewModel;

    FragmentAbstractDisplayBinding fragmentAbstractDisplayBinding;
    String ActionBarTitle, abstractlink;

    public AbstractDisplayFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentAbstractDisplayBinding = FragmentAbstractDisplayBinding.inflate(getLayoutInflater(),container,false);

        Bundle bundle = this.getArguments();
        if (bundle != null) {
            ActionBarTitle = getArguments().getString("ActionBarTitle");
            abstractlink = getArguments().getString("abstractlink");

        }
        Objects.requireNonNull(((AppCompatActivity) requireActivity()).getSupportActionBar()).setTitle(ActionBarTitle);



        abstactDisplayViewModel = new ViewModelProvider(this).get(AbstactDisplayViewModel.class);
        abstactDisplayViewModel.init(abstractlink,requireActivity());

        // progress bar
        abstactDisplayViewModel.getProgressbarObservable().observe(getViewLifecycleOwner(), aBoolean -> {
            if (aBoolean){
                fragmentAbstractDisplayBinding.progressBar.setVisibility(View.VISIBLE);

            }else {
                fragmentAbstractDisplayBinding.progressBar.setVisibility(View.GONE);
            }
        });

        // Alert toast msg
        abstactDisplayViewModel.getToastObserver().observe(getViewLifecycleOwner(), message -> {
            Snackbar snackbar = Snackbar.make(fragmentAbstractDisplayBinding.getRoot().getRootView(), message, Snackbar.LENGTH_LONG);
            View snackBarView = snackbar.getView();
            snackBarView.setBackgroundColor(Color.BLACK);
            snackbar.show();

            utils.noNetworkAlert(getActivity(),message);
        });

        // get home data
        abstactDisplayViewModel.getAbstractDisplayRepository().observe(getViewLifecycleOwner(), homeResponse -> {
           // List<JournalHomeResponse> catDetailsBeanList = homeResponse.getAbt_journal_details();

            if (homeResponse.isStatus()){
                fragmentAbstractDisplayBinding.txtAbstractContent.setText(Html.fromHtml(homeResponse.getAbstract_details().get(0).getAbstractX()));
                fragmentAbstractDisplayBinding.txtAbstractContent.setMovementMethod(LinkMovementMethod.getInstance());
                fragmentAbstractDisplayBinding.txtAbstractTitle.setText(homeResponse.getAbstract_details().get(0).getTitle());
                fragmentAbstractDisplayBinding.txtAuthor.setText(homeResponse.getAbstract_details().get(0).getAuthor_names());
                fragmentAbstractDisplayBinding.txtPublishedDate.setText(homeResponse.getAbstract_details().get(0).getPub_date());
                fragmentAbstractDisplayBinding.txtReceivedDate.setText(homeResponse.getAbstract_details().get(0).getRec_date());
                fragmentAbstractDisplayBinding.txtEmptyView.setVisibility(View.GONE);
                fragmentAbstractDisplayBinding.parentLayout.setVisibility(View.VISIBLE);

            }else {
                fragmentAbstractDisplayBinding.txtEmptyView.setVisibility(View.VISIBLE);
                fragmentAbstractDisplayBinding.parentLayout.setVisibility(View.GONE);
            }


        });




        return fragmentAbstractDisplayBinding.getRoot();
    }

}