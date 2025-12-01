import React, { useState } from 'react'

const UseStateHook = () => {
    //eg:1 
    const [name, setName] = useState("Suhas");

    //eg:2
    const [age, setAge] = useState();

    const handleAgeChange = (e) => {
        setAge(e.target.value);
    }

    //eg:3
    const [color, setColor] = useState("red");

  return (
    <>
        {/* eg:1 */}
        <h1>My name is: {name}</h1>

        {/* eg:2 */}
        <form>
            <label>Age</label>
            <input type='number' value={age} onChange={handleAgeChange} />
            <p>Your age is: {age}</p>
        </form>

        {/* eg:3 */}
        <h1>Color: {color}</h1>
        <button type="button" onClick={() => setColor("blue")}>Blue</button>
        <button type="button" onClick={() => setColor("red")}>red</button>
    </>
  )
}

export default UseStateHook;