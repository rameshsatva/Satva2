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


RunConfiguration.setExecutionSettingFile('C:\\Users\\Ram\\AppData\\Local\\Temp\\Katalon\\Test Cases\\Login\\Editprofile\\20190118_190606\\execution.properties')

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

not_run: WebUI.maximizeWindow()

not_run: WebUI.navigateToUrl('https://connector.satvasolutions.com/EditProfile')

not_run: WebUI.setText(findTestObject('Login/Username'), 'ramesh6061994@gmail.com')

not_run: WebUI.setText(findTestObject('Login/Password'), 'Ramesh1213#')

not_run: WebUI.click(findTestObject('Login/Login'))

not_run: WebUI.click(findTestObject('Edit profile/Manage'))

not_run: WebUI.click(findTestObject('Edit profile/Editprofile'))

not_run: WebUI.setText(findTestObject('Edit profile/Firstname'), 'Ramesh')

WebUI.setText(findTestObject('Edit profile/LastName'), 'Babu')

WebUI.setText(findTestObject('Edit profile/StreetAddress'), 'Iscon')

WebUI.setText(findTestObject('Object Repository/Edit profile/City'), 'Surat')

WebUI.setText(findTestObject('Object Repository/Edit profile/State'), 'Pune')

WebUI.setText(findTestObject('Object Repository/Edit profile/Country'), 'India')

WebUI.setText(findTestObject('Object Repository/Edit profile/Zipcode'), '53308')

WebUI.setText(findTestObject('Object Repository/Edit profile/officenumber'), '1234556')

WebUI.setText(findTestObject('Object Repository/Edit profile/Mobile'), '123456999')

WebUI.click()

''', 'Test Cases/Login/Editprofile', new TestCaseBinding('Test Cases/Login/Editprofile',[:]), FailureHandling.STOP_ON_FAILURE , false)
    
