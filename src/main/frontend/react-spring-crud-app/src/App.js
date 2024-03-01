import './App.css';
import '../node_modules/bootstrap/dist/css/bootstrap.min.css';
import Navbar from './layout/Navbar';
import Home from './pages/Home';
import AddUser from "./users/AddUser";
import { BrowserRouter as Router, Routes, Route } from 'react-router-dom';
import DisplayUser from './users/DisplayUser';
import UpdateUser from './users/UpdateUser';
import AboutPage from './pages/About';


function App() {
  return (
    <div className="App">
      <Router>
        <Navbar/>
        <Routes>
          <Route exact path='/' element={<Home />}></Route>
          <Route exact path='/adduser' element={<AddUser />}></Route>
          <Route exact path='/viewuser/:id' element={<DisplayUser />}></Route>
          <Route exact path='/updateuser/:id' element={<UpdateUser />}></Route>
          <Route exact path='/about' element={<AboutPage />}></Route>
        </Routes>
      </Router>
      
    </div>
  );
}

export default App;
