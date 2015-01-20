package br.com.halyson.materialdesign.interfaces.home;

import com.squareup.otto.Subscribe;

import br.com.halyson.materialdesign.events.LoadColorsTabsDisk;
import br.com.halyson.materialdesign.events.LoadTitleTabsDisk;

/**
 * Created by Halyson on 20/01/15.
 */
public interface HomePresenter {
    void loadSectionsTabs();

    @Subscribe
    void onLoadTitleTabsDiskSuccess(LoadTitleTabsDisk loadTitleTabsDisk);

    @Subscribe
    void onLoadColorTabsDiskSuccess(LoadColorsTabsDisk loadColorsTabsDisk);

    void onDestroy();
}
