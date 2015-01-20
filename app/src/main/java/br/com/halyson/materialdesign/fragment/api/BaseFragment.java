package br.com.halyson.materialdesign.fragment.api;

import android.app.Activity;
import android.content.Context;
import android.support.v4.app.Fragment;

public class BaseFragment extends Fragment {
    protected Context mContext;
    protected Activity mActivity;

    public BaseFragment() {
        super();
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        this.mActivity = activity;
        this.mContext = mActivity.getApplicationContext();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        mActivity = null;
        mContext = null;
    }
}
