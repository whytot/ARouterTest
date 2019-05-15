package com.bill.library3;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.bill.librarybase.BaseActivity;
import com.bill.librarybase.Constance;
import com.bill.librarybase.LoginProvider;

@Route(path = Constance.ACTIVITY_LIB3_PIN)
public class PinActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pin);
    }

    public void onClick1(View view) {
        LoginProvider.getInstance().login();
        setResult(RESULT_OK);
        finish();
    }

    public void onClick2(View view) {
        setResult(RESULT_CANCELED);
        finish();
    }
}
