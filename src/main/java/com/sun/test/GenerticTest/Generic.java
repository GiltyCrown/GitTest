package com.sun.test.GenerticTest;

/**
 * 
 * @author sunxp
 * @Description TODO
 * @date 2018年9月29日
 * @time 下午3:58:34
 *
 * @param <T>
 */
public class Generic<T> {
	
	
	private T key;
	/**
	 * 
	 * @Description TODO
	 * @param @return
	 * @return T
	 * @throws
	 */
	public T getKey(){
		return this.key;
	}
	/**
	 * 
	 * @Description TODO
	 * @param @param key
	 * @return void
	 * @throws
	 */
	public void setKey(T key){
		this.key=key;
	}
	
	public Generic(){};
	
	public  Generic(T key) {
		this.key=key;
	}
}
