package com.bill.librarybase;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import com.alibaba.android.arouter.launcher.ARouter;

public class BaseActivity extends AppCompatActivity {
    private static final String TAG = "base";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTitle(getClass().getSimpleName());
        ARouter.getInstance().inject(this);
        Log.e(TAG, "" + getLocalClassName());
    }

}
