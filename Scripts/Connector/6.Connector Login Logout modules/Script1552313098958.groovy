import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')
WebUI.maximizeWindow()
int a = 2;
for(i=0; i<=3; i++){
	if(a==2){
				WebUI.navigateToUrl("https://connector.satvasolutions.com/Account/Login?ReturnUrl=%2F")
				WebUI.setText(findTestObject('Connector/4.Connector LoginLogout_OR/AUsername'),'gram@getnada.com')
				WebUI.setText(findTestObject('Connector/4.Connector LoginLogout_OR/BPassword'), 'Satva1213#')
				WebUI.click(findTestObject('Connector/4.Connector LoginLogout_OR/CLogin Button'))
				WebUI.click(findTestObject('Connector/4.Connector LoginLogout_OR/DDashboard'))
	
				WebUI.click(findTestObject('Connector/4.Connector LoginLogout_OR/ETotal Uploaded Items'))
	
	
				/*WebUI.setText(findTestObject('Connector/4.Connector LoginLogout_OR/FSearchText'),'401')
				 WebUI.click(findTestObject('Connector/4.Connector LoginLogout_OR/Logdate'))
				 WebUI.click(findTestObject('Connector/4.Connector LoginLogout_OR/Today'))
				 WebUI.click(findTestObject('Connector/4.Connector LoginLogout_OR/Last7Days'))
				 WebUI.click(findTestObject('Connector/4.Connector LoginLogout_OR/ApplyButton'))
				 WebUI.click(findTestObject('Connector/4.Connector LoginLogout_OR/LogStatus'))
				 WebUI.click(findTestObject('Connector/4.Connector LoginLogout_OR/Uploaded'))
				 WebUI.click(findTestObject('Connector/4.Connector LoginLogout_OR/Search button'))
				 WebUI.delay(20);*/
	
				WebUI.click(findTestObject('Connector/4.Connector LoginLogout_OR/Manage'))
	
				WebUI.click(findTestObject('Connector/4.Connector LoginLogout_OR/Sign Out'))
			}
		else{
			System.out.println("If Condition Is false")
		}
		}
WebUI.closeBrowser()

