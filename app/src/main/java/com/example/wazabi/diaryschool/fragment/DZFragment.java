package com.example.wazabi.diaryschool.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wazabi.diaryschool.R;

/**
 * Created by wazabi on 05.01.2017.
 */

public class DZFragment extends AbstractTabFragment {

    private static final int LAYOUT = R.layout.fragment_dz;

    public static DZFragment getInstance(Context context) {
        Bundle args = new Bundle();
        DZFragment fragment = new DZFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_navigation_TODO));
        return fragment;
    }

    public void setContext(Context context) {
        this.context = context;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);
        return view;
    }
}
