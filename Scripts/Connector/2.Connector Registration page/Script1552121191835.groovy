//import internal.GlobalVariable as GlobalVariable
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

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://staging-connector.satvasolutions.com')

WebUI.setText(findTestObject('Connector/2.Connector Registration page_OR/LoginEmail'), 'satva5.4@getnada.com')

WebUI.delay(2)

WebUI.setText(findTestObject('Connector/2.Connector Registration page_OR/LoginPassword'), 'Satva1213')

WebUI.delay(2)

/*void mymethod(){
	WebUI.click(findTestObject('Connector/2.Connector Registration page_OR/Loginbutton'))
}
mymethod()*/
WebUI.click(findTestObject('Connector/2.Connector Registration page_OR/Loginbutton'))

Str1 = WebUI.getText(findTestObject('Connector/2.Connector Registration page_OR/LoginerrorMessage'))

String Str2 = 'Invalid username or password.'

//assert Str1 == Str2

if(Str1 == Str2){
	
	//Error message was display  click registration registration link
	//Str1 and Str2 is Not equal  goto registration Page.
	WebUI.click(findTestObject('Connector/2.Connector Registration page_OR/RegisterLink'))
	}

else{
	WebUI.setText(findTestObject('Connector/2.Connector Registration page_OR/LoginPassword'), 'Satva1213#')
	WebUI.click(findTestObject('Connector/2.Connector Registration page_OR/Loginbutton'))
}
	//After login module it is  going to Registration Page
	//This Is already Registered Mail Id
WebUI.setText(findTestObject('Connector/2.Connector Registration page_OR/1Email'), 'satva6.2@getnada.com')

WebUI.setText(findTestObject('Connector/2.Connector Registration page_OR/2First Name'), 'Rameshbabu')

WebUI.setText(findTestObject('Connector/2.Connector Registration page_OR/3Last Name'), 'Gvs')

WebUI.setText(findTestObject('Connector/2.Connector Registration page_OR/4Company Name'), 'Satva solutions')

WebUI.setText(findTestObject('Connector/2.Connector Registration page_OR/5Contact No'), '9000603631')

not_run: WebUI.setText(findTestObject('Connector/2.Connector Registration page_OR/6Password'), 'Ramesh123$')

void method1(){
WebUI.setText(findTestObject('Connector/2.Connector Registration page_OR/6Password'), 'Ramesh123')


WebUI.click(findTestObject('Connector/2.Connector Registration page_OR/7Confirm Password'))

//Get the password Error Message Str1 Actual message
Str1 = WebUI.getText(findTestObject('Connector/2.Connector Registration page_OR/6.1PasswordNot Meet the Requirment'))
 
String Str2 = 'Password should be 6 to 15 character long with at least one Digit, Lowercase (\'a - z\') and Uppercase (\'A - Z\') character and Special character(Ex: $).'
WebUI.setText(findTestObject('Connector/2.Connector Registration page_OR/6Password'), 'Ramesh123#') 
	
	//Assert.assertEquals(Str1 == Str2);


//Password validation matched Or Not If Condition
if (Str1 == Str2) {
	//method1()
    WebUI.setText(findTestObject('Connector/2.Connector Registration page_OR/6Password'), 'Ramesh123#') 
	
	//Assert.assertEquals(Str1 == Str2);
}
 else {
    WebUI.setText(findTestObject('Connector/2.Connector Registration page_OR/7Confirm Password'), 'Ramesh123#')
}

WebUI.setText(findTestObject('Connector/2.Connector Registration page_OR/7Confirm Password'), 'Ramesh123')

WebUI.click(findTestObject('Connector/2.Connector Registration page_OR/7.1Eye'))
WebUI.click(findTestObject('Connector/2.Connector Registration page_OR/7.1Eye'))

//Confirm Password validation(Compare the Password and Confirm Password correct or NOt) If Condition
Str3 = WebUI.getText(findTestObject('Connector/2.Connector Registration page_OR/6.2Password notmatch'))

String Str4 = 'The password and confirmation password do not match.'

if (Str3 == Str4) {
    WebUI.setText(findTestObject('Connector/2.Connector Registration page_OR/7Confirm Password'), 'Ramesh123#')
}

WebUI.selectOptionByLabel(findTestObject('Connector/2.Connector Registration page_OR/SelectDropDown'), 'nopCommerce to Zoho Books', false)


WebUI.click(findTestObject('Connector/2.Connector Registration page_OR/8Register'))
//}
}
method1()

if (WebUI.verifyElementPresent(findTestObject('Connector/2.Connector Registration page_OR/9Already Registered mailvalidation'), 5))
{

	//Enter New Mail Address here
WebUI.setText(findTestObject('Connector/2.Connector Registration page_OR/1Email'), 'satva5.9@getnada.com')
method1()
}

//WebUI.click(findTestObject('Connector/2.Connector Registration page_OR/Loginlink'))

