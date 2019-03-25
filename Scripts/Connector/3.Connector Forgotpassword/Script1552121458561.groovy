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
WebUI.setText(findTestObject('Object Repository/Connector/3.Connector Forgotpassword_OR/1.E-mail1'),'satva6.0@getnada.com')
WebUI.delay(2)
WebUI.click(findTestObject('Object Repository/Connector/3.Connector Forgotpassword_OR/4Loginbutton'))
String Str1 = WebUI.getText(findTestObject('Object Repository/Connector/1.Connector Login_OR/6.Passwordfield required'))
String Str2 = 'The Password field is required.'
if(Str1 == Str2){
'Wrong Password'
WebUI.setText(findTestObject('Object Repository/Connector/3.Connector Forgotpassword_OR/2.Password'),'Satva12133#')
}
WebUI.delay(2)
//WebUI.click(findTestObject('Object Repository/Connector/1.Connector Login_OR/3.Remberme'))

void myLogin1(){
	WebUI.click(findTestObject('Object Repository/Connector/3.Connector Forgotpassword_OR/3.Remberme'))
	
	WebUI.click(findTestObject('Object Repository/Connector/3.Connector Forgotpassword_OR/4Loginbutton'))
}
myLogin1()

String Str3 = WebUI.getText(findTestObject('Object Repository/Connector/3.Connector Forgotpassword_OR/5.LoginerrorMessage'))

String Str4 = 'Invalid username or password.'
//assert Str1 == Str2

"Invalid username or password Condition and It is Going To registration Page"
if(Str3 == Str4){
WebUI.click(findTestObject('Connector/3.Connector Forgotpassword_OR/7.ForgotPasswordLink'))
}


"Email field Required"
WebUI.click(findTestObject('Object Repository/Connector/3.Connector Forgotpassword_OR/9.Forgot Submitbutton'))

String str5 = WebUI.getText(findTestObject('Object Repository/Connector/3.Connector Forgotpassword_OR/10.UsernameRequired'))
String str6 = "The Email field is required."

"Email field Required Condition"


if(str5 == str6){
	"Enter Wrong password and Validate correct or Not"
	WebUI.setText(findTestObject('Object Repository/Connector/3.Connector Forgotpassword_OR/8.EnterRegisteredemailid'),'Saatva6.0@getnada.com')
	WebUI.click(findTestObject('Object Repository/Connector/3.Connector Forgotpassword_OR/9.Forgot Submitbutton'))
	
	String str7 = WebUI.getText(findTestObject('Object Repository/Connector/3.Connector Forgotpassword_OR/9.1EmailidAddressdoesnotExist'))
	String str8 = "Email Address does not exist."
	
	"Register mail id validations"
	if(str7 == str8){
		WebUI.setText(findTestObject('Object Repository/Connector/3.Connector Forgotpassword_OR/8.EnterRegisteredemailid'),'Satva6.0@getnada.com')
		WebUI.click(findTestObject('Object Repository/Connector/3.Connector Forgotpassword_OR/9.Forgot Submitbutton'))
		"Connector ICon Checking"
		}

	
}