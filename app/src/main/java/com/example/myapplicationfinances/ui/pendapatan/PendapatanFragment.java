package com.example.myapplicationfinances.ui.pendapatan;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import com.example.myapplicationfinances.R;

public class PendapatanFragment extends Fragment {

    private PendapatanViewModel pendapatanViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        pendapatanViewModel =
                new ViewModelProvider(this).get(PendapatanViewModel.class);
        View root = inflater.inflate(R.layout.fragment_pendapatan, container, false);
        return root;
    }
}
