package com.example.recyclerviewcardview;

import android.support.annotation.NonNull;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ClubViewHolder> {


    List<Club> clubs;


    RecyclerViewAdapter (List<Club> clubs){
        this.clubs=clubs;
    }

    public static class ClubViewHolder extends  RecyclerView.ViewHolder{

        CardView cardView;
        TextView clubname;
        ImageView clublogo;

        public ClubViewHolder(@NonNull View itemView) {
            super(itemView);

            cardView = (CardView)itemView.findViewById(R.id.cardview);
            clubname =(TextView)itemView.findViewById(R.id.club_name);
            clublogo =(ImageView)itemView.findViewById(R.id.logo);


        }
    }

    @NonNull
    @Override
    public ClubViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewtype) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_layout,parent,false);
        ClubViewHolder cvh = new ClubViewHolder(view);

        return cvh;
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.ClubViewHolder holder, int position) {


        holder.clubname.setText(clubs.get(position).name);

        holder.clublogo.setImageResource(clubs.get(position).logoid);
    }

    @Override
    public void onAttachedToRecyclerView(@NonNull RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    @Override
    public int getItemCount() {
        return clubs.size();
    }
}
