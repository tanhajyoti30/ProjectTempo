$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("APIStoreTanha.feature");
formatter.feature({
  "line": 2,
  "name": "Store API Testing",
  "description": "",
  "id": "store-api-testing",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    },
    {
      "line": 1,
      "name": "@api"
    }
  ]
});
formatter.before({
  "duration": 9694253375,
  "status": "passed"
});
formatter.scenario({
  "line": 4,
  "name": "Store CRUD API",
  "description": "",
  "id": "store-api-testing;store-crud-api",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Create Store",
  "keyword": "Given "
});
formatter.step({
  "line": 8,
  "name": "Get Store",
  "keyword": "Then "
});
formatter.match({
  "location": "StoreApiTanhaSteps.create_Store()"
});
formatter.result({
  "duration": 2836257084,
  "status": "passed"
});
formatter.match({
  "location": "StoreApiTanhaSteps.get_Store()"
});
formatter.result({
  "duration": 199724375,
  "status": "passed"
});
formatter.after({
  "duration": 740118250,
  "status": "passed"
});
formatter.uri("DollarTreeTanha.feature");
formatter.feature({
  "line": 2,
  "name": "DollarTree Toys and Office Mousehover",
  "description": "",
  "id": "dollartree-toys-and-office-mousehover",
  "keyword": "Feature",
  "tags": [
    {
      "line": 1,
      "name": "@regression"
    }
  ]
});
formatter.before({
  "duration": 6942653541,
  "status": "passed"
});
formatter.scenario({
  "line": 5,
  "name": "DollarTree Toys Mousehover",
  "description": "",
  "id": "dollartree-toys-and-office-mousehover;dollartree-toys-mousehover",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 6,
  "name": "Open DollarTree Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 7,
  "name": "Mouse Hover to Toys \u0026 Crafts",
  "keyword": "When "
});
formatter.step({
  "line": 8,
  "name": "Click on See all toys",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.open_DollarTree_Homepage()"
});
formatter.result({
  "duration": 51944042,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.mouse_Hover_to_Toys_Crafts()"
});
formatter.result({
  "duration": 64085872292,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.click_on_See_all_toys()"
});
formatter.result({
  "duration": 37539712959,
  "status": "passed"
});
formatter.after({
  "duration": 1028317416,
  "status": "passed"
});
formatter.before({
  "duration": 7369443417,
  "status": "passed"
});
formatter.scenario({
  "line": 10,
  "name": "DollarTree Home and Office Mousehover",
  "description": "",
  "id": "dollartree-toys-and-office-mousehover;dollartree-home-and-office-mousehover",
  "type": "scenario",
  "keyword": "Scenario"
});
formatter.step({
  "line": 11,
  "name": "Open DollarTree Homepage",
  "keyword": "Given "
});
formatter.step({
  "line": 12,
  "name": "Mouse Hover to Home \u0026 Office",
  "keyword": "When "
});
formatter.step({
  "line": 13,
  "name": "Click on HOUSEHOLD \u0026 PET SUPPLIES",
  "keyword": "Then "
});
formatter.match({
  "location": "HomePageSteps.open_DollarTree_Homepage()"
});
formatter.result({
  "duration": 10579791,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.mouse_Hover_to_Home_Office()"
});
formatter.result({
  "duration": 65746903709,
  "status": "passed"
});
formatter.match({
  "location": "HomePageSteps.click_on_HOUSEHOLD_PET_SUPPLIES()"
});
formatter.result({
  "duration": 49765356750,
  "status": "passed"
});
formatter.after({
  "duration": 735115917,
  "status": "passed"
});
});