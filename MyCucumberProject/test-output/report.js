$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("FacebookLogin.feature");
formatter.feature({
  "line": 1,
  "name": "Login to facebook application",
  "description": "",
  "id": "login-to-facebook-application",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Facebook login Scenario",
  "description": "",
  "id": "login-to-facebook-application;facebook-login-scenario",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "open chrome browser",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user enters username and password",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "user clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 7,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "LoginFBStepFile.open_chrome_browser()"
});
formatter.result({
  "duration": 15795244563,
  "status": "passed"
});
formatter.match({
  "location": "LoginFBStepFile.user_enters_username_and_password()"
});
formatter.result({
  "duration": 846129488,
  "status": "passed"
});
formatter.match({
  "location": "LoginFBStepFile.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 261692861,
  "status": "passed"
});
formatter.match({
  "location": "LoginFBStepFile.close_the_browser()"
});
formatter.result({
  "duration": 2321989132,
  "status": "passed"
});
});