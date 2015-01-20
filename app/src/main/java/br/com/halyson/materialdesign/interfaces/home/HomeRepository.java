package br.com.halyson.materialdesign.interfaces.home;

import java.util.List;

/**
 * Created by Halyson on 20/01/15.
 */
public interface HomeRepository {
    void recoverTitleTabs();

    void recoverColorsTabs();

    int getColorTab();

    int getDividerColorTab();

    int getIndicatorColorTab();

    void onDestroy();


}
