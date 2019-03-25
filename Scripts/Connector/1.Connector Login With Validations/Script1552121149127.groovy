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

WebUI.navigateToUrl('https://staging-connector.satvasolutions.com')

'Correct Username'
WebUI.setText(findTestObject('Connector/1.Connector Login_OR/1.E-mail1'),'satva6.0@getnada.com')
WebUI.delay(2)

'Wrong Password'
WebUI.setText(findTestObject('Object Repository/Connector/1.Connector Login_OR/2.Password'),'Satva12133#')

WebUI.delay(2)
//WebUI.click(findTestObject('Object Repository/Connector/1.Connector Login_OR/3.Remberme'))

void myLogin1(){
	WebUI.click(findTestObject('Object Repository/Connector/1.Connector Login_OR/3.Remberme'))
	WebUI.click(findTestObject('Object Repository/Connector/1.Connector Login_OR/4Loginbutton'))
}
myLogin1()

String Str1 = WebUI.getText(findTestObject('Object Repository/Connector/1.Connector Login_OR/5.LoginerrorMessage'))
String Str2 = 'Invalid username or password.'
//assert Str1 == Str2

if(Str1 && Str2){
		
	//WebUI.clearText(findTestObject('Connector/1.Connector Login_OR/1.E-mail1'))
	'Wrong Username'
	WebUI.setText(findTestObject('Connector/1.Connector Login_OR/1.E-mail1'),'satv6.0@getnada.com')
	WebUI.delay(2)
	'Correct Password'
	WebUI.setText(findTestObject('Object Repository/Connector/1.Connector Login_OR/2.Password'),'Satva1213#')
	WebUI.click(findTestObject('Object Repository/Connector/1.Connector Login_OR/3.Remberme'))
	myLogin1()
	
	if(Str1 == Str2){
		
		'Wrong Username'
		WebUI.setText(findTestObject('Connector/1.Connector Login_OR/1.E-mail1'),'satv6.0@getnada.com')
		WebUI.delay(2)
		'Wrong  Password'
		WebUI.setText(findTestObject('Object Repository/Connector/1.Connector Login_OR/2.Password'),'Satvaa1213#')
		WebUI.click(findTestObject('Object Repository/Connector/1.Connector Login_OR/3.Remberme'))
		myLogin1()
		}}

else{
	
	'Correct  Username'
	WebUI.setText(findTestObject('Connector/1.Connector Login_OR/1.E-mail1'),'satva6.0@getnada.com')
	WebUI.delay(2)
	'Correct  Password'
	WebUI.setText(findTestObject('Object Repository/Connector/1.Connector Login_OR/2.Password'),'Satva1213#')
	WebUI.click(findTestObject('Object Repository/Connector/1.Connector Login_OR/3.Remberme'))
	myLogin1()
}


if(Str1 == Str2){
	
	'Correct  Username'
	WebUI.setText(findTestObject('Connector/1.Connector Login_OR/1.E-mail1'),'satva6.0@getnada.com')
	WebUI.delay(2)
	
	WebUI.click(findTestObject('Object Repository/Connector/1.Connector Login_OR/4Loginbutton'))
	String Str3 = WebUI.getText(findTestObject('Object Repository/Connector/1.Connector Login_OR/6.Passwordfield required'))
	String Str4 = 'The Password field is required.'
	//assert Str1 == Str2
	'Correct  Password'
	
	if(Str3 == Str4){
	WebUI.setText(findTestObject('Object Repository/Connector/1.Connector Login_OR/2.Password'),'Satva1213#')
	WebUI.click(findTestObject('Object Repository/Connector/1.Connector Login_OR/3.Remberme'))
	myLogin1()
		}}

