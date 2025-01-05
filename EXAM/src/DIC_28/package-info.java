package DIC_28;

/*
1) 
Define a user defined class, SensorData , with private attributes double temperature, double humidity. To initialize these develop one parameterised
constructor and provide setters and getters.

Take main method in SensorData class and use Function(Predefined Functional interface) to analyse the temperature, which should take a SensorData instance as a parameter and use a functional interface to return the temperature and store and display the result.
Double apply(SensorData Data).

Take one local variable double threshold  with temperature 25.0.
Define a second lambda expression using Function<Double, Boolean> type,  that takes a Double (temperature) as a parameter and returns true if the temperature is above a specified threshold (e.g., 25 degrees Celsius). Apply this function to check if the calculated temperature is above the given threshold and printf true or false as per return value.
Boolean apply(Double temperature);
*/