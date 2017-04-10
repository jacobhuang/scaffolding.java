package com.github.zackwoo.scaffolding.common.dto;

import java.util.List;

/**
 * Created by zack.wu on 2017/4/11.
 */
public class PageBean<T> {
    private int pageNum;
    private int pageSize;
    private int size;
    private long total;
    private int pages;
    private List<T> list;
}
