Feature: tide webpage
Scenario: tide page navigate
 Given Launch chrome browser
 When open Url ="https://tides.com/en-us"
 Then page title shuld be "Laundry Detergent and Fabric Care Product -title"
 And close browser