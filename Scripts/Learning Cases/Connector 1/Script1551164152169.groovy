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


for (int i=0; i<4; i++){
//WebUI.navigateToUrl('https://staging-connector.satvasolutions.com/')


WebUI.setText(findTestObject('Connector/1.Connector Login_OR/1.E-mail1'), 'Satva3.9@getnada.com')

WebUI.setText(findTestObject('Connector/1.Connector Login_OR/2.Password'), 'Satva1213')

WebUI.click(findTestObject('Connector/1.Connector Login_OR/4Loginbutton'))
/*WebUI.switchToWindowUrl('https://staging-connector.satvasolutions.com/')
WebUI.clearText(findTestObject('Connector/1.Connector Login_OR/1.E-mail1'))*/


}

