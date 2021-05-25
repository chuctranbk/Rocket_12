package com.vti.utils;

import java.util.regex.Matcher;

import java.util.regex.Pattern;

public class Validator {

	public static boolean isValidatorEmail(String email) {
		Pattern pattern = Pattern.compile(Constant.EMAIL_REGEX);
		Matcher matcher = pattern.matcher(email);
		return matcher.matches();
	}

	public static boolean isValidatorPasssword(String password) {

		Pattern pattern = Pattern.compile(Constant.PASSWORD_REGEX);
		Matcher matcher = pattern.matcher(password);
		return matcher.matches();

	}

	public static boolean isValidatorUserName(String username) {

		Pattern pattern = Pattern.compile(Constant.USERNAME_REGEX);
		Matcher matcher = pattern.matcher(username);
		return matcher.matches();

	}

	public static boolean isValidatorFullName(String fullname) {

		Pattern pattern = Pattern.compile(Constant.FULLNAME_REGEX);
		Matcher matcher = pattern.matcher(fullname);
		return matcher.matches();

	}

}