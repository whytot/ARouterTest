package com.bill.aroutertest;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.bill.librarybase.BaseActivity;
import com.bill.librarybase.Constance;

@Route(path = Constance.ACTIVITY_APP_MAIN)
public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goLib1(View view) {
        ARouter.getInstance().build(Constance.ACTIVITY_LIB1_MAIN).navigation();
    }

    public void goLib2(View view) {
        ARouter.getInstance().build(Constance.ACTIVITY_LIB2_MAIN).navigation();
    }
}
