$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/MONU KUMAR/eclipse-workspace/cucumber/src/main/java/feature/dealsMap.feature");
formatter.feature({
  "line": 1,
  "name": "Deals Map",
  "description": "",
  "id": "deals-map",
  "keyword": "Feature"
});
formatter.scenario({
  "line": 3,
  "name": "Create deals using maps in data table",
  "description": "",
  "id": "deals-map;create-deals-using-maps-in-data-table",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 5,
  "name": "User is already on login page",
  "keyword": "Given "
});
formatter.step({
  "line": 6,
  "name": "title of login page is Free CRM",
  "keyword": "When "
});
formatter.step({
  "line": 7,
  "name": "User enters username and password",
  "rows": [
    {
      "cells": [
        "username",
        "password"
      ],
      "line": 8
    },
    {
      "cells": [
        "kumarmon",
        "Kumar@2108"
      ],
      "line": 9
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 10,
  "name": "User clicks on login button",
  "keyword": "Then "
});
formatter.step({
  "line": 11,
  "name": "User is on HomePage",
  "keyword": "Then "
});
formatter.step({
  "line": 12,
  "name": "User moves to new deals page",
  "keyword": "Then "
});
formatter.step({
  "line": 13,
  "name": "User enters deals data",
  "rows": [
    {
      "cells": [
        "title",
        "amount",
        "probability",
        "commission"
      ],
      "line": 14
    },
    {
      "cells": [
        "test deal1",
        "1000",
        "50",
        "10"
      ],
      "line": 15
    },
    {
      "cells": [
        "test deal2",
        "2000",
        "60",
        "20"
      ],
      "line": 16
    },
    {
      "cells": [
        "test deal3",
        "3000",
        "70",
        "30"
      ],
      "line": 17
    }
  ],
  "keyword": "Then "
});
formatter.step({
  "line": 18,
  "name": "close the browser",
  "keyword": "Then "
});
formatter.match({
  "location": "DealsMapStepDefinition.user_is_on_login_page()"
});
formatter.result({
  "duration": 10355697108,
  "status": "passed"
});
formatter.match({
  "location": "DealsMapStepDefinition.title_Login_Page_FreeCRM()"
});
formatter.result({
  "duration": 15446467,
  "status": "passed"
});
formatter.match({
  "location": "DealsMapStepDefinition.user_enters_username_and_password(DataTable)"
});
formatter.result({
  "duration": 245842419,
  "status": "passed"
});
formatter.match({
  "location": "DealsMapStepDefinition.user_clicks_on_login_button()"
});
formatter.result({
  "duration": 8265662503,
  "status": "passed"
});
formatter.match({
  "location": "DealsMapStepDefinition.user_is_On_HomePage()"
});
formatter.result({
  "duration": 7621402,
  "status": "passed"
});
formatter.match({
  "location": "DealsMapStepDefinition.user_moves_to_new_contact_page()"
});
formatter.result({
  "duration": 2219725876,
  "status": "passed"
});
formatter.match({
  "location": "DealsMapStepDefinition.user_enters_deals_data(DataTable)"
});
formatter.result({
  "duration": 12888439783,
  "status": "passed"
});
formatter.match({
  "location": "DealsMapStepDefinition.close_the_browser()"
});
formatter.result({
  "duration": 749653120,
  "status": "passed"
});
});