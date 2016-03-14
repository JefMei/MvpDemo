package com.srtianxia.mvpdemo.model.callback;

/**
 * Created by srtianxia on 2016/3/14
 */
public interface OnGetDataListener {
    /**
     * 获取成功的回调
     * s为取得的模拟数据
     * @param s
     */
    void success(String s);

    /**
     * 获取失败的回调
     * s为失败原因，例如网络请求后无网络或者请求数据为空
     * @param s
     */
    void failure(String s);
}
