import React, { useState, useCallback } from 'react';


const Button = React.memo(({ onClick, text }) => {
  console.log(`Rendering button - ${text}`);
  return <button onClick={onClick}>{text}</button>;
});

const UseCallbackHook = () => {
  const [count1, setCount1] = useState(0);
  const [count2, setCount2] = useState(0);

  const handleClick1 = useCallback(() => {
    setCount1(prevCount => prevCount + 1);
  }, []);

  const handleClick2 = useCallback(() => {
    setCount2(prevCount => prevCount + 1);
  }, []);

  console.log("Rendering parent component");

  return (
    <div>
      <h1>useCallback Example</h1>
      <p>Count 1: {count1}</p>
      <p>Count 2: {count2}</p>

      <Button onClick={handleClick1} text="Increment Count 1" />
      <Button onClick={handleClick2} text="Increment Count 2" />
    </div>
  );
};

export default UseCallbackHook;