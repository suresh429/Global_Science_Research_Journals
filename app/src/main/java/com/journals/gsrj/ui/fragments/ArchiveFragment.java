package com.journals.gsrj.ui.fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.google.android.material.snackbar.Snackbar;
import com.journals.gsrj.databinding.FragmentArchiveBinding;
import com.journals.gsrj.helper.utils;
import com.journals.gsrj.model.ArchiveResponse;
import com.journals.gsrj.ui.adapter.ArchiveHeadAdapter;
import com.journals.gsrj.ui.viewmodel.ArchiveViewModel;


import org.jetbrains.annotations.NotNull;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link ArchiveFragment#} factory method to
 * create an instance of this fragment.
 */
public class ArchiveFragment extends Fragment {
    private static final String TAG = "ArchiveFragment";

    FragmentArchiveBinding fragmentArchiveBinding;
    ArrayList<ArchiveResponse.ArchiveYearsBean> archiveDetailsBeanArrayList = new ArrayList<>();
    ArchiveViewModel archiveViewModel;

    ArchiveHeadAdapter archiveHeadAdapter;

    String ActionBarTitle,journalcode;

    public ArchiveFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(@NotNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        fragmentArchiveBinding = FragmentArchiveBinding.inflate(getLayoutInflater(), container, false);

        Bundle bundle = this.getArguments();
        if (bundle != null) {
            ActionBarTitle = getArguments().getString("ActionBarTitle");
            journalcode = getArguments().getString("journalcode");
        }
        Objects.requireNonNull(((AppCompatActivity) requireActivity()).getSupportActionBar()).setTitle(ActionBarTitle);

        archiveViewModel = new ViewModelProvider(this).get(ArchiveViewModel.class);
        archiveViewModel.init(journalcode,requireActivity());

        // progress bar
        archiveViewModel.getProgressbarObservable().observe(getViewLifecycleOwner(), aBoolean -> {
            if (aBoolean){
                fragmentArchiveBinding.progressBar.setVisibility(View.VISIBLE);

            }else {
                fragmentArchiveBinding.progressBar.setVisibility(View.GONE);
            }
        });

        // Alert toast msg
        archiveViewModel.getToastObserver().observe(getViewLifecycleOwner(), message -> {
            Snackbar snackbar = Snackbar.make(fragmentArchiveBinding.getRoot().getRootView(), message, Snackbar.LENGTH_LONG);
            View snackBarView = snackbar.getView();
            snackBarView.setBackgroundColor(Color.BLACK);
            snackbar.show();

            utils.noNetworkAlert(getActivity(),message);
        });

        // get home data
        archiveViewModel.getArchiveRepository().observe(getViewLifecycleOwner(), homeResponse -> {

            if (homeResponse != null){
                archiveDetailsBeanArrayList.clear();
                List<ArchiveResponse.ArchiveYearsBean> catDetailsBeanList = homeResponse.getArchive_years();
                archiveDetailsBeanArrayList.addAll(catDetailsBeanList);

                archiveHeadAdapter = new ArchiveHeadAdapter(archiveDetailsBeanArrayList);
                fragmentArchiveBinding.recyclerArchiveHeadList.setAdapter(archiveHeadAdapter);
                archiveHeadAdapter.notifyDataSetChanged();

                fragmentArchiveBinding.progressBar.setVisibility(View.GONE);
                fragmentArchiveBinding.txtEmptyView.setVisibility(View.GONE);

            }else {

                fragmentArchiveBinding.recyclerArchiveHeadList.setVisibility(View.GONE);
                fragmentArchiveBinding.txtEmptyView.setVisibility(View.VISIBLE);
            }

        });




        return fragmentArchiveBinding.getRoot();
    }


}