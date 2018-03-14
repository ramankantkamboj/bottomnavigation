package com.example.raman.bottomnavigation;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Raman on 3/13/2018.
 */

public class BidList extends ArrayAdapter<String> {
    Context ctx;
    String[] web;
    Integer[] imageId;
    private static LayoutInflater inflater=null;
    public BidList(Context ctx,String[] web,Integer[] imageId) {
        super(ctx, R.layout.bid_design, web);
        this.ctx = ctx;
        this.web = web;
        this.imageId = imageId;
        inflater = (LayoutInflater)ctx.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        View vi=view;
        if(view==null)
            vi = inflater.inflate(R.layout.bid_design, null);
        TextView txtTitle = (TextView) vi.findViewById(R.id.txt_item);

        ImageView imageView = (ImageView) vi.findViewById(R.id.img);
        txtTitle.setText(web[position]);

        imageView.setImageResource(imageId[position]);
        return vi;
    }
}