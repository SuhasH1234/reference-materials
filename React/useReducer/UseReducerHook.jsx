import React from 'react'
import { useReducer } from 'react';

const UseReducerHook = () => {

    const initialScore= [{id:1, score:10, name:"Suhas"}, {id:2, score:20, name:"Ngk"}];

    const reducer= (state, action) => {
        switch(action.type) {
            case 'INCREMENT':
                return state.map((player) => {
                    if(player.id === action.id) {
                        return {...player, score: player.score + 1};
                    }
                    return player;
                });
                default:
                    return state;
        }   };

        const [score, dispatch]= useReducer(reducer, initialScore);

        const handleIncrease = (player) => {
            dispatch({type: 'INCREMENT', id: player.id});   
        };

  return (
    <>
        {score.map((player) => (
            <div key={player.id}>
                <h1>{player.name}: {player.score}</h1>
            </div>
        ))}
        {score.map((player) => (
            <button key={player.id} onClick={() => handleIncrease(player)}>Increase {player.name}'s score</button>
        ))}
    </>
  )
}

export default UseReducerHook;