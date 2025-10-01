# Projeto com Threads em Java

Este projeto é uma réplica de um exercício passado em aula sobre o uso de **threads** em Java. O objetivo é mostrar como criar e executar múltiplas threads usando tanto a extensão da classe `Thread` quanto a implementação da interface `Runnable`.

## 📁 Estrutura do Projeto

projetoThread/  
└── src/  
&nbsp; &nbsp; └── exemplo/  
&nbsp; &nbsp; &nbsp; &nbsp; ├── App.java  
&nbsp; &nbsp; &nbsp; &nbsp; ├── ThreadE.java  
&nbsp; &nbsp; &nbsp; &nbsp; └── ThreadI.java  


## 📄 Descrição dos Arquivos

- **App.java**  
  Classe principal que inicializa e executa as threads. Atualmente, apenas duas instâncias de `ThreadE` são iniciadas. O código também possui exemplos comentados de como utilizar `ThreadI`.

- **ThreadE.java**  
  Uma classe que estende `Thread`. Quando executada, exibe uma janela de mensagem (`JOptionPane`) com o texto "Bu!" em posições aleatórias da tela. Cada thread cria 5 janelas com um pequeno atraso entre elas.

- **ThreadI.java**  
  Implementa a interface `Runnable`. Imprime uma mensagem personalizada no console com um tempo de pausa entre as repetições. Embora esteja no projeto, o uso dessa classe está comentado no `App.java`, mas pode ser facilmente ativado.

## 💡 Conceitos Demonstrados

- Criação de threads com `extends Thread`
- Criação de threads com `implements Runnable`
- Uso de `Thread.sleep()` para simular pausa entre execuções
- Criação de múltiplas janelas com `JOptionPane` em locais aleatórios

## 🚀 Como Executar

1. Compile os arquivos:

   ```bash
   javac projetoThread/exemplo/*.java

2. Execute a aplicação:

java projetoThread.exemplo.App

3. Saída esperada:

Serão abertas janelas com a mensagem "Bu!" aparecendo em locais aleatórios da tela.

Se descomentar o trecho de ThreadI no App.java, verá também mensagens no console sendo impressas por diferentes threads.

## 🛠️ Dica

Para testar os dois modos de criação de threads, altere o App.java:

```ThreadI t3 = new ThreadI("TI", 10);  
ThreadI t4 = new ThreadI("Thread", 10);  
Thread t3e = new Thread(t3);  
Thread t4e = new Thread(t4);

t3e.start();  
t4e.start();
```

## ✅ Requisitos

Java 8 ou superior

Sistema com interface gráfica (requerida pelo JOptionPane)

IDE ou terminal para compilação e execução

### 📘 Este projeto foi desenvolvido com fins educacionais para ilustrar o funcionamento de threads em Java, com foco na manipulação de múltiplas execuções concorrentes e elementos gráficos.