package com.example.hp.campusconnect;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by hp on 1/6/2018.
 */
public class MyAdapter extends ArrayAdapter {
    private int[] imagearray;
    private String[] titlearray;

    MyAdapter(Context context, String[] title, int[] img) {
        super(context, R.layout.addon, R.id.title, title);
        this.imagearray = img;
        this.titlearray = title;
    }

    @NonNull
    public View getView(int position, View convertview, @NonNull ViewGroup parent) {
        //inflating the layout
        LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View row = inflater.inflate(R.layout.addon, parent, false);
        //get the refrence to view the objects
        ImageView myimage = row.findViewById(R.id.iv);
        TextView mytitle = row.findViewById(R.id.title);
        //providing the element of an array by specifing the position
        myimage.setImageResource(imagearray[position]);
        mytitle.setText(titlearray[position]);
        return row;
    }
}