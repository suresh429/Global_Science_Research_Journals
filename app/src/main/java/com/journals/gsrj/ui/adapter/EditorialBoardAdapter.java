package com.journals.gsrj.ui.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.navigation.Navigation;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.engine.DiskCacheStrategy;
import com.bumptech.glide.request.RequestOptions;
import com.bumptech.glide.request.target.CustomTarget;
import com.bumptech.glide.request.transition.Transition;
import com.journals.gsrj.R;
import com.journals.gsrj.databinding.EditorialBoardItemBinding;
import com.journals.gsrj.model.EditorialBoardResponse;


import java.util.List;

public class EditorialBoardAdapter extends RecyclerView.Adapter<EditorialBoardAdapter.ViewHolder> {

    List<EditorialBoardResponse.EditorialboardarrBean> modelList;
    Context context;

    public EditorialBoardAdapter(List<EditorialBoardResponse.EditorialboardarrBean> modelList, Context context) {
        this.modelList = modelList;
        this.context = context;
    }

    @NonNull
    @Override
    public EditorialBoardAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(EditorialBoardItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @SuppressLint("SetTextI18n")
    @Override
    public void onBindViewHolder(@NonNull EditorialBoardAdapter.ViewHolder holder, int position) {


        holder.rowItemBinding.txtName.setText(modelList.get(position).getEname() + " " + modelList.get(position).getE_qlf());

        if (modelList.get(position).getEditor_type() != null && !modelList.get(position).getEditor_type().equalsIgnoreCase("null") && !modelList.get(position).getEditor_type().isEmpty()) {
            holder.rowItemBinding.txtView1.setText(modelList.get(position).getEditor_type());
        } else {
            holder.rowItemBinding.txtView1.setVisibility(View.GONE);
        }


        if (modelList.get(position).getEditor_desig() != null && !modelList.get(position).getEditor_desig().equalsIgnoreCase("null") && !modelList.get(position).getEditor_desig().isEmpty()
                || modelList.get(position).getEditor_dept() != null && !modelList.get(position).getEditor_dept().equalsIgnoreCase("null") && !modelList.get(position).getEditor_dept().isEmpty()) {

            if (modelList.get(position).getEditor_desig() != null && !modelList.get(position).getEditor_desig().equalsIgnoreCase("null") && !modelList.get(position).getEditor_desig().isEmpty()) {
                holder.rowItemBinding.txtView2.setText(modelList.get(position).getEditor_desig() + " " + modelList.get(position).getEditor_dept());

            } else {
                holder.rowItemBinding.txtView2.setText(modelList.get(position).getEditor_dept());
            }

        } else {
            holder.rowItemBinding.txtView2.setVisibility(View.GONE);
        }


        if (modelList.get(position).getUname() != null && !modelList.get(position).getUname().equalsIgnoreCase("null") && !modelList.get(position).getUname().isEmpty()
                || modelList.get(position).getEx_unv_name() != null && !modelList.get(position).getEx_unv_name().equalsIgnoreCase("null") && !modelList.get(position).getEx_unv_name().isEmpty()
                || modelList.get(position).getCountry_name() != null && !modelList.get(position).getCountry_name().equalsIgnoreCase("null") && !modelList.get(position).getCountry_name().isEmpty()) {

            if (modelList.get(position).getUname() != null && !modelList.get(position).getUname().equalsIgnoreCase("null") && !modelList.get(position).getUname().isEmpty()) {
                holder.rowItemBinding.txtView3.setText(modelList.get(position).getUname() + " " + modelList.get(position).getEx_unv_name() + " " + modelList.get(position).getCountry_name());

            } else if (modelList.get(position).getEx_unv_name() != null && !modelList.get(position).getEx_unv_name().equalsIgnoreCase("null") && !modelList.get(position).getEx_unv_name().isEmpty()) {
                holder.rowItemBinding.txtView3.setText(modelList.get(position).getEx_unv_name() + " " + modelList.get(position).getCountry_name());

            } else {
                holder.rowItemBinding.txtView3.setText(modelList.get(position).getCountry_name());
            }


        } else {
            holder.rowItemBinding.txtView3.setVisibility(View.GONE);
        }


        if (modelList.get(position).getPhoto() != null && !modelList.get(position).getPhoto().equalsIgnoreCase("null") && !modelList.get(position).getPhoto().isEmpty()) {
            Glide.with(context)
                    .load(modelList.get(position).getPhoto())
                    .apply(new RequestOptions().diskCacheStrategy(DiskCacheStrategy.NONE))
                    .into(new CustomTarget<Drawable>() {
                        @Override
                        public void onResourceReady(@NonNull Drawable resource, @Nullable Transition<? super Drawable> transition) {
                            holder.rowItemBinding.imgPhoto.setImageDrawable(resource);

                        }

                        @Override
                        public void onLoadCleared(@Nullable Drawable placeholder) {


                        }

                    });
        } else {
            holder.rowItemBinding.imgPhoto.setVisibility(View.GONE);
        }


        if (modelList.get(position).getBiography() != null && !modelList.get(position).getBiography().equalsIgnoreCase("null") && !modelList.get(position).getBiography().isEmpty()) {
            holder.rowItemBinding.btnBiography.setVisibility(View.VISIBLE);
        } else {
            holder.rowItemBinding.btnBiography.setVisibility(View.GONE);
        }
        holder.rowItemBinding.btnBiography.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("value", modelList.get(position).getBiography());
                bundle.putString("ActionBarTitle", "Biography");

                Navigation.findNavController(v).navigate(R.id.biographyResearchFragment, bundle);


            }
        });
        if (modelList.get(position).getResearch_interest() != null && !modelList.get(position).getResearch_interest().equalsIgnoreCase("null") && !modelList.get(position).getResearch_interest().isEmpty()) {
            holder.rowItemBinding.btnResearch.setVisibility(View.VISIBLE);
        } else {
            holder.rowItemBinding.btnResearch.setVisibility(View.GONE);
        }
        holder.rowItemBinding.btnResearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("value", modelList.get(position).getResearch_interest());
                bundle.putString("ActionBarTitle", "Research Interest");
                Navigation.findNavController(v).navigate(R.id.biographyResearchFragment, bundle);

            }
        });
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
        EditorialBoardItemBinding rowItemBinding;

        public ViewHolder(@NonNull EditorialBoardItemBinding rowItemBinding) {
            super(rowItemBinding.getRoot());
            this.rowItemBinding = rowItemBinding;
        }
    }
}
