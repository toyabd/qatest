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

WebUI.click(findTestObject('Object Repository/Page_toyabds gists/svg_Back to GitHub_octicon octicon-plus'))

WebUI.setText(findTestObject('Page_Create a new Gist/input_See all of your gists_gistdescription'), 'test')

WebUI.setText(findTestObject('Page_Create a new Gist/input_See all of your gists_gistcontentsname'), 'test')

WebUI.click(findTestObject('Page_Create a new Gist/pre_'))

WebUI.setText(findTestObject('Page_Create a new Gist/div_1test'), '<div style="position: relative;"><div class="CodeMirror-gutter-wrapper" contenteditable="false" style="left: -53px;"><div class="CodeMirror-linenumber CodeMirror-gutter-elt" style="left: 0px; width: 21px;">1</div></div><pre class=" CodeMirror-line " role="presentation" style=""><span role="presentation" style="padding-right: 0.1px;">test</span></pre></div>')

WebUI.click(findTestObject('Page_Create a new Gist/button_Create public gist'))

WebUI.closeBrowser()

