package com.example.tugasuts;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.tugasuts.model.Tumbuhan;

import java.util.List;

public class DaftarTumbuhanAdapter extends ArrayAdapter<Tumbuhan> {
    Context context;

    public DaftarTumbuhanAdapter(Context context, List<Tumbuhan> tumbuhans) {
        super(context, R.layout.row_daftar_tumbuhan, tumbuhans);
        this.context = context;
    }

    private static class ViewHolder  {
        TextView textJenis;
        TextView textAsal;
        ImageView gambar;
    }
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Tumbuhan tumbuhan = getItem(position);
        ViewHolder viewHolder;

        if (convertView == null) {
            viewHolder = new ViewHolder();
            LayoutInflater inflater = LayoutInflater.from(getContext());
            convertView = inflater.inflate(R.layout.row_daftar_tumbuhan, parent, false);
            viewHolder.textJenis =  convertView.findViewById(R.id.row_text_jenis);
            viewHolder.textAsal = (TextView) convertView.findViewById(R.id.row_text_asal);
            viewHolder.gambar = convertView.findViewById(R.id.row_image_tumbuhan);
            convertView.setTag(viewHolder);
        } else {
            viewHolder = (ViewHolder) convertView.getTag();
        }

        viewHolder.textJenis.setText(tumbuhan.getJenis());
        viewHolder.textAsal.setText(tumbuhan.getAsal());
        viewHolder.gambar.setImageDrawable(context.getDrawable(tumbuhan.getDrawableRes()));
        return convertView;
    }
}
