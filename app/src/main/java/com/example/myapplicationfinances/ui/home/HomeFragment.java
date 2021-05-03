package com.example.myapplicationfinances.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplicationfinances.DetailListActivity;
import com.example.myapplicationfinances.R;

import java.util.ArrayList;

import static java.security.AccessController.getContext;

public class HomeFragment extends Fragment {
    RecyclerView recyclerView;
    DataKeuanganAdapter dataKeuanganAdapter;

    private HomeViewModel homeViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        homeViewModel =
                new ViewModelProvider(this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final ArrayList<DataKeuangan> dataKeuangans = new ArrayList<>();
        dataKeuangans.add(new DataKeuangan("Pengeluaran","11 April 2021", "Uang Makan", "-Rp. 500.000","-"));
        dataKeuangans.add(new DataKeuangan("Pendapatan","11 April 2021", "Gaji", "Rp. 1.120.000","-"));
        dataKeuangans.add(new DataKeuangan("Pengeluaran","11 April 2021", "Kosmetik", "-Rp. 150.000","-"));
        dataKeuangans.add(new DataKeuangan("Pendapatan","11 April 2021", "Transportasi", "Rp. 50.000","-"));
        dataKeuangans.add(new DataKeuangan("Pengeluaran","11 April 2021", "Belanja Bulanan", "-Rp. 300.000","-"));

        recyclerView = root.findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        recyclerView.setHasFixedSize(true);
        dataKeuanganAdapter = new DataKeuanganAdapter(dataKeuangans);
        recyclerView.setAdapter(dataKeuanganAdapter);

        dataKeuanganAdapter.setOnItemClickListener(new DataKeuanganAdapter.onItemClickListener() {
            @Override
            public void onItemClick(int position) {
                Intent intent = new Intent(getContext(), DetailListActivity.class);
                intent.putExtra("DataKeuangan", dataKeuangans.get(position));
                startActivity(intent);
            }
        });
        return root;
    }
}
