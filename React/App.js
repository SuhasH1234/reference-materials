import './App.css';
import { useState } from 'react';
import Car from './Car.jsx';
import MadeRun from './MadeRun.jsx';
import MadeOut from './MadeOut.jsx';
import styled from 'styled-components';
import UseStateHook from './useState/UseStateHook.jsx';
import UseEffectHook from './useEffect/UseEffectHook.jsx';
import UseContextHook from './useContext/UseContextHook.jsx';
import UseRefHook from './useRef/UseRefHook.jsx';
import UseReducerHook from './useReducer/UseReducerHook.jsx';
import UseCallbackHook from './useCallback/UseCallbackHook.jsx';

function App() {
  const [count, setCount] = useState(0);

  const fruitsList= ['apple', 'banana', 'cherry'];

  const users=[{id: 1, name:"Suhas", age:22},
    {id: 2, name:"Preethu", age:16},
    {id: 3, name:"Shobha", age:42},
    {id: 4, name:"Hareesha", age:51},
  ]

  const btnFunc = () => {
    alert("Hello");
  }

  const btnStyles = {
    color: "red",
    fontSize: "20px"
  }

  const x=5;
  let y="Apple";
  if(x<10) {
    y="Banana";
  }

  const x2=5;

  const carDetails = {
    brand: "Ford",
    model: "Mustang",
    year: 1964,
  };

  let resultComponent;

  let isRun = 0;

  if(isRun === 1) {
    resultComponent = <MadeRun />;
  } else {
    resultComponent = <MadeOut />;
  }

  const cars1= ['BMW', 'Audi', 'Mercedes'];

  const [name, setName] = useState("");

  function handleChange(e) {
    setName(e.target.value);
  }

  function handleSubmit(e) {
    e.preventDefault();
    alert(name);
  }

  const [mytxt, setMytxt] = useState("");

  const handleChangeTxt = (e) => {
    setMytxt(e.target.value);
  }

  const [myCar, setMyCar] = useState("");

  const handleChangeCar = (e) => {
    setMyCar(e.target.value);
  }

  const [multipleInputs, setMultipleInputs] = useState({});

  const handleChangeMultiple = (e) => {
    const name = e.target.name;
    const value = e.target.value;
    setMultipleInputs(values => ({...values, [name]: value}))
  }

  const [checkboxes, setCheckboxes] = useState({});

  const handleChangeCheckboxes = (e) => {
    const name = e.target.name;
    const isChecked = e.target.checked;
    setCheckboxes(values => ({...values, [name]: isChecked}))
  };

  const [radiobox, setRadiobox] = useState("");

  const handleChangeRadiobox = (e) => {
    setRadiobox(e.target.value);
  };

  const ButtonProps = styled.button`
    background-color: ${props => props.btntype ==='primary' ? 'blue' : 'gray'}`;

  return (
    <>
    <h1>Hello World</h1>

    <button onClick={() => setCount((count) => count + 1)}>
      Count is {count}
    </button>

    <ul>
      {fruitsList.map(fruit => <li key={fruit}>{fruit}</li>)}
    </ul>

    <ul>
      {users.map(user => <li key={user}>The user id is {user.id}, name is {user.name},
         and user age is {user.age}
      </li>)}
    </ul>

    <button onClick={btnFunc}>Click Me</button>
    <h1 style={btnStyles}>Hello</h1>

    <h1>{y}</h1>

    <h1>{(x) < 10 ? "Banana" : "Apple"}</h1>
    
    <Car brand={carDetails.brand} model={carDetails.model} year={carDetails.year} />
      
    {resultComponent}

    <ul>
      {cars1.map((car, index) => <li key={index}>{car}</li>)}
    </ul>

    <form>
      <label>Enter Name:</label>
      <input type='text' value={name} onChange={handleChange} />
      <h1>Your name is: {name}</h1>
      <input type='submit' onClick={handleSubmit} />

      <label>Enter Text:</label>
      <textarea value={mytxt} onChange={handleChangeTxt} />
      <p>Current text is: {mytxt}</p>

      <select value={myCar} onChange={handleChangeCar}>
        <option value="BMW">BMW</option>
        <option value="Audi">Audi</option>
        <option value="Mercedes">Mercedes</option>
      </select>
      <p>Selected car: {myCar}</p>

      <label>First Name:</label>
      <input type='text' name='firstname' value={multipleInputs.firstname} onChange={handleChangeMultiple} />
      <label>Last Name:</label>
      <input type='text' name='lastname' value={multipleInputs.lastname} onChange={handleChangeMultiple} />
      <p>FirstName is {multipleInputs.firstname} and lastname is {multipleInputs.lastname}. Full Name: {multipleInputs.firstname + multipleInputs.lastname} </p>

      <label>Interests:</label>
      <input type='checkbox' name='football' checked={checkboxes.football || false} onChange={handleChangeCheckboxes} />Football
      <input type='checkbox' name='basketball' checked={checkboxes.basketball || false} onChange={handleChangeCheckboxes} />Basketball
      <input type='checkbox' name='tennis' checked={checkboxes.tennis || false} onChange={handleChangeCheckboxes} />Tennis
      <p>Your interests are: 
        {checkboxes.football && " Football "}
        {checkboxes.basketball && " Basketball "}
        {checkboxes.tennis && " Tennis "}
      </p>

      <label>Select your gender:</label>
      <input type='radio' name='gender' value='Male' checked={radiobox === 'Male'} onChange={handleChangeRadiobox} />Male
      <input type='radio' name='gender' value='Female' checked={radiobox === 'Female'} onChange={handleChangeRadiobox} />Female
      <input type='radio' name='gender' value='Other' checked={radiobox === 'Other'} onChange={handleChangeRadiobox} />Other
      <p>Your gender is: {radiobox}</p>

      <ButtonProps btntype="primary">Primary Button</ButtonProps>
      <ButtonProps btntype="secondary">Secondary Button</ButtonProps>
    </form>

    <UseStateHook />

    {/* <UseEffectHook /> */}

    <UseContextHook />

    <UseRefHook />

    <UseReducerHook />

    <UseCallbackHook />
  </>
  );
}

export default App;
