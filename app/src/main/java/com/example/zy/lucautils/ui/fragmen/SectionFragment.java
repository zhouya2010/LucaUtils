package com.example.zy.lucautils.ui.fragmen;

import android.support.v7.app.AppCompatActivity;

import com.example.zy.lucautils.R;
import com.example.zy.lucautils.base.SimpleFragment;

/**
 * Created by dell on 2016/11/7.
 */

public class SectionFragment extends SimpleFragment {
    @Override
    protected int getLayoutId() {
        return R.layout.fragment_section;
    }

    @Override
    protected void initEventAndData() {
        ((AppCompatActivity) getActivity()).getSupportActionBar().setTitle("历史");

    }
}
