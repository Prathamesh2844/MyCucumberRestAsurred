Feature: Validation for bookstore data
 
Scenario: 1test Git Pocket  Guide is present in repository 
Given Hit The Bookstore API
Then validate as status code 
Then Validate Git Pocket Guide title present 
Then Validate Learning JavaScript Design Patterns title present


Scenario: 2test Git Pocket  Guide is present in response json
Given Hit The Bookstore API
Then validate as status code 
Then Validate "Git Pocket Guide" at jsonpath "books[0].title" title present 
Then Validate "Learning JavaScript Design Patterns" at jsonpath "books[1].title" title present
Then Validate "255" at jsonpath "books[1].pages" pagenumbers present