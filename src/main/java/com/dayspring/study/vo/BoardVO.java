package com.dayspring.study.vo;

import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@RequiredArgsConstructor
public class BoardVO {

    private int bno;
    private String title;
    private String content;
    private String writer;
    private Date del_tm;
    private Date upt_tm;
    private int recommend;

}
