package com.example.hammanna;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ClubAdapter extends BaseAdapter {

    private final ArrayList<ListClub> list;

    public ClubAdapter(ArrayList<ListClub> list){
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public ListClub getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View convertView, ViewGroup parent) {


        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent, false);
        ImageView iv = view.findViewById(R.id.ivImg);
        TextView tv = view.findViewById(R.id.tvCname);

       String clubName = ((ListClub)getItem(i)).getClubName();
       int clubImage = ((ListClub)getItem(i)).getImg();
        tv.setText(clubName);
        iv.setImageResource(clubImage);

        return view;
    }
}
