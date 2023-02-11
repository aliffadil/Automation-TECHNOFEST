import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://technofest.stiki.ac.id/')

WebUI.click(findTestObject('Object Repository/z test/test5/span_Login'))

WebUI.setText(findTestObject('Object Repository/z test/test5/input_Login_email'), 'superadmin@technofest.stiki.ac.id')

WebUI.setEncryptedText(findTestObject('Object Repository/z test/test5/input_Login_password'), 'w/cjXUmhNyAsUmQO16pVzg==')

WebUI.click(findTestObject('Object Repository/z test/test5/span_Login'))

WebUI.click(findTestObject('Object Repository/z test/test5/a_Project'))

WebUI.click(findTestObject('Object Repository/z test/test5/a_List Projects'))

WebUI.click(findTestObject('Object Repository/z test/test5/a_Add Item'))

WebUI.setText(findTestObject('Object Repository/z test/test5/body_test'), '<p style="">test</p><div id="katalon" style="top: 0px;"><div id="katalon-rec_elementInfoDiv" style="display: none;"></div></div>')

WebUI.click(findTestObject('Object Repository/z test/test5/ul__select2-selection__rendered'))

