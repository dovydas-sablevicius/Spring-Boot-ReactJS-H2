import React, { useEffect, useState } from 'react';
import Employee from './Employee';

const EmployeeList = () => {
  const [employees, setEmployees] = useState([]);

  useEffect(() => {
    fetch('http://localhost:8082/employee/getAll')
      .then(response => response.json())
      .then(data => setEmployees(data));
  }, [employees]);

  return (
    <div>
      {employees.map(employee => (
        <Employee key={employee.id} employee={employee} />
      ))}
    </div>
  );
};

export default EmployeeList;
