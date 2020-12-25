package com.nghia.pvn.blth4;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;


public class CustomList extends ArrayAdapter<String> {
    private Activity context;
    private  String[] title;
    private  String[] tv;
    private  Integer[] imageId;

    public CustomList(Activity context, String[] title, String[] tv, Integer[] imageId) {
        super(context, R.layout.listitem,title);
        this.context = context;
        this.title = title;
        this.tv = tv;
        this.imageId = imageId;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater=context.getLayoutInflater();
        View rowview=inflater.inflate(R.layout.listitem,null,true);
        TextView textView1=rowview.findViewById(R.id.t1);
        TextView textView2=rowview.findViewById(R.id.t2);
        ImageView imageView=rowview.findViewById(R.id.h);
        textView1.setText(title[position]);
        textView2.setText(tv[position]);
        imageView.setImageResource(imageId[position]);
        return  rowview;

    }
}
