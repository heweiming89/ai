package com.heweiming.project.ai.bean;

import java.util.List;

public class Page<E> {

	/**
	 * 页码，从1开始
	 */
	private int pageNum;
	/**
	 * 页面大小
	 */
	private int pageSize;
	/**
	 * 起始行
	 */
	private int startRow;
	/**
	 * 末行
	 */
	private int endRow;
	/**
	 * 总数
	 */
	private long total;
	/**
	 * 总页数
	 */
	private int pages;
	/**
	 * 包含count查询
	 */
	private boolean count = true;

	private List<E> data;

	public int getPageNum() {
		return pageNum;
	}

	public void setPageNum(int pageNum) {
		this.pageNum = pageNum;
	}

	public int getPageSize() {
		return pageSize;
	}

	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}

	public int getStartRow() {
		return startRow;
	}

	public void setStartRow(int startRow) {
		this.startRow = startRow;
	}

	public int getEndRow() {
		return endRow;
	}

	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}

	public long getTotal() {
		return total;
	}

	public void setTotal(long total) {
		this.total = total;
	}

	public int getPages() {
		return pages;
	}

	public void setPages(int pages) {
		this.pages = pages;
	}

	public boolean isCount() {
		return count;
	}

	public void setCount(boolean count) {
		this.count = count;
	}

	public List<E> getData() {
		return data;
	}

	public void setData(List<E> data) {
		this.data = data;
	}

}
