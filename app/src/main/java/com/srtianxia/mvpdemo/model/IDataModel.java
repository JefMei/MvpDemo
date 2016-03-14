package com.srtianxia.mvpdemo.model;

import com.srtianxia.mvpdemo.model.callback.OnGetDataListener;

/**
 * Created by srtianxia on 2016/3/14.
 */
public interface IDataModel {
    void getData(OnGetDataListener listener);
}
