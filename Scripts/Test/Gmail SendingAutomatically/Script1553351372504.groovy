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

WebUI.setText(findTestObject('Gmail sending/Page_Gmail/1.Gmail(input)'), 'ramesh6061994@gmail.com')

"After Enterning email Take Screenshot"

WebUI.takeScreenshot("C:\\Users\\Ram\\Desktop\\Screenshot2\\Screenshot1.png")

WebUI.click(findTestObject('Gmail sending/Page_Gmail/2.Gmail NextButton'))

"After Enterning email Take Screenshot"

WebUI.takeScreenshot("C:\\Users\\Ram\\Desktop\\Screenshot2\\Screenshot2.png")

WebUI.setEncryptedText(findTestObject('Gmail sending/Page_Gmail/3.Gmail Password'), 'tOmriue1I85QnOEXxCFOYw==')

"After Enterning password  Take Screenshot"
WebUI.takeScreenshot("C:\\Users\\Ram\\Desktop\\Screenshot2\\Screenshot2.png")

//WebUI.click(findTestObject('Gmail sending/Page_Gmail/2.Gmail NextButton'))

WebUI.click(findTestObject('Object Repository/Gmail/4.Passwordnextbutton'))


"After Enterning Gmail Take Screenshot"
WebUI.takeScreenshot("C:\\Users\\Ram\\Desktop\\Screenshot2\\Screenshot3.png")

WebUI.click(findTestObject('Gmail sending/Page_Inbox (10) - ramesh6061994gmai/1.Compose'))


"After Clicking Take Screenshot"
WebUI.takeScreenshot("C:\\Users\\Ram\\Desktop\\Screenshot2\\Screenshot4.png")

WebUI.setText(findTestObject('Gmail sending/Page_Inbox (10) - ramesh6061994gmai/2.textarea_ToMailid'), 'ramesh6061994@gmail.com')

WebUI.delay('10')

void CC(){
WebUI.click(findTestObject('Gmail sending/Page_Inbox (10) - ramesh6061994gmai/3.Click Cc'))

WebUI.setText(findTestObject('Gmail sending/Page_Inbox (10) - ramesh6061994gmai/4.CC Text'), 'ramesh6061994@gmail.com')
}
CC()

/*WebUI.click(findTestObject('Gmail sending/Page_Inbox (10) - ramesh6061994gmai/span_Bcc'))

WebUI.setText(findTestObject('Gmail sending/Page_Inbox (10) - ramesh6061994gmai/textarea_Bcc_bcc'), 'ramesh6061994@gmail.com')
*/

WebUI.click(findTestObject('Gmail sending/Page_Inbox (10) - ramesh6061994gmai/5.1.Click subject box'),FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('Gmail sending/Page_Inbox (10) - ramesh6061994gmai/5.Subjectbox'),'katlon')


WebUI.setText(findTestObject('Gmail sending/Page_Inbox (10) - ramesh6061994gmai/6.Body of the mail'), 'Hi Please find the below Document')

//WebUI.click(findTestObject('Gmail sending/Page_Inbox (10) - ramesh6061994gmai/div_'),FailureHandling.OPTIONAL)

//WebUI.uploadFile(findTestObject('choosefile_button'), 'C:\Users\Ram\Desktop\Screenshot'))

//WebUI.uploadFile(findTestObject('Gmail sending/Page_Inbox (10) - ramesh6061994gmai/div_'), 'C:\\Users\\Ram\\Desktop\\Screenshot.png')


dd()
def dd() {
	WebUI.click(findTestObject('Gmail sending/Page_Inbox (10) - ramesh6061994gmai/div_'),FailureHandling.OPTIONAL)
	Runtime runTime = Runtime.getRuntime()
	Process process = runTime.exec('C:\\Users\\Ram\\Desktop\\A2.exe')
	//C:\Users\Ram\Desktop\A2.exe
}
WebUI.delay("20")
dd()
WebUI.delay("20")
dd()

WebUI.delay("20")
WebUI.click(findTestObject('Gmail sending/Page_Inbox (10) - ramesh6061994gmai/SendButton'))





void Logout(){
WebUI.click(findTestObject('Gmail sending/Page_Inbox (11) - ramesh6061994gmai/Alert message'),FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Gmail sending/Page_Inbox (11) - ramesh6061994gmai/Profile ICon'),FailureHandling.OPTIONAL)

WebUI.click(findTestObject('Gmail sending/Page_Inbox (11) - ramesh6061994gmai/a_Sign out'))}
//Logout()

