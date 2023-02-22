import React, { useState } from "react";

function EmployeeCSVUploader() {
  const [file, setFile] = useState(null);

  // Handles file selection
  const handleFileChange = (event) => {
    setFile(event.target.files[0]);
  };

  // Handles file upload
  const handleFileUpload = async () => {
    const formData = new FormData();
    formData.append("file", file);
    try {
      const response = await fetch("http://localhost:8082/employee/upload", {
        method: "POST",
        body: formData,
      });
      if (response.ok) {
        console.log("File uploaded successfully.");
      } else {
        console.log("Failed to upload file.");
      }
    } catch (error) {
      console.error("Error uploading file: ", error);
    }
  };

  return (
    <div className="csv-uploader-flex">
      <label htmlFor="csv-upload" className="custom-file-upload">Select a CSV file...</label>
      <input type="file" id="csv-upload" accept=".csv" onChange={handleFileChange} />
      <button className="upload-button" onClick={handleFileUpload} disabled={!file}>
        Upload
      </button>
    </div>
  );
}

export default EmployeeCSVUploader;