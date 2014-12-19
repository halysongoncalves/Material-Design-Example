package br.com.halyson.materialdesign.model;

/**
 * Created by halyson on 19/12/14.
 */
public class CardViewBean {
    String urlImage;

    public CardViewBean(String urlImage) {
        this.urlImage = urlImage;
    }

    public String getUrlImage() {
        return urlImage;
    }

    public void setUrlImage(String urlImage) {
        this.urlImage = urlImage;
    }
}
