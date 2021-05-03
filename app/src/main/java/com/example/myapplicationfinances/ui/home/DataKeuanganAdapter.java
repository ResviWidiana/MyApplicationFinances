package com.example.myapplicationfinances.ui.home;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplicationfinances.R;

import java.util.ArrayList;

public class DataKeuanganAdapter extends RecyclerView.Adapter<DataKeuanganAdapter.DataKeuanganHolder> {
    ArrayList<DataKeuangan> dataKeuangans;
    public interface onItemClickListener{
        void onItemClick(int position);
    }
    private onItemClickListener listener;
    public void setOnItemClickListener(onItemClickListener listener){
        this.listener = listener;
    }
    public DataKeuanganAdapter(ArrayList<DataKeuangan> dataKeuangans) {
        this.dataKeuangans = dataKeuangans;
    }

    @NonNull
    @Override
    public DataKeuanganHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_data_keuangan, parent, false);
        DataKeuanganHolder dataKeuanganHolder = new DataKeuanganHolder(view, listener);
        return dataKeuanganHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull DataKeuanganHolder holder, int position) {
        DataKeuangan dataKeuangan = this.dataKeuangans.get(position);
        holder.nama.setText(dataKeuangan.getNama());
        holder.jumlah.setText(dataKeuangan.getJumlah());
    }

    @Override
    public int getItemCount() {
        return dataKeuangans.size();
    }

    public class DataKeuanganHolder extends RecyclerView.ViewHolder{
        TextView nama, jumlah;
        ConstraintLayout mainLayout;
        public DataKeuanganHolder(@NonNull View itemView, final onItemClickListener listener) {
            super(itemView);
            nama = itemView.findViewById(R.id.kategori);
            jumlah = itemView.findViewById(R.id.harga);
            mainLayout = itemView.findViewById(R.id.mainLayout);

            itemView.setOnClickListener(new View.OnClickListener(){
                public void onClick(View view){
                    int position = getAdapterPosition();
                    listener.onItemClick(position);
                }
            });
        }
    }
}

