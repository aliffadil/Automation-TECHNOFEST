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

WebUI.click(findTestObject('User/Participant/Edit participant/Participant'))

WebUI.setText(findTestObject('User/Participant/Edit participant/Search'), 'edit')

WebUI.click(findTestObject('User/Participant/Edit participant/Edit button'))

WebUI.clearText(findTestObject('User/Participant/Edit participant/Name'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('User/Participant/Edit participant/Name'), 'edit participant baru')

WebUI.clearText(findTestObject('User/Participant/Edit participant/Email'))

WebUI.setText(findTestObject('User/Participant/Edit participant/Email'), 'editparticipantbaru@gmail.com')

WebUI.setText(findTestObject('User/Participant/Edit participant/Password'), 'test1234')

WebUI.clearText(findTestObject('User/Participant/Edit participant/Student ID'))

WebUI.setText(findTestObject('User/Participant/Edit participant/Student ID'), '123123')

WebUI.clearText(findTestObject('User/Participant/Edit participant/College Origin'))

WebUI.setText(findTestObject('User/Participant/Edit participant/College Origin'), 'Malang')

WebUI.clearText(findTestObject('User/Participant/Edit participant/Telephone'))

WebUI.setText(findTestObject('User/Participant/Edit participant/Telephone'), '08231234567')

WebUI.click(findTestObject('User/Participant/Edit participant/Submit button'))

