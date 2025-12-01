import React from 'react'

const Car = (props) => {

  return (
    <>
        <h1>The Car brand is {props.brand} and model is {props.model}
            and year is {props.year}
        </h1>
    </>
  );
};

export default Car
