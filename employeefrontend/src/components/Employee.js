import React from 'react';

const Employee = ({ employee }) => {
  return (
    <div className='single-employee-grid'>
      <div className="single-item">{employee.first_name} {employee.last_name}</div>
      <div className="single-item">{employee.email}</div>
      <div className="single-item">{employee.phone_number}</div>
    </div>
  );
};

export default Employee;
