package com.example.wazabi.diaryschool.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.example.wazabi.diaryschool.R;
import com.example.wazabi.diaryschool.fragment.AbstractTabFragment;
import com.example.wazabi.diaryschool.fragment.BirthdaysFragment;
import com.example.wazabi.diaryschool.fragment.HistoryFragment;
import com.example.wazabi.diaryschool.fragment.IdeasFragment;
import com.example.wazabi.diaryschool.fragment.ToDoFragment;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by wazabi on 05.01.2017.
 */

public class TabsFragmentAdapter extends FragmentPagerAdapter {

    private Map<Integer, AbstractTabFragment> tabs;
    private Context context;

    public TabsFragmentAdapter(Context context, FragmentManager fm) {
        super(fm);
        this.context = context;
        initTabsMap(context);
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabs.get(position).getTitle();
    }

    @Override
    public Fragment getItem(int position) {
        return tabs.get(position);
    }

    @Override
    public int getCount() {
        return tabs.size();
    }

    private void initTabsMap(Context context) {
        tabs = new HashMap<>();
        tabs.put(0, HistoryFragment.getInstance(context));
        tabs.put(1, IdeasFragment.getInstance(context));
        tabs.put(2, ToDoFragment.getInstance(context));
        tabs.put(3, BirthdaysFragment.getInstance(context));
    }
}
