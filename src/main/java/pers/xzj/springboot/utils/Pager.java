package pers.xzj.springboot.utils;

import lombok.Data;

import java.util.List;

/**
 * @Description page
 * @Author xzj (x378042733@gmail.com)
 * @Date 2021-01-15 9:52
 * @Version 1.0.0
 */
@Data
public class Pager<T> {
    // 分页起始页
    private int page;
    // 每页记录数
    private int size;
    // 返回的记录集合
    private List<T> rows;
    // 总记录条数
    private long total;
}
