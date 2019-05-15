package com.bill.librarybase;

public class LoginProvider {
    private static LoginProvider loginProviderInstance;

    private LoginProvider() {
    }

    public static synchronized LoginProvider getInstance() {
        if (loginProviderInstance == null) {
            loginProviderInstance = new LoginProvider();
        }
        return loginProviderInstance;
    }

    private boolean isLogin = false;

    public void login() {
        isLogin = true;
    }

    public boolean isLogin() {
        return isLogin;
    }

    public void logout() {
        isLogin = false;
    }
}
