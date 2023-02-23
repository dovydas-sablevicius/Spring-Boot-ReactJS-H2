# Spring-boot-ReactJS-H2

Spring-boot-ReactJS-H2 is a full stack web application that allows users to upload a CSV file with employee data and display its content in the web application. The front-end is written in React.JS, the back-end is Spring Boot, and the database used is H2.

## Prerequisites

Before running this project, make sure you have the following software installed on your computer:

- Java 17 or higher
- npm (Node.js)

## Set up
1. Clone this repository to your local machine using:
 `git clone https://github.com/dovydas-sablevicius/Spring-boot-ReactJS-H2.git`
 

**-Back-end**

1. Open command prompt.
2. Navigate to the project directory (Spring-boot-ReactJS-H2).
2. Run: `java -jar employeemanager/target/employeemanager-0.0.1-SNAPSHOT.jar` to build the Spring Boot back-end.

**-Front-end**

1. Open command prompt.
2. Navigate to the project directory (Spring-boot-ReactJS-H2).
3. Run `cd employeefrontend` to navigate to employeefrontend subfolder
4. Run `npm install` to install the required packages for the React front-end.
5. Run `npm start` to start the React front-end.

## Usage

Once the project is running, you can access it by navigating to `http://localhost:3000` in your web browser.

To upload a CSV file, click the "Select a CSV file..." element and select the file you want to upload. Once the file has been uploaded, press the upload button and the data will be displayed in a table on the page.

## CSV file structure

The expected format of the CSV file is as follows:

- Header format: `first_name,last_name,email,phone_number`
- Data format: Each row of the CSV file should contain four fields, separated by commas, in the following order: first name, last name, email, phone number.

Example CSV file:

```
first_name,last_name,email,phone_number
John,Doe,john.doe@example.com,144-555-1234
Jane,Doe,jane.doe@example.com,147-555-5678
Bob,Smith,bob.smith@example.com,151-555-9012
```

## Connecting to the H2 database

1. Open a web browser and navigate to the URL `http://localhost:8082/h2-console/`.

2. In the H2 login page, enter the following values:

   - **JDBC URL:** `jdbc:h2:mem:employeesdb`
   - **User name:** `sa`
   - **Password:** (leave this field blank)

3. Click the **Connect** button to log in to the H2 database.

## Testing the API

You can test the API using the following endpoints:

- `POST localhost:8082/employee/add`: Use this endpoint to send raw data.
```
    "first_name": "John",
    "last_name": "Doe",
    "email": "john.doe@example.com",
    "phone_number": "+37068930490"
```
- `POST localhost:8082/employee/upload` with key: `file`.  Use to add data with CSV.

- `GET localhost:8082/employee/getAll`: Use this endpoint to retrieve all data.


## Visual representation
![csvUploaderv2](https://user-images.githubusercontent.com/55896286/220806664-0c1d565f-98d3-4936-8cf6-a1734c2628b6.jpg)



