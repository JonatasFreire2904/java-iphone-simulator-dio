# 📱 Java iPhone Simulator DIO

Este projeto é uma modelagem e implementação de um componente iPhone usando Programação Orientada a Objetos (POO) em Java. O iPhone simulado possui funcionalidades de um Reprodutor Musical, Aparelho Telefônico e Navegador na Internet.

## 📂 Estrutura de Pacotes

- `com.iphone`: Contém a classe principal `IPhone` que implementa todas as funcionalidades.
- `com.iphone.interfaces`: Contém as interfaces que definem as funcionalidades do iPhone (`IReprodutorMusical`, `IAparelhoTelefonico`, `INavegadorInternet`).

## 🛠 Funcionalidades

### Reprodutor Musical
- `tocar()`: Inicia a reprodução de música.
- `pausar()`: Pausa a música em reprodução.
- `selecionarMusica(String musica)`: Seleciona uma música para tocar.

### Aparelho Telefônico
- `ligar(String numero)`: Faz uma chamada para o número especificado.
- `atender()`: Atende uma chamada.
- `iniciarCorreioVoz()`: Inicia o correio de voz.

### Navegador na Internet
- `exibirPagina(String url)`: Exibe uma página da web com a URL especificada.
- `adicionarNovaAba()`: Adiciona uma nova aba no navegador.
- `atualizarPagina()`: Atualiza a página atual.

## 📋 Diagrama UML

O diagrama UML a seguir representa a estrutura de classes e interfaces do projeto:

![mermaid-diagram-2024-05-20-183656](https://github.com/JonatasFreire2904/java-iphone-simulator-dio/assets/143660105/3b1c19d5-eb92-487b-861a-4ad74c83a5be)

