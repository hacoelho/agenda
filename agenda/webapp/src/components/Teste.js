import React from 'react';


class Teste extends React.Component {

    state = {  
        isLoading : true,
        Clientes : []
    }
 
    async componentDidMount(){
        const response=await fetch('/clientes');
        const body = await response.json();
        this.setState({Clientes : body , isLoading: false});
    }

    render() { 
        const {Clientes , isLoading} = this.state;
        if(isLoading) 
            return (<div>Carregando...</div>);
        
        return ( 
            
                <div>
                    
                    <h2 className="text-white">Lista de Clientes....</h2>
                    {
                        Clientes.map( cliente => 
                            <div className="text-white" id={cliente.id}>
                                {cliente.nome}
                                <br/>
                                {cliente.cpf}
                            </div>
                        )

                    }

                </div>
         );
    }
}
 
export default Teste;