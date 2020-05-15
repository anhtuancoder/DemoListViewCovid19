package com.example.demolistviewcovid_19;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class ArrAdapterCovid extends BaseAdapter {

    List<CovidModel> listCovid;
    Activity activity;

    // Day la Constructer
    public ArrAdapterCovid(List<CovidModel> listCovid, Activity activity) {
        this.listCovid = listCovid;
        this.activity = activity;
    }

    @Override
    public int getCount() {
        return listCovid.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Tao viewholder de truy cap cac thanh phan cua data tu ActivityMain
        ViewHolder mViewHolder = new ViewHolder();
        if(convertView == null){
            // LayoutInflater chuyen doi file "list_view_covid.xml" thanh 1 view
            LayoutInflater layoutInflater = activity.getLayoutInflater();
            convertView = layoutInflater.inflate(R.layout.listview_covid19_layout, parent, false);
            mViewHolder.mFlags = (ImageView) convertView.findViewById(R.id.imgFlags);
            mViewHolder.mNames = (TextView) convertView.findViewById(R.id.txtNames);
            mViewHolder.mConfirmed = (TextView) convertView.findViewById(R.id.txtConfirmed);
            mViewHolder.mRecovered = (TextView) convertView.findViewById(R.id.txtRecovered);
            mViewHolder.mDeaths = (TextView) convertView.findViewById(R.id.txtDeaths);
            convertView.setTag(mViewHolder);
        }
        mViewHolder = (ViewHolder) convertView.getTag();
        // Su dung tham so position de lay cac phan tu cua list va set data vao
        CovidModel cvModel = listCovid.get(position);
        // set datas nhan duoc tu ActivityMain de hien thi len listview
        mViewHolder.mFlags.setImageResource(cvModel.getFlags());
        mViewHolder.mNames.setText(cvModel.getNames());
        mViewHolder.mConfirmed.setText(cvModel.getConfirmed());
        mViewHolder.mRecovered.setText(cvModel.getRecovered());
        mViewHolder.mDeaths.setText(cvModel.getDeaths());
        return convertView;
    }

    // Tao 1 lan duy nhat de tranh viec tao nhieu lan
    static class ViewHolder{
        ImageView mFlags;
        TextView mNames;
        TextView mConfirmed;
        TextView mRecovered;
        TextView mDeaths;
    }

}
