package br.com.halyson.materialdesign.events;

/**
 * Created by Halyson on 31/12/14.
 */
public class LoadColorsTabsDisk {
    private int colorTab;
    private int dividerColorTab;
    private int indicatorColorTab;

    public LoadColorsTabsDisk(int colorTab, int dividerColorTab, int indicatorColorTab) {
        this.colorTab = colorTab;
        this.dividerColorTab = dividerColorTab;
        this.indicatorColorTab = indicatorColorTab;
    }

    public int getColorTab() {
        return colorTab;
    }

    public void setColorTab(int colorTab) {
        this.colorTab = colorTab;
    }

    public int getDividerColorTab() {
        return dividerColorTab;
    }

    public void setDividerColorTab(int dividerColorTab) {
        this.dividerColorTab = dividerColorTab;
    }

    public int getIndicatorColorTab() {
        return indicatorColorTab;
    }

    public void setIndicatorColorTab(int indicatorColorTab) {
        this.indicatorColorTab = indicatorColorTab;
    }
}
