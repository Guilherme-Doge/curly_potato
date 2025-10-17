package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Agencia {
    private String id;
    private String nome;
    private String localizacao;
    private List<Agente> agentes;
    private List<Cliente> clientes;

    public Agencia(Builder builder) {
        this.id = builder.id;
        this.nome = builder.nome;
        this.localizacao = builder.localizacao;
        this.agentes = builder.agentes;
        this.clientes = builder.clientes;
    }

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
            for (Agente agente : this.agentes) {
                if (agente.getDocumentoID().equals(id)) {
                    this.agentes.remove(agente);
                }
            }
        } else {
            System.out.println("Não há nenhum agente cadastrado");
        }
    }

    public void removerCliente(String id) {
        if (!this.clientes.isEmpty()) {
            for (Cliente cliente : this.clientes) {
                if (cliente.getDocumentoID().equals(id)) {
                    this.clientes.remove(cliente);
                }
            }
        } else {
            System.out.println("Não há nenhum agente cadastrado");
        }
    }

//==================================================================\\ CLASSE BUILDER

    public static class Builder {
        private String id;
        private String nome;
        private String localizacao;
        private List<Agente> agentes;
        private List<Cliente> clientes;

        public Agencia.Builder id(String id) {
            this.id = id;
            return this;
        }

        public Agencia.Builder nome(String nome) {
            this.nome = nome;
            return this;
        }

        public Agencia.Builder localizacao(String localizacao) {
            this.localizacao = localizacao;
            return this;
        }

        public Agencia.Builder agentes(List<Agente> agentes) {
            this.agentes = agentes;
            return this;
        }

        public Agencia.Builder clientes(List<Cliente> clientes) {
            this.agentes = agentes;
            return this;
        }

        public Agencia build() {
            return new Agencia(this);
        }
    }
}