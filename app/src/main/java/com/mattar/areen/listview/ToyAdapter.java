package com.mattar.areen.listview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Hp1 on 29/10/2018.
 */

public class ToyAdapter extends ArrayAdapter<Toy> {

    Context context;
    List<Toy> objects;
    public ToyAdapter(Context context, int resource, int textViewResourceId, List<Toy> objects) {
        super(context, resource, textViewResourceId, objects);

        this.context=context;
        this.objects=objects;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        LayoutInflater layoutInflater = ((Activity)context).getLayoutInflater();
        View view = layoutInflater.inflate(R.layout.custom_layout,parent,false);

        TextView tvTitle = (TextView)view.findViewById(R.id.tvTitle);
        TextView tvSubTitle = (TextView)view.findViewById(R.id.tvSubTitle);
        TextView tvPrice = (TextView)view.findViewById(R.id.tvPrice);
        ImageView ivProduct=(ImageView)view.findViewById(R.id.ivProduct);
        Toy temp = objects.get(position);


        //ivProduct.setImageBitmap(temp.getBitmap());
        tvPrice.setText(String.valueOf(temp.getPrice()));
        tvTitle.setText(temp.getTitle());
        tvSubTitle.setText(temp.getSubTitle());



        return view;
    }
}

