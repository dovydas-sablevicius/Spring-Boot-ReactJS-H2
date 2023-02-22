import React from 'react';
import EmployeeList from './components/EmployeeList';
import EmployeeCSVUploader from './components/CSVUploader';
import './styles/table.css';
import './styles/uploader.css';


function App() {
  return (
    <div className="main">
      <h1>CSV Uploader</h1>
      <EmployeeCSVUploader/>
      <div className="employee-list-flex">
        <div className="table-header">
          <div className="single-itemH">Name</div>
          <div className="single-itemH">Email</div>
          <div className="single-itemH">Phone</div>
        </div>
        <EmployeeList />
      </div>
    </div>
  );
}

export default App;
