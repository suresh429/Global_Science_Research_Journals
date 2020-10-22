package com.journals.gsrj.ui.adapter;

import android.annotation.SuppressLint;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.journals.gsrj.databinding.ArchiveHeadListItemBinding;
import com.journals.gsrj.model.ArchiveResponse;

import java.util.List;

public class ArchiveHeadAdapter extends RecyclerView.Adapter<ArchiveHeadAdapter.ViewHolder> {

    List<ArchiveResponse.ArchiveYearsBean> modelList;

    public ArchiveHeadAdapter(List<ArchiveResponse.ArchiveYearsBean> modelList) {
        this.modelList = modelList;
    }

    @NonNull
    @Override
    public ArchiveHeadAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ArchiveHeadListItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull ArchiveHeadAdapter.ViewHolder holder, int position) {

        holder.rowItemBinding.txtArchiveHeadName.setText(modelList.get(position).getYear());

    /*    for (ArchiveChildItem item : modelList.get(position).getChildItemList()){

            if (item.getYear().equalsIgnoreCase(modelList.get(position).getHeaderItemTitle())){
                Log.d(TAG, "onBindViewHolder: "+item.getYear());

            }

        }*/
        ArchiveChildAdapter archiveChildAdapter = new ArchiveChildAdapter(modelList.get(position).getArchive_details());
        holder.rowItemBinding.recyclerviewChildList.setAdapter(archiveChildAdapter);

    }

    @Override
    public int getItemCount() {
        return modelList.size();
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        ArchiveHeadListItemBinding rowItemBinding;

        public ViewHolder(@NonNull ArchiveHeadListItemBinding rowItemBinding) {
            super(rowItemBinding.getRoot());
            this.rowItemBinding = rowItemBinding;
        }
    }
}
