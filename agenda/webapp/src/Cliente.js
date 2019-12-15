import React, { Component } from 'react';

class Cliente extends Component
{
    state =
    {
        isLoading  : true,
        Categories : []
    }

    
    async componentDidMount()
    {
        const response=await fetch('/api/clientes');
        const body = await response.json();
        this.setState({Clientes :body , isLoading: false});
    }

    render()
    {
        const {Clientes , isLoading} = this.state;
        if(isLoading)
            return(<div>Carregando...</div>)
        
        return(
            <div>
                <h2>Clientes</h2>
                {
                    Clientes.map( cliente =>
                        <div id = {cliente.id}>
                            {cliente.name}
                        </div>
                    )
                }
            </div>
        );
    }
}

export default Cliente