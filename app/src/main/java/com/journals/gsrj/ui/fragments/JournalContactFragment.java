package com.journals.gsrj.ui.fragments;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.google.android.material.snackbar.Snackbar;
import com.journals.gsrj.R;
import com.journals.gsrj.databinding.FragmentJournalContactBinding;
import com.journals.gsrj.model.ContactResponse;
import com.journals.gsrj.ui.viewmodel.JournalListViewModel;


import java.util.Objects;

public class JournalContactFragment extends Fragment implements View.OnClickListener {

    String journalcode, fname, lname, email, phone, message;
    JournalListViewModel journalListViewModel;
    FragmentJournalContactBinding fragmentContactBinding;

    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        fragmentContactBinding = FragmentJournalContactBinding.inflate(getLayoutInflater(), container, false);

        Bundle bundle = this.getArguments();
        if (bundle != null) {
            journalcode = getArguments().getString("journalcode");
        }
        fragmentContactBinding.txtDailUK.setOnClickListener(this);
        fragmentContactBinding.txtmail.setOnClickListener(this);
        fragmentContactBinding.buttonNext.setOnClickListener(this);


        journalListViewModel = new ViewModelProvider(this).get(JournalListViewModel.class);
        journalListViewModel.journalList("1",requireActivity());


        return fragmentContactBinding.getRoot();
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.txtDailUK:
                Intent intent1 = new Intent(Intent.ACTION_DIAL);
                String temp1 = "tel:" + fragmentContactBinding.txtDailUK.getText().toString();
                intent1.setData(Uri.parse(temp1));
                startActivity(intent1);
                break;
            case R.id.txtmail:
                Intent i = new Intent(Intent.ACTION_SEND);
                i.setType("message/rfc822");
                i.putExtra(Intent.EXTRA_EMAIL, new String[]{fragmentContactBinding.txtmail.getText().toString()});

                try {
                    startActivity(Intent.createChooser(i, "Send mail..."));
                } catch (ActivityNotFoundException ex) {
                    Toast.makeText(requireActivity(), "There are no email clients installed.", Toast.LENGTH_SHORT).show();
                }
                break;
            case R.id.buttonNext:


                fname = Objects.requireNonNull(fragmentContactBinding.editFirst.getText()).toString();
                lname = Objects.requireNonNull(fragmentContactBinding.editLast.getText()).toString();
                email = Objects.requireNonNull(fragmentContactBinding.editEmail.getText()).toString();
                phone = Objects.requireNonNull(fragmentContactBinding.editPhone.getText()).toString();
                message = Objects.requireNonNull(fragmentContactBinding.editAddress.getText()).toString();

                if (fname.isEmpty()) {
                    Toast.makeText(requireActivity(), "Please Enter First Name", Toast.LENGTH_SHORT).show();
                } else if (lname.isEmpty()) {
                    Toast.makeText(requireActivity(), "Please Enter Last Name", Toast.LENGTH_SHORT).show();
                } else if (email.isEmpty()) {
                    Toast.makeText(requireActivity(), "Please Enter Email", Toast.LENGTH_SHORT).show();
                } else if (phone.isEmpty()) {
                    Toast.makeText(requireActivity(), "Please Enter Phone", Toast.LENGTH_SHORT).show();
                }else if (journalcode.isEmpty()) {
                    Toast.makeText(requireActivity(), "Please Select Journal", Toast.LENGTH_SHORT).show();
                } else if (message.isEmpty()) {
                    Toast.makeText(requireActivity(), "Please Enter Message", Toast.LENGTH_SHORT).show();
                } else {

                    // Alert toast msg
                    journalListViewModel.getToastObserver().observe(getViewLifecycleOwner(), message -> {
                        Snackbar snackbar = Snackbar.make(fragmentContactBinding.getRoot().getRootView(), message, Snackbar.LENGTH_LONG);
                        View snackBarView = snackbar.getView();
                        snackBarView.setBackgroundColor(Color.BLACK);
                        snackbar.show();

                        //utils.noNetworkAlert(getActivity(),message);
                    });

                    journalListViewModel.contactData(journalcode,fname,lname,email,phone,message,requireActivity());
                    journalListViewModel.getContactRepository().observe(getViewLifecycleOwner(), new Observer<ContactResponse>() {
                        @Override
                        public void onChanged(ContactResponse contactResponse) {
                            if (contactResponse.isStatus()){

                                Toast.makeText(requireContext(), ""+contactResponse.getMessage(), Toast.LENGTH_SHORT).show();
                                fragmentContactBinding.editFirst.setText("");
                                fragmentContactBinding.editLast.setText("");
                                fragmentContactBinding.editAddress.setText("");
                                fragmentContactBinding.editEmail.setText("");
                                fragmentContactBinding.editPhone.setText("");
                                //Navigation.findNavController(fragmentContactBinding.getRoot()).navigate(R.id.nav_home);
                                //NavOptions navOptions = new NavOptions.Builder().setPopUpTo(R.id.nav_home, true).build();
                                //Navigation.findNavController(fragmentContactBinding.getRoot()).navigate(R.id.nav_home, null, navOptions);

                            }else {
                                Toast.makeText(requireActivity(), ""+contactResponse.getMessage(), Toast.LENGTH_SHORT).show();
                            }
                        }
                    });


                    // progress bar
                    journalListViewModel.getProgressbarObservable().observe(getViewLifecycleOwner(), aBoolean -> {
                        if (aBoolean) {
                            fragmentContactBinding.progressBar.setVisibility(View.VISIBLE);

                        } else {
                            fragmentContactBinding.progressBar.setVisibility(View.GONE);

                        }
                    });

                }

                break;


        }
    }


}