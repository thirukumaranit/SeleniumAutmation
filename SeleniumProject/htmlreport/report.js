$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/Features/Login.feature");
formatter.feature({
  "name": "Login feature",
  "description": "",
  "keyword": "Feature"
});
formatter.scenario({
  "name": "Login scenario",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@Thiru1"
    }
  ]
});
formatter.step({
  "name": "I am logged in to google.com",
  "keyword": "Given "
});
formatter.match({
  "location": "LoginSteps.i_am_logged_in_to_google_com()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "I am in google page.",
  "keyword": "And "
});
formatter.match({
  "location": "LoginSteps.i_am_in_google_page()"
});
formatter.result({
  "status": "passed"
});
});