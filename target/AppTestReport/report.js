$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("AppLoginFeature.feature");
formatter.feature({
  "line": 1,
  "name": "Verify App Login with different user credentials",
  "description": "",
  "id": "verify-app-login-with-different-user-credentials",
  "keyword": "Feature"
});
formatter.before({
  "duration": 12920308839,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "Successful App Url Launch",
  "description": "",
  "id": "verify-app-login-with-different-user-credentials;successful-app-url-launch",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "I enter the App url",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "I land to Homepage",
  "keyword": "And "
});
formatter.step({
  "line": 6,
  "name": "I enter valid username",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "I enter valid password",
  "keyword": "And "
});
formatter.step({
  "line": 8,
  "name": "I click on Login button",
  "keyword": "When "
});
formatter.step({
  "line": 9,
  "name": "I should land to Dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "AppLoginTestSteps.i_enter_the_App_url()"
});
formatter.result({
  "duration": 3088013240,
  "status": "passed"
});
formatter.match({
  "location": "AppLoginTestSteps.i_land_to_Homepage()"
});
formatter.result({
  "duration": 22693358,
  "status": "passed"
});
formatter.match({
  "location": "AppLoginTestSteps.i_enter_valid_username()"
});
formatter.result({
  "duration": 457725087,
  "status": "passed"
});
formatter.match({
  "location": "AppLoginTestSteps.i_enter_valid_password()"
});
formatter.result({
  "duration": 261295849,
  "status": "passed"
});
formatter.match({
  "location": "AppLoginTestSteps.i_click_on_Login_button()"
});
formatter.result({
  "duration": 2260937244,
  "status": "passed"
});
formatter.match({
  "location": "AppLoginTestSteps.i_should_land_to_Dashboard_page()"
});
formatter.result({
  "duration": 102089800,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c...ck to Mercury Tours![123]\u003e but was:\u003c...ck to Mercury Tours![]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat appCommonMethods.CommonMethods.compareTwoStrings(CommonMethods.java:46)\r\n\tat pageAction.HomePageAction.verifyDashboardPage(HomePageAction.java:23)\r\n\tat testStepsDefinition.AppLoginTestSteps.i_should_land_to_Dashboard_page(AppLoginTestSteps.java:56)\r\n\tat ✽.Then I should land to Dashboard page(AppLoginFeature.feature:9)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1534829063,
  "status": "passed"
});
formatter.before({
  "duration": 3909088535,
  "status": "passed"
});
formatter.scenario({
  "line": 12,
  "name": "Successful App Url Launch Invalid",
  "description": "",
  "id": "verify-app-login-with-different-user-credentials;successful-app-url-launch-invalid",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 13,
  "name": "I enter the App url",
  "keyword": "Given "
});
formatter.step({
  "line": 14,
  "name": "I land to Homepage",
  "keyword": "And "
});
formatter.step({
  "line": 15,
  "name": "I enter valid username",
  "keyword": "And "
});
formatter.step({
  "line": 16,
  "name": "I enter valid password",
  "keyword": "And "
});
formatter.step({
  "line": 17,
  "name": "I click on Login button",
  "keyword": "When "
});
formatter.step({
  "line": 18,
  "name": "I should land to Dashboard page",
  "keyword": "Then "
});
formatter.match({
  "location": "AppLoginTestSteps.i_enter_the_App_url()"
});
formatter.result({
  "duration": 2822842210,
  "status": "passed"
});
formatter.match({
  "location": "AppLoginTestSteps.i_land_to_Homepage()"
});
formatter.result({
  "duration": 18774342,
  "status": "passed"
});
formatter.match({
  "location": "AppLoginTestSteps.i_enter_valid_username()"
});
formatter.result({
  "duration": 249466987,
  "status": "passed"
});
formatter.match({
  "location": "AppLoginTestSteps.i_enter_valid_password()"
});
formatter.result({
  "duration": 222395748,
  "status": "passed"
});
formatter.match({
  "location": "AppLoginTestSteps.i_click_on_Login_button()"
});
formatter.result({
  "duration": 2623474643,
  "status": "passed"
});
formatter.match({
  "location": "AppLoginTestSteps.i_should_land_to_Dashboard_page()"
});
formatter.result({
  "duration": 87354785,
  "error_message": "org.junit.ComparisonFailure: expected:\u003c...ck to Mercury Tours![123]\u003e but was:\u003c...ck to Mercury Tours![]\u003e\r\n\tat org.junit.Assert.assertEquals(Assert.java:115)\r\n\tat org.junit.Assert.assertEquals(Assert.java:144)\r\n\tat appCommonMethods.CommonMethods.compareTwoStrings(CommonMethods.java:46)\r\n\tat pageAction.HomePageAction.verifyDashboardPage(HomePageAction.java:23)\r\n\tat testStepsDefinition.AppLoginTestSteps.i_should_land_to_Dashboard_page(AppLoginTestSteps.java:56)\r\n\tat ✽.Then I should land to Dashboard page(AppLoginFeature.feature:18)\r\n",
  "status": "failed"
});
formatter.after({
  "duration": 1436352368,
  "status": "passed"
});
});