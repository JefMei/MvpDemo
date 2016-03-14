package com.srtianxia.mvpdemo.presenter;

import com.srtianxia.mvpdemo.model.IDataModel;
import com.srtianxia.mvpdemo.model.callback.OnGetDataListener;
import com.srtianxia.mvpdemo.model.imp.DataModel;
import com.srtianxia.mvpdemo.view.iactivity.IMainActivity;

/**
 * Created by srtianxia on 2016/3/14.
 */
public class MainActivityPresenter {
    private IDataModel iDataModel;
    private IMainActivity iMainActivity;

    public MainActivityPresenter(IMainActivity iMainActivity){
        this.iMainActivity = iMainActivity;
        iDataModel = DataModel.getInstance();
    }

    public void getData(){
        iDataModel.getData(new OnGetDataListener() {
            @Override
            public void success(String s) {
                iMainActivity.showData(s);
            }

            @Override
            public void failure(String s) {
                iMainActivity.showError(s);
            }
        });
    }
}
