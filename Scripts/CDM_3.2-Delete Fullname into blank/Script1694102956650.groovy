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

Mobile.startApplication('D:\\Users\\bsi80197\\Downloads\\DemoAppV2 (1).apk', true)

Mobile.tap(findTestObject('Homepage/Btn_Login-Here'), 0)

Mobile.setText(findTestObject('Login Page/Field_Email-Login Page'), 'aditya.dwinugraha@mail.ugm.ac.id', 0)

Mobile.setText(findTestObject('Login Page/Field_password-login page'), 'Adittest1', 0)

Mobile.tap(findTestObject('Login Page/Btn_Login'), 0)

Mobile.tap(findTestObject('Homepage/Btn_icon profile-homepage-already login'), 0)

Mobile.tap(findTestObject('Object Repository/Profile/Btn_icon gear profile'), 0)

Mobile.tap(findTestObject('Object Repository/Profile/Btn_Edit profile-profile page'), 0)

Mobile.setText(findTestObject('Edit profile/Field_Fullname-Edit profile page'), '', 0)

Mobile.verifyElementText(findTestObject('Edit profile/Text_Cannot be empty and must be alphabetically-Edit profile page'), 
    'Cannot be empty and must be alphabetically')

Mobile.closeApplication()

