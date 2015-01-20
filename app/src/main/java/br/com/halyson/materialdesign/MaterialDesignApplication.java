package br.com.halyson.materialdesign;

import android.app.Application;
import android.content.Context;

/**
 * Created by Halyson on 20/01/15.
 */
public class MaterialDesignApplication extends Application {
    private static MaterialDesignApplication mMaterialDesignApplication;

    @Override
    public void onCreate() {
        super.onCreate();
        mMaterialDesignApplication = this;
    }


    public static MaterialDesignApplication getApplication() {
        return mMaterialDesignApplication;
    }

    public static Context getApplicationCtx() {
        return mMaterialDesignApplication.getApplicationContext();
    }
}
