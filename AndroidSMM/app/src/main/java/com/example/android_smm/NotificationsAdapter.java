package com.example.android_smm;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.Adapter;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Maart on 7/05/2018.
 */

public class NotificationsAdapter extends ArrayAdapter<Notification>
{

    public NotificationsAdapter(@NonNull Context context, @NonNull ArrayList<Notification> notifications) {
        super(context, -1, notifications);

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Notification notification = getItem(position);

        if(convertView == null){
            LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = inflater.inflate(R.layout.notification_list_item, parent, false);
        }

        TextView tvOnderwerp = (TextView) convertView.findViewById(R.id.tvOnderwerp);
        TextView tvDatum = (TextView) convertView.findViewById(R.id.tvDatum);

        tvOnderwerp.setText(notification.getOnderwerp());
        tvDatum.setText(notification.getDatum()+"");

        return convertView;
    }
}
