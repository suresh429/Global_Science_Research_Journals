package com.journals.gsrj.ui.fragments;

import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.google.android.material.snackbar.Snackbar;
import com.journals.gsrj.databinding.FragmentHomeBinding;
import com.journals.gsrj.helper.utils;
import com.journals.gsrj.model.HomeResponse;
import com.journals.gsrj.ui.adapter.ScientificJournalsAdapter;
import com.journals.gsrj.ui.viewmodel.HomeViewModel;


import java.util.ArrayList;
import java.util.List;

public class HomeFragment extends Fragment {

   /* public static final int MobileData = 2;
    public static final int WifiData = 1;

    private LifecycleRegistry lifecycleRegistry = new LifecycleRegistry(this);*/

    ArrayList<HomeResponse.CatDetailsBean> scientificJournalsList = new ArrayList<>();
    HomeViewModel homeViewModel;
    FragmentHomeBinding fragmentHomeBinding;
    ScientificJournalsAdapter scientificJournalsAdapter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        fragmentHomeBinding = FragmentHomeBinding.inflate(getLayoutInflater(), container, false);

        homeViewModel = new ViewModelProvider(this).get(HomeViewModel.class);
        homeViewModel.init("1",requireActivity());

        // Alert toast msg
        homeViewModel.getToastObserver().observe(getViewLifecycleOwner(), message -> {
           // Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT).show();
            Snackbar snackbar = Snackbar.make(fragmentHomeBinding.getRoot().getRootView(), message, Snackbar.LENGTH_LONG);
            View snackBarView = snackbar.getView();
            snackBarView.setBackgroundColor(Color.BLACK);
            snackbar.show();

            utils.noNetworkAlert(getActivity(),message);


        });


        // progress bar
        homeViewModel.getProgressbarObservable().observe(getViewLifecycleOwner(), aBoolean -> {
            if (aBoolean){
                fragmentHomeBinding.progressBar.setVisibility(View.VISIBLE);
                fragmentHomeBinding.txtJournalName.setVisibility(View.GONE);
            }else {
                fragmentHomeBinding.progressBar.setVisibility(View.GONE);
                fragmentHomeBinding.txtJournalName.setVisibility(View.VISIBLE);
            }
        });


        // get home data
        homeViewModel.getHomeRepository().observe(getViewLifecycleOwner(), homeResponse -> {
            List<HomeResponse.CatDetailsBean> catDetailsBeanList = homeResponse.getCat_details();
            List<HomeResponse.CurrissueHighlightsBean> currissueHighlightsBeanList = homeResponse.getCurrissue_highlights();

            scientificJournalsList.addAll(catDetailsBeanList);

            scientificJournalsAdapter = new ScientificJournalsAdapter(catDetailsBeanList,getActivity());
            fragmentHomeBinding.recyclerScientificJournals.setAdapter(scientificJournalsAdapter);

            fragmentHomeBinding.progressBar.setVisibility(View.GONE);

            scientificJournalsAdapter.notifyDataSetChanged();

        });



        return fragmentHomeBinding.getRoot();
    }


}