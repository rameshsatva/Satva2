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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://demo.nopcommerce.com/register')

not_run: WebUI.click(findTestObject('Alerts/Click'))

not_run: WebUI.verifyAlertPresent(10)

not_run: actualmsg = WebUI.getAlertText()

not_run: WebUI.verifyMatch(actualmsg, 'Please enter some search keyword', false)

not_run: WebUI.acceptAlert()

not_run: WebUI.setText(findTestObject('Alerts/Textbox'), 'as')

not_run: WebUI.click(findTestObject('Alerts/Search'))

WebUI.delay(10)

WebUI.scrollToPosition(0, 1000)

not_run: WebUI.sendKeys(findTestObject('Alerts/Firstname'), 'Rameshbabu')

WebUI.scrollToPosition(0, 300)

WebUI.sendKeys(findTestObject('Alerts/Firstname'), Keys.chord(Keys.CONTROL, 'a'))

WebUI.sendKeys(findTestObject('Alerts/Firstname'), Keys.chord(Keys.CONTROL, 'c'))

WebUI.sendKeys(findTestObject('Alerts/Lastname'), Keys.chord(Keys.CONTROL, 'v'))

WebUI.sendKeys(findTestObject('Alerts/Lastname'), Keys.chord(Keys.CONTROL, 'DELETE'))

WebUI.sendKeys(findTestObject('Alerts/Email'), Keys.chord(Keys.CONTROL, 'DELETE'))

WebUI.sendKeys(findTestObject('Alerts/Register'), Keys.chord(Keys.PAGE_DOWN))

WebUI.sendKeys(findTestObject('Alerts/Search'), Keys.chord(Keys.PAGE_UP))

WebUI.sendKeys(findTestObject(null), Keys.chord(Keys.F5))

WebUI.acceptAlert()

