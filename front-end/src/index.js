import React from 'react';
import ReactDOM from 'react-dom';
import './index.css';
import App from './App';
import * as serviceWorker from './serviceWorker';

ReactDOM.render(
  <React.StrictMode>
    <App />
  </React.StrictMode>,
  document.getElementById('root')
);

// class shop extends React.Component {
//   constructor(props) {
//     super(props);
//     this.state = {
     
//     };
//   }
// };

// render(){
//   return (
//     <div className="shop">
//           <Tabs defaultActiveKey="1">
//             <TabPane tab="商城" key="1">
//              <div className={styles.tabPaneWrapper} style={{paddingBottom: 16}}>
//               商城
//              </div>
//             </TabPane>
//             <TabPane tab="订单" key="2">
//              <div className={styles.tabPaneWrapper} style={{paddingBottom: 16}}>
//                订单
//               </div>
//             </TabPane>
//             <TabPane tab="添加商品" key="3">
//              <div className={styles.tabPaneWrapper} style={{paddingBottom: 16}}>
//                添加商品
//               </div>
//             </TabPane>
//           </Tabs>
//     </div>
//   );
// }


// If you want your app to work offline and load faster, you can change
// unregister() to register() below. Note this comes with some pitfalls.
// Learn more about service workers: https://bit.ly/CRA-PWA
serviceWorker.unregister();
