package com.jt.pojo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.experimental.Accessors;
@ToString
@Data
@Accessors(chain = true)
@AllArgsConstructor
@NoArgsConstructor
@Service
@PropertySource(value="classpath:/properties/jdbc.properties")
public class JDBCServiceC {
	@Value("${jdbcc.jdbcName}")
	private String jdbcName;
	@Value("${jdbcc.jdbcDriver}")
	private String jdbcDriver;
	
	
}
