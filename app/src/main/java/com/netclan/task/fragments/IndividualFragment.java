package com.netclan.task.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.netclan.task.R;
import com.netclan.task.adapters.HomeAdapter;
import com.netclan.task.databinding.FragmentIndividualBinding;
import com.netclan.task.helpers.LocalData;
import com.netclan.task.models.HomeModel;

import java.util.ArrayList;
import java.util.List;

public class IndividualFragment extends Fragment {

    private FragmentIndividualBinding binding;

    private HomeAdapter homeAdapter;
    private List<HomeModel> homeList = new ArrayList<>();

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_individual, container, false);
        binding = FragmentIndividualBinding.bind(view);


        RecyclerView.LayoutManager layoutManager =new LinearLayoutManager(getContext() ,
                RecyclerView.VERTICAL , false);
        binding.rvIndividual.setLayoutManager(layoutManager);
        binding.rvIndividual.setItemAnimator(new DefaultItemAnimator());

        setSwipe();
        
        fetchData();

        return view;
    }

    private void setSwipe() {

        binding.swipeFeed.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                fetchData();
            }
        });

        binding.swipeFeed.post(new Runnable() {
            @Override
            public void run() {
                binding.swipeFeed.setRefreshing(false);
            }
        });

        binding.swipeFeed.setColorSchemeResources(R.color.colorPrimary);
    }

    private void fetchData() {

        homeList.clear();
        HomeModel homeModel = new HomeModel("1", LocalData.INVITE, "Aelisha Thomson", "BTM Layout, within 1 Km" , "50" ,
                "Friendship | Coffee | Hangout" , "Hi community! I am open to new connection." , R.drawable.trail_1);
        homeList.add(homeModel);

        homeModel = new HomeModel("1", LocalData.PENDING, "Aelisha Thomson", "BTM Layout, within 1 Km" , "90" ,
                "Friendship | Coffee | Hangout" , "Hi community! I am open to new connection." , R.drawable.trail_1);
        homeList.add(homeModel);

        homeModel = new HomeModel("1", LocalData.INVITE, "Aelisha Thomson", "BTM Layout, within 1 Km" , "80" ,
                "Friendship | Coffee | Hangout" , "Hi community! I am open to new connection." , R.drawable.trail_1);
        homeList.add(homeModel);

        homeModel = new HomeModel("1", LocalData.PENDING, "Aelisha Thomson", "BTM Layout, within 1 Km" , "40" ,
                "Friendship | Coffee | Hangout" , "Hi community! I am open to new connection." , R.drawable.trail_1);
        homeList.add(homeModel);

        homeModel = new HomeModel("1", LocalData.PENDING, "Aelisha Thomson", "BTM Layout, within 1 Km" , "90" ,
                "Friendship | Coffee | Hangout" , "Hi community! I am open to new connection." , R.drawable.trail_1);
        homeList.add(homeModel);

        homeModel = new HomeModel("1", LocalData.INVITE, "Aelisha Thomson", "BTM Layout, within 1 Km" , "80" ,
                "Friendship | Coffee | Hangout" , "Hi community! I am open to new connection." , R.drawable.trail_1);
        homeList.add(homeModel);

        homeModel = new HomeModel("1", LocalData.PENDING, "Aelisha Thomson", "BTM Layout, within 1 Km" , "40" ,
                "Friendship | Coffee | Hangout" , "Hi community! I am open to new connection." , R.drawable.trail_1);
        homeList.add(homeModel);

        homeAdapter = new HomeAdapter(getContext() , homeList);
        binding.rvIndividual.setAdapter(homeAdapter);
        binding.swipeFeed.setRefreshing(false);
    }

}