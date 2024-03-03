
Feature: Validation of boookstore data using datatable
 
Scenario: validate data in json response with datatable
Given Hit The bookstore api
Then validate as status code 
Then validate data from response 

      | Git Pocket Guide       | books[0].title        | 
      | A Working Introduction |    books[0].subTitle  | 
      | Richard E. Silverman   |     books[0].author   | 
