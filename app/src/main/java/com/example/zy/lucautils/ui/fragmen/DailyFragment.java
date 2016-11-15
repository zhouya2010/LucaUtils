package com.example.zy.lucautils.ui.fragmen;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.SwipeRefreshLayout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

import com.example.zy.lucautils.R;
import com.example.zy.lucautils.app.App;
import com.example.zy.lucautils.base.SimpleFragment;
import com.example.zy.lucautils.model.bean.DailyListBean;
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
    List<DailyListBean.TopStoriesEntity> mList = new ArrayList<>();
    @BindView(R.id.vp_top)
    ViewPager vpTop;
    @BindView(R.id.ll_point_container)
    LinearLayout llPointContainer;
    @BindView(R.id.swipe_refresh)
    SwipeRefreshLayout swipeRefresh;

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_daily;
    }

    @Override
    protected void initEventAndData() {

        final TopPagerAdapter adapter = new TopPagerAdapter(getContext(), mList);

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
                        mList.addAll(dailyListBean.getTop_stories());
                        vpTop.setAdapter(adapter);
                    }
                });
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // TODO: inflate a fragment view
        View rootView = super.onCreateView(inflater, container, savedInstanceState);
        ButterKnife.bind(this, rootView);
        return rootView;
    }
}
