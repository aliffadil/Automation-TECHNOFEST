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

WebUI.setText(findTestObject('Setting/Semester/Edit semester/Search'), 'edit')

WebUI.click(findTestObject('Setting/Semester/Edit semester/Edit button'))

WebUI.verifyElementText(findTestObject('Setting/Semester/Edit semester/Update Semester test'), 'Update Semester Test')

WebUI.clearText(findTestObject('Setting/Semester/Edit semester/Edit semester'))

WebUI.setText(findTestObject('Setting/Semester/Edit semester/Edit semester'), 'Genap 2026/2027')

WebUI.clearText(findTestObject('Setting/Semester/Edit semester/Edit title'))

WebUI.setText(findTestObject('Setting/Semester/Edit semester/Edit title'), 'Test TECHNOFEST edit baru')

WebUI.clearText(findTestObject('Setting/Semester/Edit semester/Edit position'))

WebUI.setText(findTestObject('Setting/Semester/Edit semester/Edit position'), '16')

WebUI.click(findTestObject('Setting/Semester/Edit semester/Submit button'))

