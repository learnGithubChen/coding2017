package com.coderising.download.api;

public interface ConnectionManager {
	/**
	 * 给定一个url , 打开一个连接
	 * @param url
	 * @return
	 */
	public Connection open(String url) throws ConnectionException; //得到一个Connection的实例
}