package com.util;

import java.util.ArrayList;
import java.util.List;

public class Pager<T> {

	private int curPage = 0; // 当前页 1
    private int pageSize = 10; // 每页多少行1
    private int totalRow; // 共多少行 1 
    private int start;// 当前页起始行
    private int end;// 结束行
    private int totalPage; // 共多少页

	private List<T> data=new ArrayList<T>();
    public int getCurPage() {
        return curPage;
    }

    public void setCurPage(int curPage) {
        if (curPage < 0) {
            curPage = 0;
        } else {
            start = pageSize * curPage;
        }
        end = start + pageSize > totalRow ? totalRow : start + pageSize;
        this.curPage = curPage;
    }

    public int getStart() {
        // start=curPage*pageSize;
        return start;
    }

    public int getEnd() {

        return end;
    }

    public int getPageSize() {
        return pageSize;
    }

    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    public int getTotalRow() {
        return totalRow;
    }

    public void setTotalRow(int totalRow) {
        totalPage = (totalRow + pageSize - 1) / pageSize;
        this.totalRow = totalRow;
        if (totalPage < curPage) {
            curPage = totalPage;
            start = pageSize * curPage;
            end = totalRow;
        }
        end = start + pageSize > totalRow ? totalRow : start + pageSize;
    }

    public int getTotalPage() {

        return this.totalPage;
    }

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}
    
    
}
