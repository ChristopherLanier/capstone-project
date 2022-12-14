import AppRouter from './components/app-router';
import { BrowserRouter } from 'react-router-dom';
import Header from './components/header';
import React from 'react';
import style from './style.module.scss';
import Footer from './components/footer';

//App component is like our main headquarters of control (this is our top level)
const App = () => {
  return (
    <BrowserRouter>
      <Header />
      <div className={style.page}>
        <AppRouter />
      </div>
      <Footer/>
    </BrowserRouter>
  );
}

export default App;