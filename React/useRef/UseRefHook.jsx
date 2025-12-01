import React, { useRef, useEffect, useState } from 'react'

const UseRefHook = () => {

    const [inputValue, setInputValue] = useState("");
    const count= useRef(0);

    useEffect(() => {
        count.current = count.current + 1;
    });

  return (
    <>
        <p>Type</p>
        <input type='text' value={inputValue} onChange={(e) => setInputValue(e.target.value)} />
        <h1>Render Count: {count.current}</h1>
    </>
    
  )
}

export default UseRefHook;