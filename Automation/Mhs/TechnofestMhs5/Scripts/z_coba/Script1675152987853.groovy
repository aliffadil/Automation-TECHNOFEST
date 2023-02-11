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

WebUI.click(findTestObject('Object Repository/test/span_Login'))

WebUI.setText(findTestObject('Object Repository/test/input_Login_email'), '191131007@mhs.stiki.ac.id')

WebUI.setEncryptedText(findTestObject('Object Repository/test/input_Login_password'), 'gJDpl9HgeOkZcTwgqZSVJQ==')

WebUI.click(findTestObject('Object Repository/test/button_Login'))

WebUI.click(findTestObject('Object Repository/test/a_Project'))

WebUI.click(findTestObject('Object Repository/test/a_List Projects'))

WebUI.click(findTestObject('Object Repository/test/a_Add Item'))

WebUI.click(findTestObject('Object Repository/Project/Add project/Desc1'))

WebUI.setText(findTestObject('Object Repository/Project/Add project/Desc2'), '<p style="">ini deskripsi</p>')

WebUI.click(findTestObject('Object Repository/test/ul__select2-selection__rendered'))

WebUI.openBrowser('')

WebUI.closeBrowser()

