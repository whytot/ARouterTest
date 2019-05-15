package com.bill.librarybase.provider;

import android.app.Activity;
import android.content.Context;
import android.util.Log;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.callback.NavCallback;
import com.alibaba.android.arouter.launcher.ARouter;
import com.bill.librarybase.Constance;
import com.bill.librarybase.Person;

import java.util.List;

import io.reactivex.Observable;

import static com.bill.librarybase.Constance.PARA_CHECK_LOGIN;
import static com.bill.librarybase.Constance.PARA_PERSON;

/**
 * 总服务表
 */
public class ModuleRouteService {
    public static void checkPin(Context context) {
        ARouter.getInstance()
                .build(Constance.ACTIVITY_LIB3_PIN)
                .greenChannel()
                .navigation(context);
    }

    public static void goToXXPage(Person person) {
        ARouter.getInstance().build(Constance.ACTIVITY_LIB1_MAIN).withBoolean(PARA_CHECK_LOGIN, true).withSerializable(PARA_PERSON, person).navigation();
    }

    /**
     * for result + 流程监听
     */
    public static void goToXXXPageForResult(Activity context, int requestCode) {
        ARouter.getInstance().build(Constance.ACTIVITY_LIB1_SUB).withBoolean(PARA_CHECK_LOGIN, true).navigation(context, requestCode, new NavCallback() {
            private static final String TAG = "lib2-lib1 callback";

            @Override
            public void onFound(Postcard postcard) {
                Log.e(TAG, "onFound" + postcard.getPath());
            }

            @Override
            public void onLost(Postcard postcard) {
                Log.e(TAG, "onLost" + postcard.getPath());
            }

            @Override
            public void onArrival(Postcard postcard) {
                Log.e(TAG, "onArrival" + postcard.getPath());
            }

            @Override
            public void onInterrupt(Postcard postcard) {
                Log.e(TAG, "onInterrupt" + postcard.getPath());
            }
        });
    }

    public static List<Person> getPersonList() {
        IAAService service = ARouter.getInstance().navigation(IAAService.class);
        if (service != null) {
            return service.getPersonList();
        }
        return null;
    }

    /**
     * 指定获取某个实现
     *
     * @return
     */
    public static List<Person> getPersonList1() {
        IAAService service = (IAAService) ARouter.getInstance().build(Constance.SERVICE_LIB1).navigation();
        if (service != null) {
            return service.getPersonList();
        }
        return null;
    }

    /**
     * 指定获取某个实现
     *
     * @return
     */
    public static Observable<List<Person>> getPersonListObservable() {
        IBBService service = (IBBService) ARouter.getInstance().build(Constance.SERVICE_LIB1_BB).navigation();
        if (service != null) {
            return service.getPersonList();
        }
        return null;
    }
}
