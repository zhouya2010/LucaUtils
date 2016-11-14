package com.example.zy.lucautils.presenter.contract;


import com.example.zy.lucautils.base.BasePresenter;
import com.example.zy.lucautils.base.BaseView;
import com.example.zy.lucautils.model.bean.DailyListBean;

/**
 * Created by codeest on 16/8/11.
 */

public interface DailyContract {

    interface View extends BaseView {

        void showContent(DailyListBean info);

//        void showMoreContent(String date, DailyBeforeListBean info);

        void showProgress();

        void doInterval(int currentCount);
    }

    interface Presenter extends BasePresenter<View> {

        void getDailyData();

        void getBeforeData(String date);

        void startInterval();

        void stopInterval();

        void insertReadToDB(int id);
    }
}
