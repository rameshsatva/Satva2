import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.junit.After

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

WebUI.navigateToUrl('https://staging-connector.satvasolutions.com')

'Enter Username'
WebUI.setText(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/A.Username'), 'satva6.0@getnada.com')

'Enter Password'
WebUI.setText(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/B.Password'), 'Satva1213#')

//WebUI.sendKeys(findTestObject('Object Repository/OR4/Page_Log in/input_Login To Your Account_Pa'), Keys.chord(Keys.ENTER))
'Click Login Button'
WebUI.click(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/D.Login Button'))

'Click DashBoard Button'
WebUI.click(findTestObject('Connector/6.Connector LoginLogout_OR/E.DashBoard_ORs/E.Dashboard'))

'Click Synclog Button'
WebUI.click(findTestObject('Connector/6.Connector LoginLogout_OR/F.Synclogfolder/F.Synclog'))


void Synclog1(){
"Enter Text (OrderID)"
WebUI.setText(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/F.Synclogfolder/4.SearchTextbox'), '2364')

"Clcik Clear Button"
WebUI.click(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/F.Synclogfolder/1.ClearButton'))

"Verify Log Dates"

"Select LogDate in This Month "

WebUI.click(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/F.Synclogfolder/7.Logdate'))

WebUI.delay('5')

"Click Apply Button"
WebUI.click(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/F.Synclogfolder/8.Apply button'))


/*"Select LogDate in Yesterday "
WebUI.selectOptionByLabel(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/F.Synclogfolder/7.Logdate'),"Yesterday", false,FailureHandling.STOP_ON_FAILURE)
"Select LogDate in Today"
WebUI.selectAllOption(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/F.Synclogfolder/7.Logdate'))
"Select LogDate in Last 7 Days "
WebUI.selectOptionByLabel(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/F.Synclogfolder/7.Logdate'),"Last 7 Days", false)

"Select LogDate in Last 30 Days "
WebUI.selectOptionByLabel(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/F.Synclogfolder/7.Logdate'),"Last 30 Days", false)


"Select LogDate in Last Month "
WebUI.selectOptionByLabel(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/F.Synclogfolder/7.Logdate'),"Last Month", false)


//Custom Range
"Select LogDate Custom Range "
WebUI.selectOptionByLabel(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/F.Synclogfolder/7.Logdate'),"Custom Range", false)
*/

"Click  Log Status"
WebUI.click(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/F.Synclogfolder/5.Logstatus'))

"Select Download in Log Status"

WebUI.selectOptionByLabel(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/F.Synclogfolder/5.Logstatus'), "Downloaded", false, FailureHandling.STOP_ON_FAILURE)



"Select Download in Log Status"
WebUI.selectOptionByLabel(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/F.Synclogfolder/5.Logstatus'), "Uploaded", false, FailureHandling.STOP_ON_FAILURE)

WebUI.delay('10')

"Select Download in Log Status"
WebUI.selectOptionByLabel(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/F.Synclogfolder/5.Logstatus'), "Error", false, FailureHandling.STOP_ON_FAILURE)


"Click Log Type"

WebUI.selectOptionByLabel(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/F.Synclogfolder/6.LogType'),"select", false)

"Click Search Button"
WebUI.click(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/F.Synclogfolder/2.SearchButton'))

'Click Synclog Button'
//WebUI.click(findTestObject('Connector/6.Connector LoginLogout_OR/F.Synclogfolder/F.Synclog'))
}
//Synclog1()
"Click Setting DropDown"

WebUI.click(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/H.Settings'))

'Click MySubscrpition Button'
WebUI.click(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/H.1.MySubscrpition'))
	
" Inside MySubscrpition Free Plan method"

void BuyFreePlan(){

WebUI.click(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/H.1.MySubscrpition'))

WebUI.click(findTestObject('Connector/6.Connector LoginLogout_OR/H.1.0.BuyFree planButton'))

"Move to IFRAME"
//WebUI.switchToFrame(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/Page_Plan/iframe__stripe_checkout_app'), 5)


WebUI.setText(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/Page_Plan/input_Card number_53cabef0-457'),"4111 1111 1111 1111")

WebUI.setText(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/Page_Plan/input_Expiry_53cae600-457f-11e'),"12/25")

WebUI.setText(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/Page_Plan/input_CVC_53cae601-457f-11e9-a'),"123")

WebUI.click(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/Page_Plan/button_Pay'))
}



" Inside MySubscrpition Cloud Plan method"

void BuyCloudPlan(){

WebUI.click(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/H.1.MySubscrpition'))

WebUI.click(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/H.1.2.BuyCloudPlanButton'))

WebUI.setText(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/Page_Plan/input_Card number_53cabef0-457'),"4111 1111 1111 1111")

WebUI.setText(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/Page_Plan/input_Expiry_53cae600-457f-11e'),"12/25")

WebUI.setText(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/Page_Plan/input_CVC_53cae601-457f-11e9-a'),"123")

WebUI.click(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/Page_Plan/button_Pay'))
}
//BuyFreePlan()
//BuyCloudPlan()

"MySubscrpition Ends Here"


'Click Connections'
WebUI.click(findTestObject('Connector/6.Connector LoginLogout_OR/H.2.0.Connections'))

"My Connections Method Start Here"

void nopCommerceConnection(){
	
	'Click Connections(Nopcommerce to Connector)'
	WebUI.click(findTestObject('Connector/6.Connector LoginLogout_OR/H.2.0.Connections'))
	
	'Click Connect To nopCommerce link'
	WebUI.click(findTestObject('Connector/6.Connector LoginLogout_OR/H.2.1.Connect To nopCommerce'))
	
	'Click DisConnect To nopCommerce'
	//if(WebUI.click(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/H.2.6.nopcommerceDisconnectbutton'))){}
	
	'Click Connect To nopCommerce'
	//WebUI.click(findTestObject('Connector/6.Connector LoginLogout_OR/H.2.1.Connect To nopCommerce'))
	
	'Enter nopCommerce URL'
	WebUI.setText(findTestObject('Connector/6.Connector LoginLogout_OR/H.2.2.nopcommerceURl'), 'http://demo1991.satva.solutions:1115/')
	
	'Enter nopCommerce Client ID example'
	WebUI.setText(findTestObject('Connector/6.Connector LoginLogout_OR/H.2.3.nopcommerceClient ID'), 'a35ba3b0-8705-453d-9b8c-5e5b270d5029')
	
	'Enter nopCommerce \tClient Secret example'
	WebUI.setText(findTestObject('Connector/6.Connector LoginLogout_OR/H.2.4.nopCommerce Client Secret'), '0332c9fb-ead7-42d2-8d4c-fc15fa2c854a')
	
	'Click nopcommerce Connection SucessButton'
	WebUI.click(findTestObject('Connector/6.Connector LoginLogout_OR/H.2.5.nopcommerceConnection save button'))
	WebUI.delay("10")
	}
	nopCommerceConnection()
	
Actionmethod()


"Action Method"
void Actionmethod(){
	

WebUI.click(findTestObject('Connector/6.Connector LoginLogout_OR/I.ActionONbutton'))

String Str1 = WebUI.getText(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/I.1.ActionAlertmessage'))
String Str2 = "Check from and to channel connection configuration, Also setup Configurations"

if(Str1 == Str2){
ZohobookConnection()
	}}
//Actionmethod()

	
"Connect Zohobook to nopcommerce connection Starts here"

	void ZohobookConnection() {
		
		'Click Connections(Zoho to Connector)'
		WebUI.click(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/H.2.3.1.Connect To Zoho Books'))
	
		'Click DisConnect To nopCommerce'
	/*if(WebUI.verifyElementPresent(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/H.2.3.4.Zoho Disconnect Button'))){
			
	WebUI.acceptAlert(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/H.2.3.4.Zoho Disconnect Button'))
			'Click Connections(Zoho to Connector)'
			WebUI.click(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/H.2.3.1.Connect To Zoho Books'))
		}*/
	
		'Enter Zoho book Access token'
		WebUI.setText(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/H.2.3.2.ZohobookToken'), 'a9f9b22c7f91614e13c744db19502319')
	
		'Click Zoho Connection SucessButton'
		WebUI.click(findTestObject('Object Repository/Page_My connections/button_Connect'))
		WebUI.delay("10")
	}
	
	//ZohobookConnection()
	
	
	
	//WebUI.click(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/J.Configurations'))
	//Configurations()
	
	
	
	void Configurations(){
	WebUI.click(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/J.Configurations'))
	
	TaxAccountconfiguration()
	Syncronizationconfiguration()
	
	}
	Configurations()
	
	
	void  TaxAccountconfiguration(){
									
		
	WebUI.selectOptionByLabel(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/J.1.2.US Country'), 'US Orgniztion', false)
	WebUI.delay('20')
	
	//WebUI.click(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/J.1.0.Createnew Orgnization'))
	//WebUI.navigateToUrl("https://staging-connector.satvasolutions.com/Connections/Index")
	
	"Item Tax Exemption"
	
	//WebUI.click(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/J.1.2.Item Tax Exemption'))
	
	
	//WebUI.back()
	
	"Customer Tax Exemption"
	//WebUI.click(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/J.1.3 Customer Tax Exemption'))
	
	//WebUI.navigateToUrl("https://staging-connector.satvasolutions.com/Connections/Index")
	
	//WebUI.back()
	"Customer Tax Authority"
	//WebUI.click(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/J.1.4.CustomerTaxAuthority'))
	
	//WebUI.navigateToUrl("https://staging-connector.satvasolutions.com/Connections/Index")
	//WebUI.back()
	
	
	"Click Tax Configuration Save  Button"
	WebUI.click(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/K.Tax configuration Save button'))
	}
	
	
	//TaxAccountconfiguration()
	
	
	void Syncronizationconfiguration(){
	
	"Click Sync order ON Button"
	
	WebUI.click(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/L.Syncsales orderONbutton'))
	
	"Click Inventory Enable ON Button"
	WebUI.click(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/M.Zoho Inventory Enable ON Button'))
	
	"Click Prevoius Button"
	WebUI.click(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/N.SyncConfigPreviousButton'))
	
	"Click Tax Configuration Save Button"
	WebUI.click(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/K.Tax configuration Save button'))
	
	
	"Click Zoho Enable link"
	//WebUI.click(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/M.Zoho Inventory enable ON Link'))
	
	//WebUI.back()
	
	//WebUI.navigateToUrl("https://staging-connector.satvasolutions.com/Connections/Index")
	
	"Click Tax Sync Configuration Save Button"
	WebUI.click(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/N.1.SyncConfigSaveButton'))
	
	}
	//Syncronizationconfiguration()
	
	"Enable the Connection"
	
	
	String Str3 = WebUI.getText(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/J.NopConfigurationsucessfulmessage'))
	String Str4 = "nopCommerce Configure save successfully..."
	
	if(Str3 == Str4){
	WebUI.click(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/I.ActionONbutton'))
	}
	else{
		Configurations()
	}
	"Click Insatlation Instructions"
	WebUI.click(findTestObject('Object Repository/Connector/6.Connector LoginLogout_OR/O.InstallationInstructions'))
	
	










