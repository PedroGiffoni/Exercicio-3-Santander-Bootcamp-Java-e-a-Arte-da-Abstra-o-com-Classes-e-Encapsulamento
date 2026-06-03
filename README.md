# 🐶 Sistema de Banho para Pet Shop

## 📖 Sobre o Projeto

Este projeto foi desenvolvido como parte do **Bootcamp Santander - Java e a Arte da Abstração com Classes e Encapsulamento**.

O objetivo foi simular o funcionamento de uma máquina de banho para pets, aplicando conceitos fundamentais de **Programação Orientada a Objetos (POO)**, **abstração**, **encapsulamento**, **atributos**, **métodos** e **regras de negócio**.

A aplicação controla o abastecimento da máquina, a entrada e saída dos pets, a realização dos banhos e a limpeza da máquina, respeitando todas as restrições definidas no desafio.

---

## 🎯 Objetivo do Desafio

Desenvolver um sistema capaz de controlar uma máquina de banho para pet shop, implementando operações e regras de negócio específicas.

---

## ⚙️ Funcionalidades

### 🛁 Dar Banho no Pet

Permite realizar o banho de um pet que esteja dentro da máquina.

Cada banho consome:

- 10 litros de água
- 2 litros de shampoo

Após o banho, o pet é marcado como limpo.

---

### 💧 Abastecer Água

Permite adicionar água ao reservatório da máquina.

Cada abastecimento adiciona:

```text
2 litros de água
```

---

### 🧴 Abastecer Shampoo

Permite adicionar shampoo ao reservatório.

Cada abastecimento adiciona:

```text
2 litros de shampoo
```

---

### 📊 Verificar Nível de Água

Exibe a quantidade atual de água disponível na máquina.

---

### 📊 Verificar Nível de Shampoo

Exibe a quantidade atual de shampoo disponível na máquina.

---

### 🐾 Verificar Presença de Pet

Informa se existe um pet ocupando a máquina no momento.

---

### 🐕 Colocar Pet na Máquina

Permite inserir um pet para realização do banho.

A máquina aceita apenas:

```text
1 pet por vez
```

---

### 🚪 Retirar Pet da Máquina

Permite retirar o pet da máquina.

Caso o pet seja retirado sem ter tomado banho, será necessário realizar a limpeza da máquina antes da entrada de outro pet.

---

### 🧹 Limpar Máquina

Realiza a higienização da máquina.

Cada limpeza consome:

- 3 litros de água
- 1 litro de shampoo

Após a limpeza, a máquina fica disponível para receber outro pet.

---

## 📋 Regras de Negócio Implementadas

### 🐶 Limite de Pets

A máquina permite apenas um pet por vez.

---

### 💧 Consumo de Recursos

#### Banho

```text
Água: 10 litros
Shampoo: 2 litros
```

#### Limpeza

```text
Água: 3 litros
Shampoo: 1 litro
```

---

### 📦 Capacidade Máxima dos Reservatórios

#### Água

```text
30 litros
```

#### Shampoo

```text
10 litros
```

O sistema impede que os reservatórios ultrapassem esses limites.

---

### 🚫 Restrição para Entrada de Novo Pet

Caso um pet seja removido sem tomar banho, a máquina ficará indisponível até que uma limpeza seja realizada.

---

## 🏗️ Estrutura da Aplicação

O projeto foi desenvolvido utilizando:

- Classes
- Objetos
- Métodos
- Atributos
- Encapsulamento
- Regras de negócio
- Estruturas condicionais
- Programação Orientada a Objetos (POO)

---

## 📂 Estrutura do Projeto

```text
src/
└── br/
    └── com/
        └── giffoni/
            └── pedro/
                └── exercicio3bootcampsantander/
                    ├── Exercicio3BootcampSantander.java
                    ├── Pet.java
                    └── MaquinaBanhoPet.java
```

### Classes do Projeto

#### Exercicio3BootcampSantander

Classe principal responsável por:

- Executar a aplicação
- Criar os objetos
- Realizar os testes das funcionalidades

---

#### Pet

Classe responsável por representar um pet.

Exemplo de atributos:

```java
String nome;
boolean limpo;
```

---

#### MaquinaBanhoPet

Classe responsável por controlar toda a lógica da máquina de banho.

Principais responsabilidades:

- Controlar níveis de água
- Controlar níveis de shampoo
- Receber pets
- Realizar banhos
- Controlar limpeza
- Validar regras de negócio

---

## 🔄 Fluxo Simplificado

```text
Início
   │
   ▼
Abastecer Máquina
   │
   ▼
Inserir Pet
   │
   ▼
Dar Banho
   │
   ▼
Retirar Pet
   │
   ▼
Novo Atendimento
   │
   ▼
Fim
```

---

## 🛠️ Tecnologias Utilizadas

<div align="center">

<img src="https://skillicons.dev/icons?i=java,git,github" />

</div>

### Ferramentas

- Java
- NetBeans IDE
- Git
- GitHub

---

## 📚 Conceitos Praticados

- Programação Orientada a Objetos (POO)
- Classes e Objetos
- Abstração
- Encapsulamento
- Métodos
- Atributos
- Regras de Negócio
- Estruturas Condicionais
- Validação de Dados
- Controle de Estado de Objetos
- Modelagem de Sistemas
- Simulação de Cenários Reais

---

## 🎓 Contexto Acadêmico

Projeto desenvolvido durante o **Bootcamp Santander - Java e a Arte da Abstração com Classes e Encapsulamento**, com foco na aplicação prática dos conceitos de orientação a objetos através da simulação de um sistema real de controle de banho para pet shop.

---

## 👨‍💻 Autor

<div align="center">

<a href="https://github.com/PedroGiffoni">
<img src="https://img.shields.io/badge/GitHub-181717?style=for-the-badge&logo=github&logoColor=white">
</a>

<a href="https://www.linkedin.com/in/pedrogiffoni/">
<img src="https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white">
</a>

<a href="mailto:pedrotonimelo@gmail.com">
<img src="https://img.shields.io/badge/Email-D14836?style=for-the-badge&logo=gmail&logoColor=white">
</a>

</div>

---

## ⭐ Apoie o Projeto

Se este projeto foi útil para você, considere deixar uma estrela no repositório.
