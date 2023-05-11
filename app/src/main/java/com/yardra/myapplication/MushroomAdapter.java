package com.yardra.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class MushroomAdapter extends RecyclerView.Adapter<MushroomAdapter.ViewHolder> {
    private final LayoutInflater inflater; //трансформация layout в view
    private final List<MushroomModel> mushrooms; //лист с грибами


    //конструктор адаптера
    public MushroomAdapter(Context context, List<MushroomModel> mushrooms) {
        this.inflater = LayoutInflater.from(context);
        this.mushrooms = mushrooms;}

    @Override
    public MushroomAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = inflater.inflate(R.layout.list_item, parent, false);
        return new ViewHolder(view);}

    @Override
    public void onBindViewHolder(MushroomAdapter.ViewHolder holder, int position) {
        MushroomModel Mushroom = mushrooms.get(position);
        holder.mushroomView.setImageResource(Mushroom.getRes());
        holder.mushroomName.setText(Mushroom.getName());
        holder.mushroomPoison.setText(Mushroom.getPoison());
        holder.occurentMushroom.setText(Mushroom.getItoccursoften());}

    @Override
    public int getItemCount() {
        return mushrooms.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
            final ImageView mushroomView;
            final TextView mushroomName, mushroomPoison, occurentMushroom;
    ViewHolder(View view) {
        super(view);
        mushroomView = view.findViewById(R.id.mushPhoto);
        mushroomName = view.findViewById(R.id.nameMush);
        mushroomPoison = view.findViewById(R.id.poisoned);
        occurentMushroom = view.findViewById(R.id.occurent);
    }}
}