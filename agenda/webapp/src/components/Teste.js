import React from 'react';

import ViaCep from 'react-via-cep';

import {Form, Button} from 'react-bootstrap'


class Teste extends React.Component {

    emptyItem = {
        nome: '',
        cpf: '',
    }

    constructor(props) {
        super(props)

        this.state = {
            isLoading: false,
            Clientes: [],
            item: this.emptyItem
        }

        this.handleSubmit = this.handleSubmit.bind(this);
        this.handleChange = this.handleChange.bind(this);

    }

    async handleSubmit(event) {

        const item = this.state.item;


        await fetch(`clientes`, {
            method: 'POST',
            headers: {
                'Accept': 'application/json',
                'Content-Type': 'application/json'
            },
            body: JSON.stringify(item),
        });

        event.peventDefault();
        this.props.history.push("/clientes");
    }


    handleChange(event) {
        const target = event.target;
        const value = target.value;
        const name = target.name;
        let item = { ...this.state.item };
        item[name] = value;
        this.setState({ item });
        console.log(item);
    }




    









    render() {
        return (
            <div>
                <h1 className="text-white">Adicionar Cliente</h1>
                <Form onSubmit={this.handleSubmit}>


                    





                    
                    <Form.Group controlId="formGroupNome">
                        <Form.Label className="text-white">Nome</Form.Label>
                        <Form.Control type="nome" name="nome" id="nome" onChange={this.handleChange}  placeholder="Insira o nome do cliente" />
                    </Form.Group>
                    <Form.Group controlId="formGroupCPF">
                        <Form.Label className="text-white">CPF</Form.Label>
                        <Form.Control type="cpf" name="cpf" id="cpf" onChange={this.handleChange} placeholder="Insira o CPF do cliente" />
                    </Form.Group>

                    <Form.Group controlId="formGroupTelFixo">
                        <Form.Label className="text-white">Telefone fixo</Form.Label>
                        <Form.Control type="telfixo" name="telfixo" id="telfixo" onChange={this.handleChange} placeholder="Insira o número do telefone fixo do cliente" />
                    </Form.Group>
                    <Form.Group controlId="formGroupTelCelular">
                        <Form.Label className="text-white">Telefone celular</Form.Label>
                        <Form.Control type="telcelular" name="telcelular" id="telcelular" onChange={this.handleChange} placeholder="Insira o número do telefone celular do cliente" />
                    </Form.Group>
                    <Form.Group controlId="formGroupEmail">
                        <Form.Label className="text-white">E-Mail</Form.Label>
                        <Form.Control type="email" name="email" id="email" onChange={this.handleChange} placeholder="Insira o E-Mail do cliente" />
                    </Form.Group>

                    <Form.Group controlId="formGroupCEP">
                    <Form.Label className="text-white">CEP</Form.Label>
                    <ViaCep cep={this.state.cep} lazy>
                        {({ data, loading, error, fetch }) => {
                            if (loading) {
                                return <p className="text-white">loading...</p>
                            }
                            if (error) {
                                return <p className="text-white">error</p>
                            }
                            if (data) {
                                return <div>
                                    <p className="text-white">
                                        CEP: {data.cep} <br />
                                        CIDADE: {data.localidade} <br />
                                        UF: {data.uf} <br />
                                    </p>
                                </div>
                            }
                            return <div>
                                <input onChange={this.handleChange} value={this.state.cep} placeholder="CEP" type="text" />
                                <button onClick={fetch}>Pesquisar</button>
                            </div>
                        }}
                    </ViaCep>


                        
                        <Form.Control type="cep" name="cep" id="cep" onChange={this.handleChange} placeholder="Insira o CEP do cliente" />
                    </Form.Group>
                    <Form.Group controlId="formGroupLogradouro">
                        <Form.Label className="text-white">Logradouro</Form.Label>
                        <Form.Control type="logradouro" name="logradouro" id="logradouro" onChange={this.handleChange} placeholder="Insira o logradouro do cliente" />
                    </Form.Group>
                    <Form.Group controlId="formGroupBairro">
                        <Form.Label className="text-white">Bairro</Form.Label>
                        <Form.Control type="bairro" name="bairro" id="bairro" onChange={this.handleChange} placeholder="Insira o bairro do cliente" />
                    </Form.Group>
                    <Form.Group controlId="formGroupCidade">
                        <Form.Label className="text-white">Cidade</Form.Label>
                        <Form.Control type="cidade" name="cidade" id="cidade" onChange={this.handleChange} placeholder="Insira a cidade do cliente" />
                    </Form.Group>
                    <Form.Group controlId="formGroupUF">
                        <Form.Label className="text-white">UF</Form.Label>
                        <Form.Control type="uf" name="uf" id="uf" onChange={this.handleChange} placeholder="Insira a UF do cliente" />
                    </Form.Group>
                    <Form.Group>
                        {/* <Button variant="primary" type="submit">
                            Salvar
                        </Button> */}
                    </Form.Group>
                </Form>
            </div>
        );
    }
}
 
export default Teste;