package com.bill.librarybase.provider;

import android.content.Context;

import com.alibaba.android.arouter.facade.Postcard;
import com.alibaba.android.arouter.facade.annotation.Interceptor;
import com.alibaba.android.arouter.facade.callback.InterceptorCallback;
import com.alibaba.android.arouter.facade.template.IInterceptor;
import com.bill.librarybase.LoginProvider;

import static com.bill.librarybase.Constance.PARA_CHECK_LOGIN;

@Interceptor(priority = 1, name = "PinInterceptor")
public class PinInterceptor implements IInterceptor {

    private Context mContext;

    @Override
    public void process(Postcard postcard, InterceptorCallback callback) {
        if (LoginProvider.getInstance().isLogin() || !postcard.getExtras().getBoolean(PARA_CHECK_LOGIN, false)) {
            callback.onContinue(postcard);
        } else {
            ModuleRouteService.checkPin(mContext);
            callback.onInterrupt(null);
        }
    }

    @Override
    public void init(Context context) {
        mContext = context;
    }
}
