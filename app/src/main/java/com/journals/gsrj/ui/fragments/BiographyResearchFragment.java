package com.journals.gsrj.ui.fragments;

import android.os.Bundle;
import android.text.Html;
import android.text.method.ScrollingMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;


import com.journals.gsrj.databinding.FragmentBiographyResearchBinding;

import java.util.Objects;


public class BiographyResearchFragment extends Fragment {

    String value, ActionBarTitle;


    public BiographyResearchFragment() {
        // Required empty public constructor
    }


    FragmentBiographyResearchBinding fragmentBiographyResearchBinding;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // Inflate the layout for this fragment
        fragmentBiographyResearchBinding = FragmentBiographyResearchBinding.inflate(getLayoutInflater(), container, false);

        Bundle bundle = this.getArguments();
        if (bundle != null) {
            value = getArguments().getString("value");
            ActionBarTitle = getArguments().getString("ActionBarTitle");
        }
        Objects.requireNonNull(((AppCompatActivity) requireActivity()).getSupportActionBar()).setTitle(ActionBarTitle);


        fragmentBiographyResearchBinding.txtView.setText(Html.fromHtml(value));
        fragmentBiographyResearchBinding.txtView.setMovementMethod(new ScrollingMovementMethod());
        return fragmentBiographyResearchBinding.getRoot();
    }
}