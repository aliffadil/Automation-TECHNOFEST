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

WebUI.click(findTestObject('Setting/Semester/Add semester/Semester 2'))

WebUI.click(findTestObject('Setting/Semester/Add semester/Add Data'))

WebUI.verifyElementText(findTestObject('Setting/Semester/Add semester/Create Semester'), 'Create Semester')

WebUI.setText(findTestObject('Setting/Semester/Add semester/Semester (1)'), 'Ganjil 2024/2025')

WebUI.setText(findTestObject('Setting/Semester/Add semester/Title'), 'Test TECHNOFEST add')

WebUI.setText(findTestObject('Setting/Semester/Add semester/Position'), '6')

WebUI.click(findTestObject('Setting/Semester/Add semester/Visibility'))

WebUI.setText(findTestObject('Setting/Semester/Add semester/Visibility search'), 'hidden')

WebUI.sendKeys(findTestObject('Setting/Semester/Add semester/Visibility search'), Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Setting/Semester/Add semester/Submit button'))

