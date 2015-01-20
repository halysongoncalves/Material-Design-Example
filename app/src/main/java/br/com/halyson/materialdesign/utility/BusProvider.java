package br.com.halyson.materialdesign.utility;

import android.content.Context;

import com.squareup.otto.Bus;

import br.com.halyson.materialdesign.MaterialDesignApplication;

/**
 * Created by Halyson on 05/01/15.
 */
public class BusProvider {
    private static final String TAG = PreferencesEditor.class.getSimpleName();
    private static Bus mBus;

    private static Bus getBus(Context context) {
        if (mBus == null) {
            synchronized (BusProvider.class) {
                if (mBus == null) {
                    mBus = new Bus();
                }
            }
        }
        return mBus;
    }

    public static Bus getInstance() {
        return getBus(MaterialDesignApplication.getApplicationCtx());
    }

    public static void shutdown() {
        mBus = null;
    }

}
