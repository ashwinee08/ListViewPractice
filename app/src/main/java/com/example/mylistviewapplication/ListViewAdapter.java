package com.example.mylistviewapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class ListViewAdapter extends BaseAdapter{
    private int count;
    private Context context;


    public ListViewAdapter(int count, Context context) {
        this.count=count;
        this.context=context;
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view= LayoutInflater.from(context).inflate(R.layout.list_view_inner_layout,parent,false);
        view.setTag("deselected");
        view.setBackgroundColor(context.getResources().getColor(R.color.deselected));
        view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch(v.getTag().toString()){
                    case "selected":
                        v.setBackgroundColor(context.getResources().getColor(R.color.deselected));
                        v.setTag("deselected");
                        break;

                    case "deselected":
                        v.setBackgroundColor(context.getResources().getColor(R.color.selected));
                        v.setTag("selected");
                        break;
                }
            }
        });
        return view;
    }
}
