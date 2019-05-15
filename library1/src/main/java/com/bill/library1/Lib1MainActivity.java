package com.bill.library1;

import android.os.Bundle;
import android.util.Log;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.bill.librarybase.BaseActivity;
import com.bill.librarybase.Constance;
import com.bill.librarybase.Person;

@Route(path = Constance.ACTIVITY_LIB1_MAIN)
public class Lib1MainActivity extends BaseActivity {

    private static final String TAG = "Lib1MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lib1_main);
        if (savedInstanceState == null) {
            Person person = (Person) getIntent().getSerializableExtra(Constance.PARA_PERSON);
            Log.e(TAG, person.toString());
        }
    }

    public void onClick1(View view) {

    }

    public void onClick2(View view) {
    }
}
