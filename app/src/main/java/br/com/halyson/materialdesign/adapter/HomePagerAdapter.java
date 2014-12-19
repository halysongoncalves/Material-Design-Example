package br.com.halyson.materialdesign.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

import br.com.halyson.materialdesign.fragment.RecylerViewCardsFragment;
import br.com.halyson.materialdesign.fragment.DefaultFragment;
import br.com.halyson.materialdesign.fragment.Fragment2;
import br.com.halyson.materialdesign.fragment.Fragment3;
import br.com.halyson.materialdesign.model.SectionsTabs;

/**
 * Created by halyson on 18/12/14.
 */
public class HomePagerAdapter extends FragmentPagerAdapter {
    private List<SectionsTabs> mListSectionsTabs;

    public HomePagerAdapter(List<SectionsTabs> listSections, FragmentManager fragmentManager) {
        super(fragmentManager);
        this.mListSectionsTabs = listSections;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (mListSectionsTabs == null || mListSectionsTabs.isEmpty()) {
            return "";
        }
        return mListSectionsTabs.get(position).getTitle();
    }

    @Override
    public int getCount() {
        if (mListSectionsTabs == null || mListSectionsTabs.isEmpty()) {
            return 0;
        }
        return mListSectionsTabs.size();
    }

    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return RecylerViewCardsFragment.newInstance();
            case 1:
                return Fragment2.newInstance();
            case 2:
                return Fragment3.newInstance();
            default:
                return DefaultFragment.newInstance();
        }
    }
}
