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
//WebUI.waitForPageLoad()
WebUI.takeScreenshot("C:\\Users\\Ram\\Desktop\\Screenshot\\Screenshot1.png")
	
WebUI.navigateToUrl("staging-connector.satvasolutions.com")

WebUI.takeScreenshot('C:\\Users\\Ram\\Desktop\\Screenshot\\Screenshot2.png')


WebUI.setText(findTestObject('Object Repository/Screenshots/email'),'vram@getnada.com')

WebUI.takeScreenshot('C:\\Users\\Ram\\Desktop\\Screenshot\\Screenshot3.png')

WebUI.setText(findTestObject('Screenshots/password'), 'Satva1213#')

WebUI.takeScreenshot('C:\\Users\\Ram\\Desktop\\Screenshot\\Screenshot4.png')

WebUI.click(findTestObject('Screenshots/Login'))
WebUI.takeScreenshot('C:\\Users\\Ram\\Desktop\\Screenshot\\Screenshot5.png')



WebUI.setText(findTestObject('Object Repository/Screenshots/email'),'vram@getnada.com')

WebUI.takeScreenshot('C:\\Users\\Ram\\Desktop\\Screenshot1\\Screenshot1.png')

WebUI.setText(findTestObject('Screenshots/password'), 'Satva1213#')

WebUI.takeScreenshot('C:\\Users\\Ram\\Desktop\\Screenshot1\\Screenshot2.png')

WebUI.click(findTestObject('Screenshots/Login'))
WebUI.takeScreenshot('C:\\Users\\Ram\\Desktop\\Screenshot1\\Screenshot3.png')