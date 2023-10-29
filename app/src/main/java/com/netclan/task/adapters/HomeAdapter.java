package com.netclan.task.adapters;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.netclan.task.R;
import com.netclan.task.databinding.DesignItemMainBinding;
import com.netclan.task.helpers.LocalData;
import com.netclan.task.models.HomeModel;

import java.util.List;

public class HomeAdapter extends RecyclerView.Adapter<HomeAdapter.MyViewHolder> {

    private final Context context;
    private final List<HomeModel> dataList;

    public HomeAdapter(Context context, List<HomeModel> dataList) {
        this.context = context;
        this.dataList = dataList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View rootView = inflater.inflate(R.layout.design_item_main, parent, false);
        DesignItemMainBinding binding = DesignItemMainBinding.bind(rootView);
        return new MyViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        HomeModel homeModel = dataList.get(position);

        holder.binding.tvStatus.setText(homeModel.status);
        holder.binding.tvName.setText(dataList.get(position).name);
        holder.binding.tvLoc.setText(homeModel.location);
        holder.binding.tvType.setText(homeModel.type);
        holder.binding.tvDesc.setText(homeModel.desc);
        holder.binding.progressBar.setProgress(Integer.parseInt(homeModel.progressBar));
        holder.binding.ivProfile.setImageResource(homeModel.profileImg);

        if (homeModel.status.equals(LocalData.PENDING))
            holder.binding.tvStatus.setTextColor(ContextCompat.getColor(context, R.color.gray));
        else
            holder.binding.tvStatus.setTextColor(ContextCompat.getColor(context, R.color.colorPrimary));

    }

    @Override
    public int getItemCount() {
        return dataList.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder {
        final DesignItemMainBinding binding;

        public MyViewHolder(DesignItemMainBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }

}