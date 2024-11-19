CREATE TABLE employee (
    id INT AUTO_INCREMENT PRIMARY KEY,
    employeeId VARCHAR(15) UNIQUE NOT NULL,
    firstName VARCHAR(255) NOT NULL,
    lastName VARCHAR(255) NOT NULL,
    email VARCHAR(255) UNIQUE NOT NULL,
    doj VARCHAR(100) NOT NULL,
    salary DOUBLE NOT NULL DEFAULT 0.0 
);

CREATE TABLE phone_numbers (
    id INT AUTO_INCREMENT PRIMARY KEY,
    employeeId VARCHAR(15) NOT NULL,
    phoneNumber VARCHAR(20) NOT NULL,
    FOREIGN KEY (employeeId) REFERENCES employee(employeeId) ON DELETE CASCADE
);