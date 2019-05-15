package com.bill.library1;

import android.os.Bundle;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.bill.librarybase.BaseActivity;
import com.bill.librarybase.Constance;

@Route(path = Constance.ACTIVITY_LIB1_SUB)
public class SubActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lib1_sub);
    }

    public void onClickOk(View view) {
        setResult(RESULT_OK);
        finish();
    }

    public void onClickCancel(View view) {
        setResult(RESULT_CANCELED);
        finish();
    }
}
