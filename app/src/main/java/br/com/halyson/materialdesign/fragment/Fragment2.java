package br.com.halyson.materialdesign.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import br.com.halyson.materialdesign.R;

/**
 * Created by halyson on 18/12/14.
 */
public class Fragment2 extends Fragment {
    public static Fragment2 newInstance() {
        return new Fragment2();
    }
    private View mViewFragment2;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mViewFragment2 = inflater.inflate(R.layout.fragment_2, container, false);

        return mViewFragment2;
    }
}
