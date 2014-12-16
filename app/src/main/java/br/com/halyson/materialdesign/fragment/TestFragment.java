package br.com.halyson.materialdesign.fragment;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import br.com.halyson.materialdesign.R;
import br.com.halyson.materialdesign.fragment.api.BaseFragment;


public class TestFragment extends BaseFragment {
    private static final String TAG = TestFragment.class.getSimpleName();
    private View mViewMonitoring;
    private ListView mListView;

    public static TestFragment newInstance() {
        return new TestFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mViewMonitoring = inflater.inflate(R.layout.material_fragment_test, container, false);

        return mViewMonitoring;
    }
}