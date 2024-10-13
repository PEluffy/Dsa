export function Inputbox({ handlepreChange, prefix, searchedValue }) {
  function handleprefixChange(e) {
    console.log(e.target.value);
    handlepreChange(e.target.value);
  }
  return (
    <div className="searchboxcontainer">
      <label className="searchlabel">Seach prefix: </label>
      <div className="seperatedByConcern">
        <input
          className="searchName"
          placeholder="searchname....."
          onChange={handleprefixChange}
          value={prefix}
        ></input>
        {searchedValue.length > 0 && (
          <textarea
            rows="7"
            readOnly
            value={searchedValue.map((ele, index) => ` ${ele}`).join("\n")}
          ></textarea>
        )}
      </div>
    </div>
  );
}
