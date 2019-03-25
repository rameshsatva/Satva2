import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.logging.KeywordLogger
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.webui.contribution.WebUiDriverCleaner
import com.kms.katalon.core.mobile.contribution.MobileDriverCleaner
import com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner


DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.cucumber.keyword.internal.CucumberDriverCleaner())


RunConfiguration.setExecutionSettingFile('C:\\Users\\Ram\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Connector\\NopCommerce\\20190208_142141\\execution.properties')

TestCaseMain.beforeStart()

        TestCaseMain.runTestCaseRawScript(
'''import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
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

not_run: WebUI.openBrowser('')

not_run: WebUI.navigateToUrl('http://demo1991.satva.solutions:1115/')

not_run: WebUI.setText(findTestObject('NopCommerce/EMAIL'), 'vram@getnada.com')

not_run: WebUI.setText(findTestObject('NopCommerce/Password'), 'Satva1213#')

not_run: WebUI.click(findTestObject('NopCommerce/Login'))

not_run: WebUI.mouseOver(findTestObject('Object Repository/Datadriven/NopCommerce/Page_Your store/a_MEN (1)'))

not_run: WebUI.mouseOver(findTestObject('Object Repository/Datadriven/NopCommerce/Page_Your store/a_T-shirts (1)'))

not_run: WebUI.click(findTestObject('Object Repository/Datadriven/NopCommerce/Page_Your store/a_details'))

not_run: WebUI.click(findTestObject('Object Repository/Datadriven/NopCommerce/Page_Your store. New online store i/div_New online store is open'))

not_run: WebUI.click(findTestObject('Object Repository/Datadriven/NopCommerce/Page_Your store. New online store i/a_MEN'))

not_run: WebUI.click(findTestObject('Object Repository/Datadriven/NopCommerce/Page_Your store/div_PrevNext123    (window).lo'))

not_run: WebUI.click(findTestObject('Object Repository/Datadriven/NopCommerce/Page_Your store/div_PrevNext123    (window).lo'))

WebUI.click(findTestObject('Datadriven/NopCommerce/Sidebutton'))

''', 'Test Cases/Connector/NopCommerce', new TestCaseBinding('Test Cases/Connector/NopCommerce',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
