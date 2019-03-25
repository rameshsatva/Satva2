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

WebUI.navigateToUrl('https://accounts.google.com/signin/v2/identifier?service=mail&passive=true&rm=false&continue=https%3A%2F%2Fmail.google.com%2Fmail%2F%3Ftab%3Dkm&scc=1&ltmpl=default&ltmplcache=2&emr=1&osid=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin')

WebUI.setText(findTestObject('Object Repository/Folder2/Page_Gmail/input_Continue to Gmail_identi'), 'ramesh6061994@gmail.com')

WebUI.click(findTestObject('Object Repository/Folder2/Page_Gmail/span_Next'))

WebUI.setEncryptedText(findTestObject('Object Repository/Folder2/Page_Gmail/input_Too many failed attempts'), 'tOmriue1I85QnOEXxCFOYw==')

WebUI.click(findTestObject('Object Repository/Gmail/4.Passwordnextbutton'))
	

//WebUI.click(findTestObject('Object Repository/Gmail/NoThanks'), FailureHandling.OPTIONAL)



WebUI.click(findTestObject('Object Repository/Gmail sending/Page_Inbox (10) - ramesh6061994gmai/1.Compose'))
	
	//findTestObject('Object Repository/Folder2/Page_Inbox (9) - ramesh6061994gmail/div_Compose'))
	
	//findTestObject('Object Repository/Folder2/Page_Inbox (9) - ramesh6061994gmail/div_Compose'))

WebUI.setText(findTestObject('Object Repository/Folder2/Page_Inbox (9) - ramesh6061994gmail/textarea_To_to'), 'ramesh6061994@gmail.com')

WebUI.click(findTestObject('Object Repository/Folder2/Page_Inbox (9) - ramesh6061994gmail/span_Cc'))

WebUI.setText(findTestObject('Object Repository/Folder2/Page_Inbox (9) - ramesh6061994gmail/textarea_Cc_cc'), 'ramesh6061994@gmail.com')

WebUI.setText(findTestObject('Object Repository/Folder2/Page_Inbox (9) - ramesh6061994gmail/input_Ram Satva_subjectbox'), 
    'Katlon Report')

WebUI.setText(findTestObject('Object Repository/Folder2/Page_Inbox (9) - ramesh6061994gmail/div_Hi How are u'), 'Hi How are u')

WebUI.click(findTestObject('Object Repository/Folder2/Page_Inbox (9) - ramesh6061994gmail/span_OK'))

not_run: WebUI.click(findTestObject('Object Repository/Folder2/Page_Inbox (9) - ramesh6061994gmail/div_'))

WebUI.click(findTestObject('Object Repository/Folder2/Page_Inbox (9) - ramesh6061994gmail/div_'))

WebUI.click(findTestObject('Object Repository/Folder2/Page_Inbox (9) - ramesh6061994gmail/div_Send'))

WebUI.click(findTestObject('Object Repository/Folder2/Page_Inbox (10) - ramesh6061994gmai/a_Inbox'))

WebUI.click(findTestObject('Object Repository/Folder2/Page_Inbox (10) - ramesh6061994gmai/span_Search_gb_ya gbii'))

WebUI.click(findTestObject('Object Repository/Folder2/Page_Inbox (10) - ramesh6061994gmai/a_Sign out'))

