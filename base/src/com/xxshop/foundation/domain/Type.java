package com.xxshop.foundation.domain;

public class Type {
  public static Provider[] providers = {new Provider("1", "移动"), new Provider("2", "电信"), new Provider("3", "联通"),}; // yd\ dx\ lt

  static public class Provider {
	  public String id;
	  public String name;

	Provider(String id, String name){
		  this.id = id;
		  this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

  }

}