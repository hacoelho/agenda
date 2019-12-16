import React from 'react';
import './App.css';

import {Container, Row, Col} from 'react-bootstrap'
import {BrowserRouter as Router, Switch, Route} from 'react-router-dom';

import NavigationBar from './components/NavigationBar'
import Home from './components/Home'
import Footer from './components/Footer'
import AddCliente from './components/AddCliente';
import ListaCliente from './components/ListaCliente';
import VisualizarCliente from './components/VisualizarCliente';
import Teste from './components/Teste'

function App() {
  const marginTop = {
    marginTop:"20px"
  }

  return(
    <Router>
      <NavigationBar />
      <Container>
        <Row>
          <Col lg={12} style={marginTop}>

            <Switch>
              <Route path="/" exact component={Home}/>
              <Route path="/add" exact component={AddCliente}/>
              <Route path="/list" exact component={ListaCliente}/>
              <Route path="/visualizar" exact component={VisualizarCliente}/>
              <Route path="/teste" exact component={Teste}/>
            </Switch>

          </Col>
        </Row>
      </Container>
      <br/>
      <Footer/>
    </Router>
  );
}

export default App;
