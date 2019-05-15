package com.bill.library2;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.bill.librarybase.BaseActivity;
import com.bill.librarybase.Constance;
import com.bill.librarybase.LoginProvider;
import com.bill.librarybase.Person;
import com.bill.librarybase.provider.ModuleRouteService;

import java.util.List;

import io.reactivex.functions.Consumer;

@Route(path = Constance.ACTIVITY_LIB2_MAIN)
public class Lib2MainActivity extends BaseActivity {
    private static final String TAG = "Lib2MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lib2_main);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        Log.e(TAG, "onActivityResult [ requestCode : " + requestCode + " -- resultCode : " + resultCode + " ]");
    }

    /**
     * 带参启动
     *
     * @param view
     */
    public void goLib1(View view) {
        ModuleRouteService.goToXXPage(new Person("Bill", 28));
    }

    /**
     * for result
     *
     * @param view
     */
    public void goLib1AndGetResult(View view) {
        ModuleRouteService.goToXXXPageForResult(this, Constance.REQUEST_CODE_A);
    }

    public void getParaSync(View view) {
        Log.e(TAG, "getParaSync size = " + ModuleRouteService.getPersonList().size());
    }

    public void getParaSync1(View view) {
        Log.e(TAG, "getParaSync1 size = " + ModuleRouteService.getPersonList1().size());
    }

    public void getParaAsync(View view) {
        ModuleRouteService.getPersonListObservable()
                .subscribe(new Consumer<List<Person>>() {
                    @Override
                    public void accept(List<Person> people) throws Exception {
                        Log.e(TAG, "getParaAsync size = " + people.size());
                    }
                });
    }

    public void logout(View view) {
        LoginProvider.getInstance().logout();
    }
}
