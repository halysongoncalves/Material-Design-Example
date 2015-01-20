package br.com.halyson.materialdesign.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

import br.com.halyson.materialdesign.fragment.RecylerViewFragment;
import br.com.halyson.materialdesign.fragment.DefaultFragment;
import br.com.halyson.materialdesign.fragment.Fragment2;
import br.com.halyson.materialdesign.fragment.Fragment3;

/**
 * Created by halyson on 18/12/14.
 */
public class HomePagerAdapter extends FragmentPagerAdapter {
    private List<String> mListTitleTabs;

    public HomePagerAdapter(List<String> listTitleTabs, FragmentManager childFragmentManager) {
        super(childFragmentManager );
        this.mListTitleTabs = listTitleTabs;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (mListTitleTabs == null || mListTitleTabs.isEmpty()) {
            return "";
        }
        return mListTitleTabs.get(position);
    }

    @Override
    public int getCount() {
        if (mListTitleTabs == null || mListTitleTabs.isEmpty()) {
            return 0;
        }
        return mListTitleTabs.size();
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return RecylerViewFragment.newInstance();
            case 1:
                return Fragment2.newInstance();
            case 2:
                return Fragment3.newInstance();
            default:
                return DefaultFragment.newInstance();
        }
    }
}
