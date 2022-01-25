package com.hanghae.myblog.domain;

import lombok.Getter;

@Getter
public class BoardRequestDto {
    private String title;
    private String name;
    private String contents;

    public BoardRequestDto(String title, String name, String contents) {
        this.title = title;
        this.name = name;
        this.contents = contents;
    }
}
