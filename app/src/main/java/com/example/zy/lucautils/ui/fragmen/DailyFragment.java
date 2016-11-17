package com.example.zy.lucautils.ui.fragmen;

import android.os.Bundle;
import android.support.v4.widget.SwipeRefreshLayout;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.zy.lucautils.R;
import com.example.zy.lucautils.app.App;
import com.example.zy.lucautils.base.SimpleFragment;
import com.example.zy.lucautils.model.bean.DailyListBean;
import com.example.zy.lucautils.ui.adapter.DailyAdapter;
import com.example.zy.lucautils.ui.adapter.TopPagerAdapter;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;
import rx.Subscriber;
import rx.android.schedulers.AndroidSchedulers;
import rx.schedulers.Schedulers;

/**
 * Created by dell on 2016/11/7.
 */

public class DailyFragment extends SimpleFragment {
//    @BindView(R.id.swipe_refresh)
//    SwipeRefreshLayout swipeRefresh;

    String currentDate;
    //    DailyAdapter mAdapter;
    List<DailyListBean.StoriesEntity> mList = new ArrayList<>();

    @BindView(R.id.swipe_refresh)
    SwipeRefreshLayout swipeRefresh;


    @BindView(R.id.rv_daily_list)
    RecyclerView rvDailyList;

    DailyAdapter mAdapter;
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_daily;
    }

    @Override
    protected void initEventAndData() {
        mAdapter = new DailyAdapter(mContext, mList);
//
        rvDailyList.setLayoutManager(new LinearLayoutManager(mContext));
//        rvDailyList.setAdapter(mAdapter);

        App.getAppComponent().retrofitHelper().fetchDailyListInfo()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<DailyListBean>() {
                    @Override
                    public void onCompleted() {

                    }

                    @Override
                    public void onError(Throwable e) {

                    }

                    @Override
                    public void onNext(DailyListBean dailyListBean) {
                        Log.d("DailyFragment", "DailyListBean");

                        rvDailyList.setAdapter(mAdapter);
                        mAdapter.addDailyDate(dailyListBean);
                    }
                });
    }
}
