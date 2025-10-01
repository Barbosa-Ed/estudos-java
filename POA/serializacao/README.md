# Serialização em Java

Este projeto demonstra o processo de **serialização** e **desserialização** de objetos em Java utilizando as classes `ObjectOutputStream` e `ObjectInputStream`.

## 📁 Estrutura

serializacao/  
├── Estudante.java  
├── Serializacao.java  
└── serializado/  
&nbsp; &nbsp; └── estudante.ser (gerado após a execução)


## 📄 Descrição dos Arquivos

- **Estudante.java**  
  Define a classe `Estudante`, que implementa `Serializable`. Inclui atributos como `nome`, `matricula`, `curso` e `senha`.  
  Obs: O campo `senha` é marcado como `transient`, então **não é serializado**.

- **Serializacao.java**  
  Contém a classe com o método `main`, responsável por:
  - Criar uma instância de `Estudante`;
  - Serializar esse objeto em um arquivo `.ser`;
  - Desserializar o objeto do arquivo e exibir seu conteúdo no console.

## 💡 O que é Serialização?

Serialização é o processo de transformar um objeto em uma sequência de bytes para que ele possa ser salvo em um arquivo ou transmitido pela rede.  
A desserialização é o processo reverso: reconstruir o objeto original a partir desses bytes.

## 🚀 Como Executar

1. Compile os arquivos Java:

   ```bash
   javac serializacao/*.java

2. Execute a classe principal:

java serializacao.Serializacao


3. Saída esperada no console:
```
Foi!
O objeto desserializado: Estudante [nome=Ed, matricula=2310470, curso=ADS, senha=null]
```

Note que a senha aparece como null, pois foi marcada como transient e não é armazenada durante a serialização.

## ✅ Requisitos

Java 8 ou superior

Terminal ou IDE de sua preferência (ex: IntelliJ, Eclipse, VS Code)

## 🧠 Observações

A pasta serializado/ será criada automaticamente (se não existir) no mesmo diretório do projeto.

O arquivo estudante.ser é o arquivo serializado que contém os dados do objeto.

Feito para fins de aprendizado sobre manipulação de arquivos e persistência de objetos em Java.