import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('https://gist.github.com/discover')

WebUI.click(findTestObject('Page_Discover gists  GitHub/a_Signin'))

WebUI.setText(findTestObject('Page_Sign in to GitHub  GitHub/input_Username or email address_login'), 'toy.abdlh@gmail.com')

WebUI.setEncryptedText(findTestObject('Page_Sign in to GitHub  GitHub/input_Forgot password_password'), 's90o1MsbF/w/EAanWH6NzqJXWoVGJxw7')

WebUI.click(findTestObject('Page_Sign in to GitHub  GitHub/input_Forgot password_commit'))

WebUI.click(findTestObject('Page_Discover gists/summary_Back to GitHub_Header-link name'))

WebUI.click(findTestObject('Page_Discover gists/a_Your gists'))

WebUI.click(findTestObject('Object Repository/Page_toyabds gists/strong_Gist Name'))

WebUI.click(findTestObject('Object Repository/Page_Gist Desc/a_Edit'))

WebUI.click(findTestObject('Object Repository/Page_Editing Gist Name/div_1test'))

WebUI.setText(findTestObject('Object Repository/Page_Editing Gist Name/div_1test2edit'), '<div style="position: relative;"><div class="CodeMirror-gutter-wrapper" contenteditable="false" style="left: -53px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">1</div></div><pre class=" CodeMirror-line " role="presentation" style=""><span role="presentation" style="padding-right: 0.1px;">test</span></pre></div><div style="position: relative;"><div class="CodeMirror-gutter-wrapper" contenteditable="false" style="left: -53px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">2</div></div><pre class=" CodeMirror-line " role="presentation" style=""><span role="presentation" style="padding-right: 0.1px;">edit</span></pre></div>')

WebUI.click(findTestObject('Object Repository/Page_Editing Gist Name/button_Update public gist'))

WebUI.closeBrowser()

