# Spring-boot-ReactJS-H2

Spring-boot-ReactJS-H2 is a full stack web application that allows users to upload a CSV file. File content will be displayed in the web application. The front-end is written in React.JS, the back-end is Spring Boot, and the database used is H2.

## Prerequisites

Before running this project, make sure you have the following software installed on your computer:

- Java 17 or higher
- npm ()

## Installation

1. Clone this repository to your local machine using `git clone https://github.com/dovydas-sablevicius/Spring-boot-ReactJS-H2.git`.
2. Navigate to the project directory using a terminal or command prompt.
3. Run `npm install` to install the required packages for the React front-end.
4. Run `mvn install` to build the Spring Boot back-end.
5. Run `java -jar target/spring-boot-reactjs-h2-0.0.1-SNAPSHOT.jar` to start the Spring Boot server.
6. In a new terminal window, navigate to the `src/main/frontend` directory and run `npm start` to start the React front-end.


1. Navigate to employeefrontend subfolder: run `cd employeefrontend`
2. Run `npm install` to install the required packages for the React front-end.
3. Run `npm start` to start the React front-end.

## Usage

Once the project is running, you can access it by navigating to `http://localhost:3000` in your web browser.

To upload a CSV file, click the "Select CSV file..." element and select the file you want to upload. Once the file has been uploaded, press the upload button and the data will be displayed in a table on the page.


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


