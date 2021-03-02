package com.zgb.spring.boot.web.initializr.common.pojo;

import lombok.Builder;
import lombok.Data;

import java.util.List;

/**
 * @author xmly
 * @email guanbao.zhou@ximalaya.com
 * @Date 2021/3/2 9:46 下午
 * @Created By guanbao.zhou
 */
@Data
@Builder
public class PageResult<T> {
  /**
   * 页码，从1开始
   */
  private int pageNum;
  /**
   * 页面大小
   */
  private int pageSize;
  /**
   * 总数
   */
  private long total;
  /**
   * 总页数
   */
  private int pages;
  /**
   * 数据
   */
  private List<T> list;
}
