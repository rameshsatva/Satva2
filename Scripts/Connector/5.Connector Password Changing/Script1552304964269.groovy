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

'Open The Browser(Google)'
WebUI.openBrowser('')

'Maximize the Window'
WebUI.maximizeWindow()

'Navigate to URL'
WebUI.navigateToUrl('https://staging-connector.satvasolutions.com/Account/Login?ReturnUrl=%2F')

'Enter Username'
WebUI.setText(findTestObject('Object Repository/Connector/5.ConnectorPassword Changing/1.E-mail1'),'Satva6.0@getnada.com')


'Enter Password'
WebUI.setText(findTestObject('Object Repository/Connector/5.ConnectorPassword Changing/2.Password'),'Satva1213#')

"Click rember me Option"
WebUI.click(findTestObject('Object Repository/Connector/5.ConnectorPassword Changing/3.Remberme'))
	
'Click login Button'
WebUI.click(findTestObject('Object Repository/Connector/5.ConnectorPassword Changing/4Loginbutton'))

'Click Manage'

WebUI.click(findTestObject('Object Repository/Connector/5.ConnectorPassword Changing/Manage'))
'Click ChangePassword Button'

WebUI.click(findTestObject('Object Repository/Connector/5.ConnectorPassword Changing/5.ChangepasswordButton'))
'Enter Curent Password '

WebUI.setText(findTestObject('Connector/5.ConnectorPassword Changing/6.CurrentPassword'), 'Satva1213')
Void Password(){
'Enter New Password '
WebUI.setText(findTestObject('Object Repository/Connector/5.ConnectorPassword Changing/7.NewPassword'),'Satva1213$')

'Enter New Confirm Password '

WebUI.setText(findTestObject('Object Repository/Connector/5.ConnectorPassword Changing/8.ConfirmPassword'),'Satva1213$')

'Click Update Button'
WebUI.click(findTestObject('Object Repository/Connector/5.ConnectorPassword Changing/9.Eye'))

//String Str1 = WebUI.getText(findTestObject('Object Repository/Connector/5.ConnectorPassword Changing/10.CurrentpasswordError'))

WebUI.click(findTestObject('Object Repository/Connector/5.ConnectorPassword Changing/9.Eye'))

WebUI.click(findTestObject('Object Repository/Connector/5.ConnectorPassword Changing/UpdateButton'))
}
Password()

"Current Password Validation"
String Str1 = WebUI.getText(findTestObject('Object Repository/Connector/5.ConnectorPassword Changing/10.CurrentpasswordError'))
String Str2 = 'Please Enter Correct Current Password'

if(Str1 == Str2){
	WebUI.setText(findTestObject('Connector/5.ConnectorPassword Changing/6.CurrentPassword'), 'Satva1213#')
	Password()
}

	
	
