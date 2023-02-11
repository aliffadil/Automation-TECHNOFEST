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

WebUI.click(findTestObject('User/Moderator/Edit moderator/Moderator'))

WebUI.setText(findTestObject('User/Moderator/Edit moderator/Search'), 'edit')

WebUI.click(findTestObject('User/Moderator/Edit moderator/Edit button'))

WebUI.clearText(findTestObject('User/Moderator/Edit moderator/Name'))

WebUI.setText(findTestObject('User/Moderator/Edit moderator/Name'), 'edit moderator baru')

WebUI.clearText(findTestObject('User/Moderator/Edit moderator/Email'))

WebUI.setText(findTestObject('User/Moderator/Edit moderator/Email'), 'editmoderatorbaru@gmail.com')

WebUI.setText(findTestObject('User/Moderator/Edit moderator/Password'), 'ubah123')

WebUI.clearText(findTestObject('User/Moderator/Edit moderator/Telephone'))

WebUI.setText(findTestObject('User/Moderator/Edit moderator/Telephone'), '08231234567')

WebUI.click(findTestObject('User/Moderator/Edit moderator/Submit button'))
