package com.zgb.spring.boot.web.initializr.common.pojo;

import lombok.Data;

/**
 * @author xmly
 * @email guanbao.zhou@ximalaya.com
 * @Date 2021/3/2 9:46 下午
 * @Created By guanbao.zhou
 */
@Data
public class PageQuery {
  /**
   * 页码，从1开始
   */
  private Integer pageNum;
  /**
   * 页面大小
   */
  private Integer pageSize;
  /**
   * @return the pageNum
   */
  public Integer getPageNum() {
    return pageNum;
  }

  /**
   * @param pageNum the pageNum to set
   */
  public void setPageNum(Integer pageNum) {
    this.pageNum = pageNum;
  }

  /**
   * @return the pageSize
   */
  public Integer getPageSize() {
    return pageSize;
  }

  /**
   * @param pageSize the pageSize to set
   */
  public void setPageSize(Integer pageSize) {
    this.pageSize = pageSize;
  }
}
