package com.srtianxia.mvpdemo.model.imp;

import com.srtianxia.mvpdemo.model.IDataModel;
import com.srtianxia.mvpdemo.model.callback.OnGetDataListener;

/**
 * Created by srtianxia on 2016/3/14.
 */
public class DataModel implements IDataModel {
    //数据层，负责网络请求，数据库等持久化操作
    //单例模式
    private static DataModel dataModel = new DataModel();

    private DataModel(){}

    public static DataModel getInstance() {
        return dataModel;
    }

    @Override
    public void getData(OnGetDataListener listener) {
        //模拟网络请求,这里应该对网络请求的结果进行判断,因为是demo就模拟成功的情况
        String data = "模拟请求数据";
        String error = "失败返回数据";
        //假设成功
        if (true) {
            listener.success(data);
        }else {
            listener.failure(error);
        }
    }
}
