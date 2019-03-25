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
WebUI.setText(findTestObject('Object Repository/Connector/5.Connector Edit profile_OR/1.E-mail1'),'Satva6.0@getnada.com')

'Enter Password'
WebUI.setText(findTestObject('Object Repository/Connector/5.Connector Edit profile_OR/2.Password'),'Satva1213#')

"Click rember me Option"
WebUI.click(findTestObject('Object Repository/Connector/5.Connector Edit profile_OR/3.Remberme'))

'Click login Button'
WebUI.click(findTestObject('Login/Login'))

'Click Manage'

WebUI.click(findTestObject('Object Repository/Connector/5.Connector Edit profile_OR/Manage'))

'Click Edit Profile'
WebUI.click(findTestObject('Connector/5.Connector Edit profile_OR/Editprofile'))

'Enter First Name'
WebUI.setText(findTestObject('Connector/5.Connector Edit profile_OR/Firstname'), 'Ramesh')

'Enter Last Name'
WebUI.setText(findTestObject('Connector/5.Connector Edit profile_OR/LastName'), 'Babu')

'Enter Street Address'
WebUI.setText(findTestObject('Object Repository/Connector/5.Connector Edit profile_OR/StreetAddress'),'Iscon')
'Enter City name'
WebUI.setText(findTestObject('Object Repository/Connector/5.Connector Edit profile_OR/City'),'Ahmedabad')
'Enter State name'

WebUI.setText(findTestObject('Object Repository/Connector/5.Connector Edit profile_OR/State'),'Gujrat')
	//findTestObject('Connector/3.Connector Edit profile_OR/StreetAddress'), 

'Enter Country name'
WebUI.setText(findTestObject('Object Repository/Connector/5.Connector Edit profile_OR/Country'), 'India')

'Enter ZipCode'
WebUI.setText(findTestObject('Object Repository/Connector/5.Connector Edit profile_OR/Zipcode'), '53308')

'Enter OfficeNumber'
WebUI.setText(findTestObject('Object Repository/Connector/5.Connector Edit profile_OR/officenumber'),'1234556')

'Enter Mobile Number'
WebUI.setText(findTestObject('Object Repository/Connector/5.Connector Edit profile_OR/Mobile'),'12345')

//void MobileNumber(){
'Click Update Button'
//WebUI.scrollToPosition(, 0)
WebUI.scrollToPosition(0, 100)
WebUI.click(findTestObject('Object Repository/Connector/5.Connector Edit profile_OR/Update'))
//}
//MobileNumber()

String Str1 = WebUI.getText(findTestObject('Connector/5.Connector Edit profile_OR/MobileNumbervalidationlessthan6Charcters'))
String Str2 = "Mobile Number cannot be lower than 6 characters."

if (Str1 == Str2 ){
	WebUI.delay(6)
	
	WebUI.setText(findTestObject('Object Repository/Connector/5.Connector Edit profile_OR/Mobile'),'123456789123456789')
	WebUI.click(findTestObject('Object Repository/Connector/5.Connector Edit profile_OR/officenumber'))
		
	
	WebUI.click(findTestObject('Object Repository/Connector/5.Connector Edit profile_OR/Update'))
	WebUI.scrollToPosition(0, 100)
	WebUI.delay(5)
	//}

	
	String Str3 = WebUI.getText(findTestObject('Object Repository/Connector/5.Connector Edit profile_OR/span_Mobile Number cannot be l'))
	String Str4 = "Mobile Number cannot be longer than 15 characters."
	
	
	if(Str3 == Str4 ){
	WebUI.setText(findTestObject('Object Repository/Connector/5.Connector Edit profile_OR/Mobile'),'12345678913')
	WebUI.click(findTestObject('Object Repository/Connector/5.Connector Edit profile_OR/officenumber'))
	WebUI.click(findTestObject('Object Repository/Connector/5.Connector Edit profile_OR/Update'))
	//MobileNumber()
	if(WebUI.verifyElementPresent(findTestObject('Object Repository/Connector/5.Connector Edit profile_OR/Your profile has been updated successfully'),5))
	{
		WebUI.click(findTestObject('Object Repository/Connector/5.Connector Edit profile_OR/Dashboard'))
		}
	
	}}
