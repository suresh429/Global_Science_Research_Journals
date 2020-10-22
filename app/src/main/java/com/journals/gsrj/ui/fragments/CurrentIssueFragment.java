package com.journals.gsrj.ui.fragments;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;


import com.journals.gsrj.databinding.FragmentCurrentIssueBinding;
import com.journals.gsrj.model.CurrentIssueResponse;
import com.journals.gsrj.ui.adapter.CurrentIssuesAdapter1;
import com.journals.gsrj.ui.viewmodel.CurrentIssueViewModel;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link CurrentIssueFragment#} factory method to
 * create an instance of this fragment.
 */
public class CurrentIssueFragment extends Fragment {

    FragmentCurrentIssueBinding fragmentCurrentIssueBinding;
    private static final String TAG = "CategoryFragment";
    ArrayList<CurrentIssueResponse.CurrentissueDetailsBean> currentissueDetailsBeanArrayList = new ArrayList<>();
    CurrentIssueViewModel currentIssueViewModel;

    CurrentIssuesAdapter1 currentIssuesAdapter1;

    String journalcode,rel_keyword,journal_logo,ActionBarTitle;
    public CurrentIssueFragment() {
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
        fragmentCurrentIssueBinding = FragmentCurrentIssueBinding.inflate(getLayoutInflater(), container, false);



        Bundle bundle = this.getArguments();
        if (bundle != null) {
            journalcode = getArguments().getString("journalcode");
            rel_keyword = getArguments().getString("rel_keyword");
            journal_logo = getArguments().getString("journal_logo");
            ActionBarTitle = getArguments().getString("ActionBarTitle");
        }
        Objects.requireNonNull(((AppCompatActivity) requireActivity()).getSupportActionBar()).setTitle(ActionBarTitle);

        currentIssueViewModel = new ViewModelProvider(this).get(CurrentIssueViewModel.class);
        currentIssueViewModel.init(journalcode,rel_keyword,journal_logo,requireActivity());

        // progress bar
        currentIssueViewModel.getProgressbarObservable().observe(getViewLifecycleOwner(), aBoolean -> {
            if (aBoolean){
                fragmentCurrentIssueBinding.progressBar.setVisibility(View.VISIBLE);

            }else {
                fragmentCurrentIssueBinding.progressBar.setVisibility(View.GONE);
            }
        });

        // Alert toast msg
        currentIssueViewModel.getToastObserver().observe(getViewLifecycleOwner(), message -> {
            Toast.makeText(getActivity(), message, Toast.LENGTH_SHORT).show();
        });

        // get home data
        currentIssueViewModel.getCurrentIssueRepository().observe(getViewLifecycleOwner(), homeResponse -> {


            if (homeResponse.isStatus()) {
                List<CurrentIssueResponse.CurrentissueDetailsBean> catDetailsBeanList = homeResponse.getCurrentissue_details();

                currentissueDetailsBeanArrayList.addAll(catDetailsBeanList);

                currentIssuesAdapter1 = new CurrentIssuesAdapter1(catDetailsBeanList,requireActivity());
                fragmentCurrentIssueBinding.recyclerCurrentIssueList.setAdapter(currentIssuesAdapter1);

                fragmentCurrentIssueBinding.progressBar.setVisibility(View.GONE);

                currentIssuesAdapter1.notifyDataSetChanged();
                fragmentCurrentIssueBinding.txtEmptyView.setVisibility(View.GONE);
                Log.d(TAG, "onCreateView: "+" data found");
            }else {
                Log.d(TAG, "onCreateView: "+"NO data");
                fragmentCurrentIssueBinding.recyclerCurrentIssueList.setVisibility(View.GONE);
                fragmentCurrentIssueBinding.txtEmptyView.setVisibility(View.VISIBLE);
            }
        });



        return fragmentCurrentIssueBinding.getRoot();
    }


}