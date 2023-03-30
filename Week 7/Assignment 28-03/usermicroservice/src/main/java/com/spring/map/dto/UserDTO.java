package com.spring.map.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@NoArgsConstructor
@AllArgsConstructor
@Setter
@Getter
public class UserDTO {
	
	
	private long userId;
	private String userName;
	private String email;
	private long deptId;
}
