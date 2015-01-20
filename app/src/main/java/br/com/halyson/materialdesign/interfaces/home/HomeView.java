package br.com.halyson.materialdesign.interfaces.home;

import java.util.List;

/**
 * Created by Halyson on 20/01/15.
 */
public interface HomeView {
    void loadViewComponents();

    void initPresenter();

    void loadSectionsTabs();

    void loadViewPager(List<String> listTitleTabs);

    void setColorTabs(int color);

    void setDividerColorTabs(int color);

    void setIndicatorColorTabs(int color);

    void loadTabs();
}
