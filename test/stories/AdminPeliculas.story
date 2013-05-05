Scenario: 1

Given un cine que tiene 5 peliculas
When el admin introduce una nueva
Then el cine tiene 6 peliculas

Scenario: 2

Given un cine que tiene 5 peliculas
When el admin elimina una
Then el cine tiene 4 peliculas