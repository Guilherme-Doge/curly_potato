package model;

import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private String id;
    private String nome;
    private String localizacao;
    private List<Agente> agentes;
    private List<Cliente> clientes;

    public String getId() {
        return this.id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public  String getNome() {
        return this.nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getLocalizacao() {
        return this.localizacao;
    }
    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }
    public List getAgentes() {
        return this.agentes;
    }
    public List getClientes() {
        return this.clientes;
    }
    public void adicionarAgente(Agente a) {
        this.agentes.add(a);
    }
    public void adicionarCliente(Cliente c) {
        this.clientes.add(c);
    }
    public void removerAgente(String id) {
        if (!this.agentes.isEmpty()) {
            for (Agente agente : agentes) {
                if (agente.getDocumentoID().equals(id)) {
                    this.agentes.remove(agente);
                }
            }
        } else {
            System.out.println("Não há nenhum agente cadastrado");
        }
    }
    public void removerCliente(String id) {
        this.agentes.add(a);
    }

}