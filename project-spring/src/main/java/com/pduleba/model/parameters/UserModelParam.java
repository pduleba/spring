package com.pduleba.model.parameters;

import com.pduleba.model.UserModel;

public interface UserModelParam {

	UserModel VALID_USER = new UserModel("Marek", "Kowalski", 0);
	UserModel INVALID_USER = new UserModel(null, "Kowalski", -2);

}
