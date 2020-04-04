package com.example.departmentinfo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;


public class DepartmentListAdapter extends BaseAdapter {

    private ArrayList<Item> DepartmentData;
    private Context context;

    public DepartmentListAdapter(Context context , ArrayList<Item> items){
        this.context = context;
        this.DepartmentData = items;
    }

    @Override
    public int getCount() {
        return DepartmentData.size();
    }

    @Override
    public Object getItem(int position) {
        return DepartmentData.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if(convertView == null){
            convertView = LayoutInflater.from(context).inflate(R.layout.listview_item,parent,false);
        }
        Item currentItem = (Item) getItem(position);

        TextView textViewItemName = convertView.findViewById(R.id.list_item_department_name);
        textViewItemName.setText(currentItem.getItemName());


        return convertView;
    }
}