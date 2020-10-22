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
import com.journals.gsrj.databinding.FragmentInstructionsAuthorsBinding;
import com.journals.gsrj.helper.utils;
import com.journals.gsrj.ui.viewmodel.InstructionsAuthorsViewModel;


import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link InstructionsAuthorsFragment#} factory method to
 * create an instance of this fragment.
 */
public class InstructionsAuthorsFragment extends Fragment {
    InstructionsAuthorsViewModel instructionsAuthorsViewModel;

    FragmentInstructionsAuthorsBinding fragmentInstructionsAuthorsBinding;
    String ActionBarTitle, instructions;

    public InstructionsAuthorsFragment() {
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
        fragmentInstructionsAuthorsBinding = FragmentInstructionsAuthorsBinding.inflate(getLayoutInflater(),container,false);

        Bundle bundle = this.getArguments();
        if (bundle != null) {
            ActionBarTitle = getArguments().getString("ActionBarTitle");
            instructions = getArguments().getString("instructions");

        }
        Objects.requireNonNull(((AppCompatActivity) requireActivity()).getSupportActionBar()).setTitle(ActionBarTitle);



        instructionsAuthorsViewModel = new ViewModelProvider(this).get(InstructionsAuthorsViewModel.class);
        instructionsAuthorsViewModel.init(instructions,requireActivity());

        // progress bar
        instructionsAuthorsViewModel.getProgressbarObservable().observe(getViewLifecycleOwner(), aBoolean -> {
            if (aBoolean){
                fragmentInstructionsAuthorsBinding.progressBar.setVisibility(View.VISIBLE);

            }else {
                fragmentInstructionsAuthorsBinding.progressBar.setVisibility(View.GONE);
            }
        });

        // Alert toast msg
        instructionsAuthorsViewModel.getToastObserver().observe(getViewLifecycleOwner(), message -> {
            Snackbar snackbar = Snackbar.make(fragmentInstructionsAuthorsBinding.getRoot().getRootView(), message, Snackbar.LENGTH_LONG);
            View snackBarView = snackbar.getView();
            snackBarView.setBackgroundColor(Color.BLACK);
            snackbar.show();

            utils.noNetworkAlert(getActivity(),message);
        });

        // get home data
        instructionsAuthorsViewModel.getInstructionforAuthorsRepository().observe(getViewLifecycleOwner(), homeResponse -> {
           // List<JournalHomeResponse> catDetailsBeanList = homeResponse.getAbt_journal_details();

            if (homeResponse.isStatus()){
                fragmentInstructionsAuthorsBinding.txtJournalHome.setText(Html.fromHtml(homeResponse.getInst_author_details()));
                fragmentInstructionsAuthorsBinding.txtJournalHome.setMovementMethod(LinkMovementMethod.getInstance());
                fragmentInstructionsAuthorsBinding.txtEmptyView.setVisibility(View.GONE);

            }else {
                fragmentInstructionsAuthorsBinding.txtEmptyView.setVisibility(View.VISIBLE);
                fragmentInstructionsAuthorsBinding.txtJournalHome.setVisibility(View.GONE);
            }


        });




        return fragmentInstructionsAuthorsBinding.getRoot();
    }


}