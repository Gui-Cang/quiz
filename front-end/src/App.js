import React from 'react';
import './App.css';
import mallLink from './component/mallLink';

function App() {
  return (
    <div className="App">
      <header className="App-header">
      <mallLink/>
      <a className="mall"
        href="https://www.baidu.com/"
        target="_blank"
        rel="noopener noreferrer">
        商城
      </a>
      <a className="order"
        href="https://www.baidu.com/"
        target="_blank"
        rel="noopener noreferrer">
        订单
      </a>
      <a className="addGoods"
        href="https://www.baidu.com/"
        target="_blank"
        rel="noopener noreferrer">
        添加商品
      </a>
      </header>    
      <product/>
      <end/> 
    </div>
  );
}

export default App;
