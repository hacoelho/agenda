import React from 'react';

import {Navbar, Nav} from 'react-bootstrap';
import {Link} from 'react-router-dom';

class NavigationBar extends React.Component
{
    render()
    {
        return(
            <Navbar bg="dark" variant="dark">
                <Link to={""} className="navbar-brand">
                    Agenda
                </Link>
                <Nav className="mr-auto">
                   
                    <Link to={"add"} className="nav-link" >Cadastrar Clientes</Link>
                    
                    <Link to={"list"}className="nav-link" >Lista Clientes</Link>
                </Nav>
                
            </Navbar>
            
        );
    }
}

export default NavigationBar;