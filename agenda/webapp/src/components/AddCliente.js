import React from 'react';

import {Form, Button} from 'react-bootstrap'

class AddCliente extends React.Component 
{
    render() {
        return (
            <div>
                <h1 className="text-white">Adicionar Cliente</h1>
                <Form>
                    <Form.Group controlId="formGroupEmail">
                        <Form.Label className="text-white">Nome</Form.Label>
                        <Form.Control type="email" placeholder="Insira o nome do cliente" />
                    </Form.Group>
                    <Form.Group controlId="formGroupPassword">
                        <Form.Label className="text-white">CPF</Form.Label>
                        <Form.Control type="password" placeholder="Insira o CPF do cliente" />
                    </Form.Group>
                    <Button variant="primary" type="submit">
                        Salvar
                    </Button>
                </Form>
            </div>
        );
    }
}

export default AddCliente;