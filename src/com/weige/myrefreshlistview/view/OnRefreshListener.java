package com.weige.myrefreshlistview.view;

public interface OnRefreshListener {

	/**
	 * ��������ˢ��ʱ���ص��˷���������ˢ�����ݵĲ���
	 */
	public void OnPullDownRefresh();

	/**
	 * ��ǰ�Ǽ��ظ���Ĳ���
	 */
	public void onLoadingMore();
}
