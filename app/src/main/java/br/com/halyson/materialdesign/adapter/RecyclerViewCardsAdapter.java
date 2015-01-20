package br.com.halyson.materialdesign.adapter;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.squareup.picasso.Picasso;

import java.util.List;

import br.com.halyson.materialdesign.R;
import br.com.halyson.materialdesign.activity.DetailsActivity;
import br.com.halyson.materialdesign.model.CardViewBean;

/**
 * Created by Halyson on 19/12/14.
 */
public class RecyclerViewCardsAdapter extends RecyclerView.Adapter<RecyclerViewCardsAdapter.ViewHolder> {
    private final List<CardViewBean> mListItemsCard;
    private Activity mActivity;

    public RecyclerViewCardsAdapter(Activity activity, List<CardViewBean> listItemsCard) {
        this.mListItemsCard = listItemsCard;
        this.mActivity = activity;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        return new ViewHolder(mActivity,LayoutInflater.from(parent.getContext()).inflate(R.layout.fragment_recycler_view_comp, parent, false));
    }

    @Override
    public void onBindViewHolder(final ViewHolder holder, int position) {
        final CardViewBean itemCardView = mListItemsCard.get(position);
        holder.itemView.setTag(itemCardView);
        Picasso.with(holder.imageView.getContext())
                .load(mListItemsCard.get(position)
                        .getUrlImage())
                .error(R.drawable.placeholder_card_view)
                .placeholder(R.drawable.placeholder_card_view)
                .into(holder.imageView);
    }

    @Override
    public int getItemCount() {
        return mListItemsCard.size();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView imageView;
        private Activity mActivity;

        public ViewHolder(Activity activity , View itemView) {
            super(itemView);
            mActivity = activity;
            imageView = (ImageView) itemView.findViewById(R.id.material_com_card_view_image);


            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mActivity.startActivity(new Intent(mActivity, DetailsActivity.class));
                }
            });
        }

    }
}
