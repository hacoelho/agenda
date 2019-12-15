import React from 'react';

import {Jumbotron} from 'react-bootstrap'

class Welcome extends React.Component
{
    render()
    {
        return(
            <Jumbotron className="bg-dark text-white">
              <h1>Aplicativo Agenda</h1>
              <blockquote className="blockquote mb-0">
                <p>
                    Huuur duur huuur duuurr
                </p>
                <footer className="blockquote-footer">
                    Caverna, Homem
                </footer>
              </blockquote>
            </Jumbotron>
        );
    }
}

export default Welcome;