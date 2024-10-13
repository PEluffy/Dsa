import { useState } from "react";
import { Inputbox } from "./Components/Inputbox";
import { InsertName } from "./Components/InsertName";

function App() {
  const userAlert = {
    color: "red",
    fontFamily: "Arial",
    margin: "5px",
    textAlign: "center",
    fontSize: "24px",
  };
  const userSecondaryAlert = {
    color: "green",
    fontFamily: "Arial",
    margin: "5px",
    textAlign: "center",
    fontSize: "18px",
  };
  async function StoreData(name) {
    const url = "http://localhost:8080/api/trie/insert";
    try {
      const response = await fetch(url, {
        method: "POST",
        headers: {
          Accept: "application/json",
          "Content-Type": "application/json",
        },
        body: JSON.stringify({ name }),
      });
      const data = await response.text();
      console.log("Success:", data);
    } catch (error) {
      console.error("Error:", error);
    }
  }
  function handleNameSubmit(name) {
    StoreData(name);
  }
  async function Getdata(prefix) {
    const url = `http://localhost:8080/api/trie/search?prefix=${prefix}`;
    try {
      const response = await fetch(url, {
        method: "GET",
        headers: {
          Accept: "application/json",
          "Content-Type": "application/json",
        },
      });
      const data = await response.text();
      console.log("Success:", data);
    } catch (error) {
      console.error("Error:", error);
    }
  }
  return (
    <div className="App">
      <div style={userAlert}>Please insert some name before searching for</div>
      <div className="container">
        <Inputbox />
        <InsertName handleNameSubmit={handleNameSubmit} />
      </div>
      <div style={userSecondaryAlert}>
        You will get the names that are on the system after you start typing
      </div>
    </div>
  );
}

export default App;
