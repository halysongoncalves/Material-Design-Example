package br.com.halyson.materialdesign.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

import br.com.halyson.materialdesign.fragment.RecylerViewCardsFragment;
import br.com.halyson.materialdesign.fragment.DefaultFragment;
import br.com.halyson.materialdesign.fragment.Fragment2;
import br.com.halyson.materialdesign.fragment.Fragment3;
import br.com.halyson.materialdesign.model.SectionsTabsBean;

/**
 * Created by halyson on 18/12/14.
 */
public class HomePagerAdapter extends FragmentPagerAdapter {
    private List<SectionsTabsBean> mListSectionsTabBeans;

    public HomePagerAdapter(List<SectionsTabsBean> listSections, FragmentManager fragmentManager) {
        super(fragmentManager);
        this.mListSectionsTabBeans = listSections;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        if (mListSectionsTabBeans == null || mListSectionsTabBeans.isEmpty()) {
            return "";
        }
        return mListSectionsTabBeans.get(position).getTitle();
    }

    @Override
    public int getCount() {
        if (mListSectionsTabBeans == null || mListSectionsTabBeans.isEmpty()) {
            return 0;
        }
        return mListSectionsTabBeans.size();
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
