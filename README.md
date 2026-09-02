# FyFor Audio POO

Simple audio player system in Java practicing OOP concepts: inheritance, interfaces and polymorphism.

## 📖 Sobre o projeto

Projeto de estudo em Java aplicando **Herança**, **Polimorfismo** e **Interfaces** através de um sistema de reprodução de mídia (música e podcast).

Desenvolvido durante o curso "Java: aplicando a Orientação a Objetos" da Alura.

## 🧠 Conceitos aplicados

- **Herança**: `Musica` e `Podcast` herdam atributos e comportamentos comuns da classe `Audio`
- **Interfaces**: `Curtir` e `Reproduzir` definem contratos implementados por ambas as classes
- **Polimorfismo**: cada classe implementa `curtir()` e `reproduzir()` com seu próprio comportamento
- **Encapsulamento**: atributos privados acessados via getters e setters

## 🗂️ Estrutura

```
src/br/com/juan/fyfor/
├── modelos/
│   ├── Audio.java        # Classe base com atributos e comportamentos comuns
│   ├── Musica.java       # Herda de Audio, implementa Curtir e Reproduzir
│   ├── Podcast.java      # Herda de Audio, implementa Curtir e Reproduzir
│   ├── Curtir.java       # Interface do contrato de curtir
│   └── Reproduzir.java   # Interface do contrato de reproduzir
└── Principal.java        # Classe principal com o main()
```

## ▶️ Como executar

1. Clone o repositório:
   ```bash
   git clone https://github.com/seu-usuario/fyfor-audio-poo.git
   ```
2. Abra o projeto no IntelliJ IDEA (ou outra IDE Java de sua preferência)
3. Execute a classe `Principal.java`

## 💻 Exemplo de saída

```
Título: In Love
Artista: Mai Yamane
Álbum: Macross Plus
Gênero: Jazz
Duração: 6.36 segundos
Curtidas: 1
Total de reproduções: 1
Classificação: 1.0

-----------------------------

Título: Flow Podcast
Descrição: Flow Podcast é um podcast brasileiro
Apresentador: Monark
Duração: 120.0 segundos
Curtidas: 1
Total de reproduções: 1
Classificação: 1.0
```

## 🛠️ Tecnologias

- Java 21 (LTS)
- IntelliJ IDEA

## 👤 Autor

Desenvolvido por Juan como parte dos estudos rumo a uma carreira em desenvolvimento backend com Java.
