$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/anuj.k.singh/eclipse-workspace/Cucumber_Project/Features/test.feature");
formatter.feature({
  "line": 1,
  "name": "login action",
  "description": "",
  "id": "login-action",
  "keyword": "Feature"
});
formatter.before({
  "duration": 179200,
  "status": "passed"
});
formatter.scenario({
  "line": 3,
  "name": "sucessful login",
  "description": "",
  "id": "login-action;sucessful-login",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 4,
  "name": "user is on home page",
  "keyword": "Given "
});
formatter.step({
  "line": 5,
  "name": "user navigate to login page",
  "keyword": "When "
});
formatter.step({
  "line": 6,
  "name": "enters user id and pass",
  "keyword": "And "
});
formatter.step({
  "line": 7,
  "name": "login sucessfully",
  "keyword": "Then "
});
formatter.match({
  "location": "Step_defination.user_is_on_home_page()"
});
formatter.result({
  "duration": 23575823300,
  "status": "passed"
});
formatter.match({
  "location": "Step_defination.user_navigate_to_login_page()"
});
formatter.result({
  "duration": 1195552300,
  "status": "passed"
});
formatter.match({
  "location": "Step_defination.enters_user_id_and_pass()"
});
formatter.result({
  "duration": 129820200,
  "status": "passed"
});
formatter.match({
  "location": "Step_defination.login_sucessfully()"
});
formatter.result({
  "duration": 100106900,
  "status": "passed"
});
formatter.after({
  "duration": 130000,
  "status": "passed"
});
});