package br.com.halyson.materialdesign.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

import br.com.halyson.materialdesign.model.DrawerMenuBean;
import br.com.halyson.materialdesign.R;


public class DrawerMenuAdapter extends BaseAdapter {
    private Context mContext;
    private ArrayList<DrawerMenuBean> mListItensDrawerMenuBean;

    public DrawerMenuAdapter(Context mContext, ArrayList<DrawerMenuBean> mListItensDrawer) {
        this.mContext = mContext;
        this.mListItensDrawerMenuBean = mListItensDrawer;
    }

    @Override
    public int getCount() {
        return mListItensDrawerMenuBean.size();
    }

    @Override
    public Object getItem(int position) {
        return mListItensDrawerMenuBean.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;

        if (convertView == null) {
            LayoutInflater mInflater = (LayoutInflater) mContext.getSystemService(Activity.LAYOUT_INFLATER_SERVICE);
            convertView = mInflater.inflate(R.layout.fragment_drawer_menu_comp, null);

            holder = new ViewHolder();
            holder.mTitle = (TextView) convertView.findViewById(R.id.fragment_drawerMenu_comp_title);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        holder.mTitle.setText(mListItensDrawerMenuBean.get(position).getTitle());

        return convertView;
    }

    private static class ViewHolder {
        TextView mTitle;
    }
}