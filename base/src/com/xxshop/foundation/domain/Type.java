package com.xxshop.foundation.domain;

public class Type {
  public static Provider[] providers = {new Provider(1, "移动"), new Provider(2, "电信"), new Provider(3, "联通"),}; // yd\ dx\ lt

  static public class Provider {
	  public Integer id;
	  public String name;

	Provider(Integer id, String name){
		  this.id = id;
		  this.name = name;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
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