package com.springboot.QueryUtils;

public class QueryParam<V> {

	private String name;
	private V value;

	public QueryParam() {

	}

	public QueryParam(String name, V value) {
		this.setName(name);
		this.setValue(value);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public V getValue() {
		return value;
	}

	public void setValue(V value) {
		this.value = value;
	}
}
