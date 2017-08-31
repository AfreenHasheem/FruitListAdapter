package com.example.afreen.fruitlist;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Afreen on 8/23/2017.
 */

public class FruitListAdapter extends RecyclerView.Adapter<FruitListAdapter.FruitViewHolder> {

    FruitList fruitList;
    public FruitListAdapter(FruitList fruitList)
    {
        this.fruitList=fruitList;
    }

    @Override
    public FruitListAdapter.FruitViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.row, parent, false);//inflating the row
        return new FruitViewHolder(view);
    }

    @Override
    public void onBindViewHolder(FruitListAdapter.FruitViewHolder holder, int position) {
        holder.fruit.setText(fruitList.getFruitList().get(position));

    }

    @Override
    public int getItemCount() {
        return fruitList.getFruitList().size();
    }

    public class FruitViewHolder extends RecyclerView.ViewHolder
    {
        TextView fruit;

        public FruitViewHolder(View itemView) {
            super(itemView);
            fruit=itemView.findViewById(R.id.fruits);
        }
    }
}
