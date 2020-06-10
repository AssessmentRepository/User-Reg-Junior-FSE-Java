package com.userRegistrationJWT.TestDB;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import com.userRegistrationJWT.TestBoundary.TestBoundary;

public class Test {
	public static void main(String[] args) {
		Result result = JUnitCore.runClasses(TestBoundary.class);
		for (Failure failure : result.getFailures()) {
			System.out.println(failure.toString());
		}
		System.out.println(result.wasSuccessful());
	}
}