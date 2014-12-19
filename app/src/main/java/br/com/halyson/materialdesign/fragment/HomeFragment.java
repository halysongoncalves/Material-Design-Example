package br.com.halyson.materialdesign.fragment;


import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.astuetz.PagerSlidingTabStrip;

import java.util.ArrayList;
import java.util.List;

import br.com.halyson.materialdesign.R;
import br.com.halyson.materialdesign.adapter.HomePagerAdapter;
import br.com.halyson.materialdesign.fragment.api.BaseFragment;
import br.com.halyson.materialdesign.model.SectionsTabs;


public class HomeFragment extends BaseFragment {
    private static final String TAG = HomeFragment.class.getSimpleName();
    private View mViewHome;
    private PagerSlidingTabStrip mPagerSlidingTabStrip;
    private ViewPager mViewPager;

    public static HomeFragment newInstance() {
        return new HomeFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        mViewHome = inflater.inflate(R.layout.material_fragment_home, container, false);

        loadViewComponents();
        loadInfoView();

        return mViewHome;
    }

    private void loadViewComponents() {
        mPagerSlidingTabStrip = (PagerSlidingTabStrip) mViewHome.findViewById(R.id.fragment_home_pager_sliding_tab);
        mViewPager = (ViewPager) mViewHome.findViewById(R.id.fragment_home_view_pager);
    }

    private void loadInfoView() {
        mViewPager.setAdapter(new HomePagerAdapter(loadSectionTabs(), getChildFragmentManager()));
        mPagerSlidingTabStrip.setTextColor(mViewHome.getResources().getColor(R.color.white));
        mPagerSlidingTabStrip.setDividerColor(mViewHome.getResources().getColor(R.color.theme_dialer_primary));
        mPagerSlidingTabStrip.setIndicatorColor(mViewHome.getResources().getColor(android.R.color.transparent));
        mPagerSlidingTabStrip.setViewPager(mViewPager);

    }

    private ArrayList<SectionsTabs> loadSectionTabs() {
        String[] sectionsTabsTitleArray;
        ArrayList<SectionsTabs> sectionTabsListItens = null;

        try {
            sectionsTabsTitleArray = getActivity().getResources().getStringArray(R.array.fragment_home_sections_tabs_title);

            sectionTabsListItens = new ArrayList<>();
            for (String sectionsTabsTitle : sectionsTabsTitleArray) {
                sectionTabsListItens.add(new SectionsTabs(sectionsTabsTitle));
            }
            return sectionTabsListItens;
        } catch (Resources.NotFoundException notFoundExcepetion) {
            Log.e(TAG, "Error Getting The Array", notFoundExcepetion);
        }
        return sectionTabsListItens;
    }
}