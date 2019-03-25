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

WebUI.navigateToUrl('https://staging-connector.satvasolutions.com/')

//If u Want To Execute By Using Key word remove this Comments
//CustomKeywords.'com.at1.util.Connector.ConnectorLogin'()
WebUI.delay(5)

for (int i=0; i<4; i++){
WebUI.setText(findTestObject('1Datadriven/Email'), findTestData('Datadriven/ConnectorLogin').getValue(1, 1))

WebUI.setText(findTestObject('1Datadriven/Password'), findTestData('Datadriven/ConnectorLogin').getValue(2, 1))
WebUI.click(findTestObject('Object Repository/Datadriven/3.Remberme'))

WebUI.click(findTestObject('1Datadriven/Loginbutton'))


WebUI.navigateToUrl("https://staging-connector.satvasolutions.com/Account/Register")
}
