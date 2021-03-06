package com.share.locker.service;

import com.share.locker.bo.UserBO;

public interface UserService {
	UserBO getUserByEmail(String email);

	UserBO getUserByPhoneNumber(String phoneNumber);

	UserBO getUserById(Long userId);
	
	UserBO register(UserBO userBO);
	
	UserBO getRandomUser();
}
