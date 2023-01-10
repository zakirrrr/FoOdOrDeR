package com.example.khudalagse;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomeBaseAdapter extends BaseAdapter {
    Context context;
    String listFood[];
    int listIamges[];
    LayoutInflater inflater;

    public CustomeBaseAdapter (Context ctx,String[] foodList,int[] images )
    {
        this.context= ctx;
        this.listFood= foodList;
        this.listIamges= images;
        inflater= LayoutInflater.from(ctx);
    }

    @Override
    public int getCount() {
        return listFood.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.activity_custom_food_view,null);
        TextView txtView =(TextView) convertView.findViewById(R.id.textview);
        ImageView foodImg= (ImageView) convertView.findViewById(R.id.imageIcon);
        txtView.setText(listFood[position]);
        foodImg.setImageResource(listIamges[position]);
        return convertView;
    }
}
