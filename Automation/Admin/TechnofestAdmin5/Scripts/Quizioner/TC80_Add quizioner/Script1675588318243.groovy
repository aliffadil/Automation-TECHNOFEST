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

WebUI.click(findTestObject('Quizioner/Add quizioner/Action button'))

WebUI.click(findTestObject('Quizioner/Add quizioner/Add Item'))

WebUI.verifyElementText(findTestObject('Quizioner/Add quizioner/Create Quizioner'), 'Create Quizioner')

WebUI.setText(findTestObject('Quizioner/Add quizioner/Question'), 'test pertanyaan ?')

WebUI.click(findTestObject('Quizioner/Add quizioner/Choose type'))

WebUI.setText(findTestObject('Quizioner/Add quizioner/Search type'), 'text')

WebUI.sendKeys(findTestObject('Quizioner/Add quizioner/Search type'), Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Quizioner/Add quizioner/Name'), 'test name')

WebUI.setText(findTestObject('Quizioner/Add quizioner/Placeholder'), 'test placeholder')

WebUI.setText(findTestObject('Quizioner/Add quizioner/Caption'), 'test caption')

WebUI.click(findTestObject('Quizioner/Add quizioner/Sequence'))

WebUI.sendKeys(findTestObject('Quizioner/Add quizioner/Sequence'), Keys.chord(Keys.NUMPAD6))

WebUI.sendKeys(findTestObject('Quizioner/Add quizioner/Sequence'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Quizioner/Add quizioner/Status'))

WebUI.sendKeys(findTestObject('Quizioner/Add quizioner/Status'), 'n')

WebUI.sendKeys(findTestObject('Quizioner/Add quizioner/Status'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Quizioner/Add quizioner/Is Required'))

WebUI.click(findTestObject('Quizioner/Add quizioner/Submit button'))

