package com.bill.library1;

import android.content.Context;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.bill.librarybase.Constance;
import com.bill.librarybase.Person;
import com.bill.librarybase.provider.IBBService;

import java.util.List;

import io.reactivex.Observable;

/**
 * 实现base组件中声明的服务
 */
@Route(path = Constance.SERVICE_LIB1_BB)
public class BBService implements IBBService {
    @Override
    public Observable<List<Person>> getPersonList() {
        return Observable.just(TeamManager.getInstance().getPersonList());
    }

    @Override
    public void init(Context context) {

    }
}
