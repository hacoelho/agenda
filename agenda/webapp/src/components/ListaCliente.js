import React from 'react';

import { Table,Container,Button} from 'react-bootstrap';

class ListaCliente extends React.Component 
{
   
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

        let rows =
            Clientes.map(cliente =>
                <tr key={cliente.id}>
                    <td className="text-white">{cliente.cpf}</td>
                    <td className="text-white">{cliente.nome}</td>
                    <td className="text-white">{cliente.cidade}</td>
                    <td className="text-white">{cliente.uf}</td>
                    <td><Button size="sm" color="green">Visualizar</Button></td>
                </tr>
            )

        
        if(isLoading) 
            return (<div>Carregando...</div>);
        
        return ( 
            
            <div>
                <Container>
                    <h3 className="text-white">Lista de Clientes</h3>
                    <Table className="mt-4">
                        <thead>
                            <tr>
                                <th className="text-white">CPF</th>
                                <th className="text-white">Nome</th>
                                <th className="text-white">Cidade</th>
                                <th className="text-white">UF</th>
                                <th className="text-white">Ações</th>
                            </tr>
                        </thead>
                        <tbody>
                            {rows}
                        </tbody>

                    </Table>
                </Container>
            </div>
         );
    }
}

export default ListaCliente;