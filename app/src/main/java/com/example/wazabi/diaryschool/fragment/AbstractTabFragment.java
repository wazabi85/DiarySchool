package com.example.wazabi.diaryschool.fragment;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.view.View;

/**
 * Created by wazabi on 06.01.2017.
 */

public class AbstractTabFragment extends Fragment {
    private String title;
    protected Context context;
    protected View view;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
