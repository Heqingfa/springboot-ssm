package com.jt.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

@Data	//自动添加get/set方法
@Accessors(chain = true) //开启链式加载
@AllArgsConstructor      //添加全部参数的构造
@NoArgsConstructor		 //添加无参构造
public class User {
    private Integer id;
	private String name;
	private Integer age;
	private String sex;
}
