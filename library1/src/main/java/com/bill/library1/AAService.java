package com.bill.library1;

import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.bill.librarybase.Constance;
import com.bill.librarybase.Person;
import com.bill.librarybase.provider.IAAService;

import java.util.List;

/**
 * 实现base组件中声明的服务
 */
@Route(path = Constance.SERVICE_LIB1)
public class AAService implements IAAService {
    private static final String TAG = "AAService";

    @Override
    public List<Person> getPersonList() {
        Log.e(TAG, "AAService");
        return TeamManager.getInstance().getPersonList();
    }

    @Override
    public void init(Context context) {

    }
}
