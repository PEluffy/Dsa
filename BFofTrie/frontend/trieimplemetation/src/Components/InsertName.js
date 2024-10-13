import { useRef } from "react";

export function InsertName({ handleNameSubmit }) {
  const name = useRef("");

  const handleClick = (e) => {
    e.preventDefault();
    if (name.current.value === "") {
      return;
    }
    handleNameSubmit(name.current.value);
  };
  return (
    <div className="insertboxcontainer">
      <form>
        <label className="searchlabel">Insert name: </label>
        <input className="name" placeholder="name...." ref={name}></input>
        <button type="submit" className="insert" onClick={handleClick}>
          Insert
        </button>
      </form>
    </div>
  );
}
