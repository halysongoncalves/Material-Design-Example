package br.com.halyson.materialdesign.events;

import java.util.List;

/**
 * Created by Halyson on 31/12/14.
 */
public class LoadTitleTabsDisk {
    private List<String> listTitleTabs;

    public LoadTitleTabsDisk(List<String> listTitleTabs) {
        this.listTitleTabs = listTitleTabs;
    }

    public List<String> getListTitleTabs() {
        return listTitleTabs;
    }

    public void setListTitleTabs(List<String> listTitleTabs) {
        this.listTitleTabs = listTitleTabs;
    }
}
