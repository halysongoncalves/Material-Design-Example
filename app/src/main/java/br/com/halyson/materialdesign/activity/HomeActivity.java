package br.com.halyson.materialdesign.activity;

import android.os.Bundle;

import br.com.halyson.materialdesign.R;
import br.com.halyson.materialdesign.activity.api.BaseActivity;


public class HomeActivity extends BaseActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState == null) {
            initializeToolBar();
        }
    }

    @Override
    protected int getLayoutResourceIdentifier() {
        return R.layout.material_screen_default;
    }

    @Override
    protected String getTitleToolBar() {
        return "HomeActivity";
    }

    @Override
    protected boolean getDisplayHomeAsUp() {
        return true;
    }

    @Override
    protected boolean getHomeButtonEnabled() {
        return true;
    }
}
