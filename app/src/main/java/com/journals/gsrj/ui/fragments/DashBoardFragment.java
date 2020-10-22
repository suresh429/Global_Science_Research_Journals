package com.journals.gsrj.ui.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.navigation.Navigation;


import com.journals.gsrj.R;
import com.journals.gsrj.databinding.FragmentDashBoardBinding;
import com.journals.gsrj.helper.utils;
import com.journals.gsrj.model.DashBoardModel;
import com.journals.gsrj.ui.adapter.DashBoardListAdapter;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link DashBoardFragment#} factory method to
 * create an instance of this fragment.
 */
public class DashBoardFragment extends Fragment implements DashBoardListAdapter.DashBoardListener {
    private static final String TAG = "DashBoardFragment";
    FragmentDashBoardBinding fragmentDashBoardBinding;
    String journal, page_url, journalcode, rel_keyword, journal_logo, track_paper,instructions;
    private List<DashBoardModel> dashBoardModelList = new ArrayList<>();



    public DashBoardFragment() {
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
        fragmentDashBoardBinding = FragmentDashBoardBinding.inflate(getLayoutInflater(), container, false);

        Bundle bundle = this.getArguments();
        if (bundle != null) {
            journal = getArguments().getString("journal");
            page_url = getArguments().getString("page_url");
            journalcode = getArguments().getString("journalcode");
            rel_keyword = getArguments().getString("rel_keyword");
            journal_logo = getArguments().getString("journal_logo");
            track_paper = getArguments().getString("track_paper");
            instructions = getArguments().getString("instructions");
        }
        Objects.requireNonNull(((AppCompatActivity) requireActivity()).getSupportActionBar()).setTitle(journal);

        dashBoardData();

        return fragmentDashBoardBinding.getRoot();
    }

    private void dashBoardData() {
        dashBoardModelList.clear();

        dashBoardModelList.add(new DashBoardModel(getResources().getString(R.string.journal_home_tab)));
        dashBoardModelList.add(new DashBoardModel(getResources().getString(R.string.editorial_board)));
        dashBoardModelList.add(new DashBoardModel(getResources().getString(R.string.in_press_tab)));
        dashBoardModelList.add(new DashBoardModel(getResources().getString(R.string.current_issue_tab)));
        dashBoardModelList.add(new DashBoardModel(getResources().getString(R.string.archive_tab)));
        dashBoardModelList.add(new DashBoardModel(getResources().getString(R.string.submit_manuscript)));
        //dashBoardModelList.add(new DashBoardModel(getResources().getString(R.string.instruct_authors)));
        dashBoardModelList.add(new DashBoardModel(getResources().getString(R.string.contact_us)));

        DashBoardListAdapter dashBoardListAdapter = new DashBoardListAdapter(dashBoardModelList, getActivity(), (dashBoardModel, position) -> onItemClick(dashBoardModel, position));
        fragmentDashBoardBinding.recyclerDashBoard.setAdapter(dashBoardListAdapter);
        dashBoardListAdapter.notifyDataSetChanged();
    }

    @Override
    public void onItemClick(List<DashBoardModel> dashBoardModel, int position) {

        if (dashBoardModel.get(position).getDashBoardTitle().equalsIgnoreCase(getResources().getString(R.string.journal_home_tab))) {

            Bundle bundle = new Bundle();
            bundle.putString("ActionBarTitle", getResources().getString(R.string.journal_home_tab));
            bundle.putString("page_url", page_url);

            Navigation.findNavController(fragmentDashBoardBinding.getRoot()).navigate(R.id.journalHomeFragment, bundle);

        } else if (dashBoardModel.get(position).getDashBoardTitle().equalsIgnoreCase(getResources().getString(R.string.editorial_board))) {
            Bundle bundle = new Bundle();
            bundle.putString("ActionBarTitle", getResources().getString(R.string.editorial_board));
            bundle.putString("journalcode", journalcode);
            Navigation.findNavController(fragmentDashBoardBinding.getRoot()).navigate(R.id.editorialBoardFragment, bundle);

        }else if (dashBoardModel.get(position).getDashBoardTitle().equalsIgnoreCase(getResources().getString(R.string.in_press_tab))) {
            Bundle bundle = new Bundle();
            bundle.putString("ActionBarTitle", getResources().getString(R.string.in_press_tab));
            bundle.putString("journalcode", journalcode);
            bundle.putString("rel_keyword", rel_keyword);
            bundle.putString("journal_logo", journal_logo);

            Navigation.findNavController(fragmentDashBoardBinding.getRoot()).navigate(R.id.inPressFragment, bundle);

        } else if (dashBoardModel.get(position).getDashBoardTitle().equalsIgnoreCase(getResources().getString(R.string.current_issue_tab))) {

            Bundle bundle = new Bundle();
            bundle.putString("ActionBarTitle", getResources().getString(R.string.current_issue_tab));
            bundle.putString("journalcode", journalcode);
            bundle.putString("rel_keyword", rel_keyword);
            bundle.putString("journal_logo", journal_logo);

            Navigation.findNavController(fragmentDashBoardBinding.getRoot()).navigate(R.id.currentIssueFragment, bundle);

        } else if (dashBoardModel.get(position).getDashBoardTitle().equalsIgnoreCase(getResources().getString(R.string.archive_tab))) {
            Bundle bundle = new Bundle();
            bundle.putString("ActionBarTitle", getResources().getString(R.string.archive_tab));
            bundle.putString("journalcode", journalcode);

            Navigation.findNavController(fragmentDashBoardBinding.getRoot()).navigate(R.id.archiveFragment, bundle);

        } else if (dashBoardModel.get(position).getDashBoardTitle().equalsIgnoreCase(getResources().getString(R.string.submit_manuscript))) {
            utils.viewInBrowser(requireContext(), track_paper, "No data");
        } else if (dashBoardModel.get(position).getDashBoardTitle().equalsIgnoreCase(getResources().getString(R.string.instruct_authors))) {
            Bundle bundle = new Bundle();
            bundle.putString("ActionBarTitle", getResources().getString(R.string.instruct_authors));
            bundle.putString("instructions", instructions);

            Navigation.findNavController(fragmentDashBoardBinding.getRoot()).navigate(R.id.instructionsAuthorsFragment, bundle);

        }  else {
            Bundle bundle = new Bundle();
            bundle.putString("ActionBarTitle", getResources().getString(R.string.contact_us));
            bundle.putString("journalcode", journalcode);
            Navigation.findNavController(fragmentDashBoardBinding.getRoot()).navigate(R.id.journalContactFragment, bundle);

        }

    }

}