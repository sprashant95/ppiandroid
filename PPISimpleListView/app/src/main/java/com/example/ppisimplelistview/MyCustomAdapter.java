package com.example.ppisimplelistview;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class MyCustomAdapter extends ArrayAdapter<String> {

    String[] names,dates;
    int[] images;
    Activity context;

    public MyCustomAdapter(Activity context, String[] names, String[] dates, int[] images) {
        super(context, R.layout.mycustomitem,names);
        this.context = context;
        this.names = names;
        this.dates = dates;
        this.images = images;
    }

    @Override
    public int getCount() {
        return names.length;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        LayoutInflater inflater = context.getLayoutInflater();
        View rowView = inflater.inflate(R.layout.mycustomitem,null,true);

        TextView name = rowView.findViewById(R.id.name);
        TextView date = rowView.findViewById(R.id.date);
        ImageView imageView = rowView.findViewById(R.id.imageView);

        name.setText(names[position]);
        date.setText(dates[position]);
        imageView.setImageResource(images[position]);

        return rowView;
    }
}
