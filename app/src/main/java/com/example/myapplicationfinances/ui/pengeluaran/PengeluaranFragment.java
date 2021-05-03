package com.example.myapplicationfinances.ui.pengeluaran;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplicationfinances.R;

public class PengeluaranFragment extends Fragment {

    private PengeluaranViewModel pengeluaranViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        pengeluaranViewModel =
                new ViewModelProvider(this).get(PengeluaranViewModel.class);
        View root = inflater.inflate(R.layout.fragment_pengeluaran, container, false);
        return root;
    }
}