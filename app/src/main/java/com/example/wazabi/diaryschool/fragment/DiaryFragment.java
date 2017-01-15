package com.example.wazabi.diaryschool.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.wazabi.diaryschool.R;
import com.example.wazabi.diaryschool.adapter.RemindListAdapter;
import com.example.wazabi.diaryschool.dto.RemindDTO;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wazabi on 05.01.2017.
 */

public class DiaryFragment extends AbstractTabFragment {

    private static final int LAYOUT = R.layout.fragment_diary;

    public static DiaryFragment getInstance(Context context) {
        Bundle args = new Bundle();
        DiaryFragment fragment = new DiaryFragment();
        fragment.setArguments(args);
        fragment.setContext(context);
        fragment.setTitle(context.getString(R.string.tab_navigation_History));
        return fragment;
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(LAYOUT, container, false);

        RecyclerView rv = (RecyclerView) view.findViewById(R.id.recycleView);
        rv.setLayoutManager(new LinearLayoutManager(context));
        rv.setAdapter(new RemindListAdapter(createMockRemindListData()));
        return view;
    }

    private List<RemindDTO> createMockRemindListData() {
        List<RemindDTO> data = new ArrayList<>();
        data.add(new RemindDTO("Дата 1"));
        data.add(new RemindDTO("Дата 2"));
        data.add(new RemindDTO("Дата 3"));
        data.add(new RemindDTO("Дата 4"));
        data.add(new RemindDTO("Дата 5"));
        data.add(new RemindDTO("Дата 6"));

        return data;
    }

    public void setContext(Context context) {
        this.context = context;
    }
}
