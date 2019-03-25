package com.at1.util

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class Connector {
	@Keyword
	public void ConnectorLogin(){



		WebUI.delay(5)
		for (int i=0; i<4; i++){
			WebUI.setText(findTestObject('1Datadriven/Email'), findTestData('Datadriven/ConnectorLogin').getValue(1, 1))

			WebUI.setText(findTestObject('1Datadriven/Password'), findTestData('Datadriven/ConnectorLogin').getValue(2, 1))

			WebUI.click(findTestObject('1Datadriven/Loginbutton'))



			WebUI.takeScreenshot('C:\\Users\\Ram\\Katalon Studio\\Satva\\ErrorScreenShots.png')
		}
	}
}
