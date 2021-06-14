$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("signin.feature");
formatter.feature({
  "line": 1,
  "name": "Testing of elearning portal",
  "description": "",
  "id": "testing-of-elearning-portal",
  "keyword": "Feature"
});
formatter.scenarioOutline({
  "line": 4,
  "name": "Register to elearning portal",
  "description": "",
  "id": "testing-of-elearning-portal;register-to-elearning-portal",
  "type": "scenario_outline",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@register"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I have opened the elearning page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Enter the \"\u003cFirstname\u003e\" \"\u003cLastname\u003e\" \"\u003cEmail\u003e\" \"\u003cUsername\u003e\" \"\u003cPassword1\u003e\" \"\u003cPassword2\u003e\"",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Register is successful",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Goto Inbox",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Send Email",
  "keyword": "And "
});
formatter.examples({
  "line": 11,
  "name": "",
  "description": "",
  "id": "testing-of-elearning-portal;register-to-elearning-portal;",
  "rows": [
    {
      "cells": [
        "Firstname",
        "Lastname",
        "Email",
        "Username",
        "Password1",
        "Password2"
      ],
      "line": 12,
      "id": "testing-of-elearning-portal;register-to-elearning-portal;;1"
    },
    {
      "cells": [
        "Arifa",
        "Khatoon",
        "test3@test.com",
        "Arifa_ibmn",
        "Arifa_ibm",
        "Arifa_ibm"
      ],
      "line": 13,
      "id": "testing-of-elearning-portal;register-to-elearning-portal;;2"
    }
  ],
  "keyword": "Examples"
});
formatter.before({
  "duration": 2309616300,
  "status": "passed"
});
formatter.scenario({
  "line": 13,
  "name": "Register to elearning portal",
  "description": "",
  "id": "testing-of-elearning-portal;register-to-elearning-portal;;2",
  "type": "scenario",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "line": 3,
      "name": "@register"
    }
  ]
});
formatter.step({
  "line": 5,
  "name": "I have opened the elearning page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "Enter the \"Arifa\" \"Khatoon\" \"test3@test.com\" \"Arifa_ibmn\" \"Arifa_ibm\" \"Arifa_ibm\"",
  "matchedColumns": [
    0,
    1,
    2,
    3,
    4,
    5
  ],
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "Register is successful",
  "keyword": "Then "
});
formatter.step({
  "line": 8,
  "name": "Goto Inbox",
  "keyword": "And "
});
formatter.step({
  "line": 9,
  "name": "Send Email",
  "keyword": "And "
});
formatter.match({
  "location": "stepDefinition.i_have_opened_the_elearning_page()"
});
formatter.result({
  "duration": 7253252500,
  "status": "passed"
});
formatter.match({
  "arguments": [
    {
      "val": "Arifa",
      "offset": 11
    },
    {
      "val": "Khatoon",
      "offset": 19
    },
    {
      "val": "test3@test.com",
      "offset": 29
    },
    {
      "val": "Arifa_ibmn",
      "offset": 46
    },
    {
      "val": "Arifa_ibm",
      "offset": 59
    },
    {
      "val": "Arifa_ibm",
      "offset": 71
    }
  ],
  "location": "stepDefinition.enter_the(String,String,String,String,String,String)"
});
formatter.result({
  "duration": 12953754199,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.register_is_successful()"
});
formatter.result({
  "duration": 114600,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.goto_Inbox()"
});
formatter.result({
  "duration": 11353512600,
  "status": "passed"
});
formatter.match({
  "location": "stepDefinition.send_Email()"
});
formatter.result({
  "duration": 18126064800,
  "status": "passed"
});
formatter.after({
  "duration": 14300,
  "status": "passed"
});
});