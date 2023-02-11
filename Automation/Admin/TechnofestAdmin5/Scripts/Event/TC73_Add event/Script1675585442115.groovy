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

WebUI.click(findTestObject('Event/Add event/Action button'))

WebUI.click(findTestObject('Event/Add event/Add Data'))

WebUI.verifyElementText(findTestObject('Event/Add event/Create Event'), 'Create Event')

WebUI.setText(findTestObject('Event/Add event/Title'), 'Test event')

WebUI.click(findTestObject('Event/Add event/YT'))

WebUI.setText(findTestObject('Event/Add event/YT link'), 'iniyt.com')

WebUI.click(findTestObject('Event/Add event/Choose one'))

WebUI.setText(findTestObject('Event/Add event/Search visibility'), 'hidden')

WebUI.sendKeys(findTestObject('Event/Add event/Search visibility'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Event/Add event/Submit button'))

