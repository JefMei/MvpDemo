package com.srtianxia.mvpdemo.view.iactivity;

/**
 * Created by srtianxia on 2016/3/14.
 */
public interface IMainActivity {
    /**
     * 请求成功的回调
     * @param s
     */
    void showData(String s);

    /**
     * 请求失败的回调
     * @param s
     */
    void showError(String s);
}
