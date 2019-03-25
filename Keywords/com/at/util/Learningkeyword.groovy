
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

public class Learningkeyword {

	@Keyword
	public void Register(){

		WebUI.delay(5)


		WebUI.click(findTestObject('Keywordsnopcommerce/1Registerlink'))

		WebUI.click(findTestObject('Keywordsnopcommerce/1.2Femaleradiobutton'))

		WebUI.click(findTestObject('Keywordsnopcommerce/1.1MaleRadiobutton'))

		WebUI.setText(findTestObject('Keywordsnopcommerce/1.3First Name'), 'Rameshbabu')

		WebUI.setText(findTestObject('Keywordsnopcommerce/1.4Last Name'), 'Gvs')

		WebUI.selectOptionByLabel(findTestObject('Keywordsnopcommerce/1.5Day'), '6', false)

		WebUI.selectOptionByLabel(findTestObject('Keywordsnopcommerce/1.6Month'), 'July', false)

		WebUI.selectOptionByLabel(findTestObject('Keywordsnopcommerce/1.7Year'), '1994', false)

		WebUI.setText(findTestObject('Keywordsnopcommerce/1.8Email'), 'Satva3.3@getnada.com')

		WebUI.setText(findTestObject('Keywordsnopcommerce/1.9Company'), 'Satvasolutions')

		WebUI.setText(findTestObject('Keywordsnopcommerce/1.10Password'), 'Satva1213#')

		WebUI.setText(findTestObject('Keywordsnopcommerce/1.11Confirmpassword'), 'Satva1213#')

		WebUI.click(findTestObject('Keywordsnopcommerce/1.12Register'))

		WebUI.click(findTestObject('Keywordsnopcommerce/1.13Contunie'))

		WebUI.click(findTestObject('Keywordsnopcommerce/1.14Logout'))
	}
	@Keyword
	public void Login(){



		WebUI.delay(5)
		WebUI.click(findTestObject('Object Repository/Keywordsnopcommerce/2Loginlink'))


		WebUI.delay(2)

		WebUI.setText(findTestObject('Keywordsnopcommerce/3Email1'), 'satva3@getnada.com')

		WebUI.delay(5)

		WebUI.setText(findTestObject('Keywordsnopcommerce/4Password'), 'Satva1213#')

		WebUI.click(findTestObject('Keywordsnopcommerce/5Loginbutton'))

		WebUI.click(findTestObject('Keywordsnopcommerce/1.14Logout'))
	}
}
