# Agenda Telefônica em Java

Este projeto implementa uma **agenda simples** utilizando manipulação de arquivos em Java. Ele permite **registrar contatos** com nome e telefone em um arquivo `.txt` e **consultar** os dados posteriormente.

## 📄 Arquivo Principal

- **Agenda.java**  
  Contém todos os métodos para:
  - Criar o diretório onde a agenda será salva;
  - Escrever novos contatos no arquivo;
  - Ler todos os contatos salvos;
  - Pesquisar um contato específico pelo nome.

## 📁 Estrutura do Projeto

agenda/  
&nbsp; &nbsp; └── Agenda.java


> 📂 O arquivo de contatos é salvo em: `C:/arquivo/agenda.txt` (criado automaticamente se não existir).

## 🔧 Funcionalidades

### ✔️ Criar diretório e arquivo
Ao instanciar a classe `Agenda`, ela verifica se a pasta `C:/arquivo` existe. Se não existir, ela será criada.

### ✍️ Adicionar contato

```java
Agenda agenda = new Agenda();
agenda.escrita("Maria", "1234-5678");
```
Grava o contato no arquivo no formato:
```
Maria;1234-5678
```
### 📖 Listar todos os contatos  
```
agenda.lerTodos();
```

Saída esperada:
```
Nome: Maria - Telefone: 1234-5678
```
### 🔍 Buscar um contato pelo nome
```
agenda.ler("Maria");
```
Saída esperada:
```
Nome: Maria - Telefone: 1234-5678
```
## 🚀 Como Usar

1. Crie uma classe com o método main para testar:
```
public class Main {
    public static void main(String[] args) throws Exception {
        Agenda agenda = new Agenda();

        agenda.escrita("João", "9999-8888");
        agenda.lerTodos();
        agenda.ler("João");
    }
}
```

2. Compile e execute:
```
javac agenda/Agenda.java
javac Main.java
java Main
```

#### 📌 Importante: Este código salva o arquivo na raiz do C:. Certifique-se de que você tenha permissões de escrita no local. Em sistemas Unix (Linux/macOS), esse caminho deve ser ajustado para algo como /home/usuario/agenda.txt.

## ✅ Requisitos

- Java 8 ou superior
- Sistema com permissões de escrita no diretório C:/arquivo

## 🧠 Observações

O arquivo é salvo em modo de append, ou seja, novos contatos são adicionados ao final do arquivo.

Os dados são separados por ponto e vírgula (;) no arquivo.

O método ler(String nome) faz uma busca simples (usa String.contains()), então ele pode retornar nomes parcialmente coincidentes.

### 📘 Este projeto tem fins educacionais e demonstra como ler e gravar arquivos texto em Java utilizando `FileWriter`, `BufferedWriter`, `FileReader` e `BufferedReader`.