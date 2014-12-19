package br.com.halyson.materialdesign.adapter;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.List;

import br.com.halyson.materialdesign.R;
import br.com.halyson.materialdesign.model.CardViewBean;

/**
 * Created by Halyson on 19/12/14.
 */
public class RecyclerViewCardsAdapter extends RecyclerView.Adapter<RecyclerViewCardsAdapter.ViewHolder> {
    private final List<CardViewBean> mListItemsCard;

    public RecyclerViewCardsAdapter(List<CardViewBean> listItemsCard) {
        this.mListItemsCard = listItemsCard;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.material_comp_card_view, parent, false));
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final CardViewBean itemCardView = mListItemsCard.get(position);
        holder.itemView.setTag(itemCardView);
        Picasso.with(holder.imageView.getContext()).load(mListItemsCard.get(position).getUrlImage()).into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return mListItemsCard.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.material_com_card_view_image);
        }
    }
}
