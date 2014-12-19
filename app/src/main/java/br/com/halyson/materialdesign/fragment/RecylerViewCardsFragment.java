package br.com.halyson.materialdesign.fragment;

import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.halyson.materialdesign.R;
import br.com.halyson.materialdesign.adapter.RecyclerViewCardsAdapter;
import br.com.halyson.materialdesign.fragment.api.BaseFragment;

/**
 * Created by halyson on 18/12/14.
 */
public class RecylerViewCardsFragment extends BaseFragment {
    public static RecylerViewCardsFragment newInstance() {
        return new RecylerViewCardsFragment();
    }
    private View mViewRecyclerCardsView;
    private RecyclerView mRecyclerView;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mViewRecyclerCardsView = inflater.inflate(R.layout.material_fragment_recycler_view, container, false);

        loadViewComponents();
        loadInfoView();

        return mViewRecyclerCardsView;
    }

    private void loadViewComponents() {
        mRecyclerView = (RecyclerView) mViewRecyclerCardsView.findViewById(R.id.fragment_recyler_view_content_main);
    }

    private void loadInfoView() {
        LinearLayoutManager layoutManager = new LinearLayoutManager(mContext);
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(layoutManager);
        mRecyclerView.setAdapter(new RecyclerViewCardsAdapter());


    }
}
