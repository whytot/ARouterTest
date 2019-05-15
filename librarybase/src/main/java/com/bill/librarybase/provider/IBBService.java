package com.bill.librarybase.provider;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.bill.librarybase.Person;

import java.util.List;

import io.reactivex.Observable;

/**
 * 原本的名字是ILibService,但后来发现没有必要在base中表明某种服务是由谁实现
 */
public interface IBBService extends IProvider {
    Observable<List<Person>> getPersonList();
}
