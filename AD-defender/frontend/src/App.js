// import React,{useReducer, useRef, useCallback} from 'react';
import React, {useEffect, useState} from 'react';
import {Route, Routes} from 'react-router-dom';
import Main from '../src/pages/Main'
import ResultPage from './pages/ResultPage'
import AboutUs from './pages/aboutus';
import Bi from './pages/bi';

const App =()=> {

  return (
    <div className='App'>
      <Routes>
        <Route path="/" element={<Main/>}/>
        <Route path="/result" element={<ResultPage/>}/>
        <Route path="/bi" element={<Bi/>}/>
        <Route path="/aboutus" element={<AboutUs/>}/>
      </Routes>
    </div>
  )
}
export default App;