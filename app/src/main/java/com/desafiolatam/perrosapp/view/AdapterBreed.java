package com.desafiolatam.perrosapp.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.desafiolatam.perrosapp.R;
import com.desafiolatam.perrosapp.model.BreedList;

import java.util.List;

public class AdapterBreed extends RecyclerView.Adapter<AdapterBreed.F1Holder> {
//pasarle datos y adaptarlos a la vista
    private LayoutInflater mlayoutInflater;
    private List<BreedList> BreedPojo;
    private Context context;

    @NonNull
    @Override
    public F1Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.fragment_f1,parent,false);
        return new F1Holder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull F1Holder holder, int position) {
BreedList Bp = BreedPojo.get(position);
    }

    @Override
    public int getItemCount() {
        return 0;
    }


    public class F1Holder extends RecyclerView.ViewHolder{
        TextView listbreeds;

        public F1Holder(@NonNull View itemView, TextView listbreeds) {
            super(itemView);
            this.listbreeds = listbreeds;
        }

        public F1Holder(@NonNull View itemView) {
            super(itemView);
            listbreeds =itemView.findViewById(R.id.breedtext);



        }


}
}
