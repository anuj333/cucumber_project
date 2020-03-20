Feature: Cucumber testing
@smoke @reg
Scenario: Testing parameterization
Given print without data
Then print with data
|first name|last name|
|anuj|singh|
|anuj|kumar|
