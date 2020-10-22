package com.journals.gsrj.ui.adapter;

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
import com.journals.gsrj.databinding.ScientificJournalItemBinding;
import com.journals.gsrj.model.HomeResponse;

import java.util.List;

import static com.journals.gsrj.network.RetrofitService.IMAGE_HOME_URL;


public class ScientificJournalsAdapter extends RecyclerView.Adapter<ScientificJournalsAdapter.ViewHolder> {

    List<HomeResponse.CatDetailsBean> modelList;

    Context context;
    public ScientificJournalsAdapter(List<HomeResponse.CatDetailsBean> modelList,Context context) {
        this.modelList = modelList;
        this.context = context;
    }

    @NonNull
    @Override
    public ScientificJournalsAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(ScientificJournalItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ScientificJournalsAdapter.ViewHolder holder, int position) {

        holder.rowItemBinding.txtJournalName.setText(modelList.get(position).getCat_name());

       /* Glide.with(context)
                .load(IMAGE_HOME_URL +modelList.get(position).getCat_img())
                .apply(new RequestOptions().diskCacheStrategy(DiskCacheStrategy.NONE))
                .into(new CustomTarget<Drawable>() {
                    @Override
                    public void onResourceReady(@NonNull Drawable resource, @Nullable Transition<? super Drawable> transition) {
                        holder.rowItemBinding.imgJournal.setImageDrawable(resource);

                    }

                    @Override
                    public void onLoadCleared(@Nullable Drawable placeholder) {


                    }

                });*/
        holder.rowItemBinding.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Bundle bundle = new Bundle();
                bundle.putString("catId", modelList.get(position).getCat_id());
                bundle.putString("catName", modelList.get(position).getCat_name());

               /* NavController navController = Navigation.findNavController(v);
                navController.navigate(R.id.categoryFragment,bundle);*/
                Navigation.findNavController(v).navigate(R.id.categoryFragment,bundle);
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
        ScientificJournalItemBinding rowItemBinding;

        public ViewHolder(@NonNull ScientificJournalItemBinding rowItemBinding) {
            super(rowItemBinding.getRoot());
            this.rowItemBinding = rowItemBinding;
        }
    }
}
