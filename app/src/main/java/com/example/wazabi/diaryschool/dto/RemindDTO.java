package com.example.wazabi.diaryschool.dto;

/**
 * Created by wazabi on 15.01.17.
 */

public class RemindDTO {

    private String title;

    public RemindDTO(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
