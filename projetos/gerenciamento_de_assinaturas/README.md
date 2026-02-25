# Gerenciamento de Assinaturas 🖥️
Este projeto é um sistema simples de gerenciamento de assinaturas desenvolvido em Java com foco na aplicação de conceitos de Programação Orientada a Objetos (POO).

O sistema permite controlar clientes, planos e o ciclo de vida de uma assinatura, garantindo que as regras de negócio sejam respeitadas.

---

## Funcionalidades ✅

- Criação de assinatura vinculada a cliente ativo
- Impedimento de criação de assinatura para cliente inativo
- Cancelamento de assinatura
- Reativação de assinatura com validação de regras

---

## Regras de Negócio Implementadas 🧠

- Uma assinatura só pode ser criada para clientes ativos.
- Não é possível reativar uma assinatura se o cliente estiver inativo.
- Não é possível cancelar uma assinatura já cancelada.
- A data de início da assinatura é registrada automaticamente no momento da criação ou reativação.

---

## Estrutura do Projeto 🏗️
- O sistema é composto pelas seguintes entidades principais:
  - Cliente
  - Plano
  - Assinatura
#### Cada entidade é responsável por suas próprias validações e controle de estado, seguindo princípios de encapsulamento.
