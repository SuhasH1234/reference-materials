import React, { createContext, useContext, useState } from 'react'

const UseContextHook = () => {

    const UserContext= createContext();
    const [user, setUser] = useState("Suhas");

  return (
    <UserContext.Provider value={user}>
        <h1>My name is: {user}</h1>
    </UserContext.Provider>
  )
}

export default UseContextHook;