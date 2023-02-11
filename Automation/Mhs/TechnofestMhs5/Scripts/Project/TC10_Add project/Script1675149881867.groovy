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

WebUI.click(findTestObject('Project/Add project/List Projects'))

WebUI.click(findTestObject('Project/Add project/Add Item'))

WebUI.setText(findTestObject('Project/Add project/Title'), 'Testproject')

WebUI.click(findTestObject('Project/Add project/Category'))

WebUI.setText(findTestObject('Project/Add project/Search'), 'UI')

WebUI.sendKeys(findTestObject('Project/Add project/Search'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Project/Add project/Desc2'), 'ini adalah deskripsi project')

WebUI.uploadFile(findTestObject('Project/Add project/Poster'), 'C:\\FILE\\TA\\logo.png')

WebUI.setText(findTestObject('Project/Add project/Supervisor'), 'test dospem')

WebUI.sendKeys(findTestObject('Project/Add project/Supervisor'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Project/Add project/Add Member'))

WebUI.setText(findTestObject('Project/Add project/Search Member'), 'hafifi')

WebUI.sendKeys(findTestObject('Project/Add project/Search Member'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Project/Add project/Thumbnail'))

WebUI.setText(findTestObject('Project/Add project/Thumbnail'), 'logo')

WebUI.sendKeys(findTestObject('Project/Add project/Thumbnail'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Project/Add project/Link code'), 'code.com')

WebUI.setText(findTestObject('Project/Add project/Link demo'), 'demo.com')

WebUI.setText(findTestObject('Project/Add project/Link video'), 'video.com')

WebUI.click(findTestObject('Project/Add project/Submit button'))

