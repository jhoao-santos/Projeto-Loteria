# 🎲🎰 Simulador de Loteria em Java  

Este projeto é um **simulador de loteria** desenvolvido em Java. Ele permite que o usuário registre bilhetes com números escolhidos manualmente e, em seguida, realiza um sorteio aleatório para verificar quantos acertos foram obtidos.  

---

## 📌 Funcionalidades  

✅ **Registro de bilhetes**: O usuário pode inserir **6 números** entre 1 e 60 para cada bilhete.  

✅ **Sorteio aleatório**: O sistema gera **6 números aleatórios** entre 1 e 60 como resultado do sorteio.  

✅ **Verificação de acertos**: O programa compara os números do bilhete com os números sorteados e informa a quantidade de acertos.  

✅ **Interface interativa via console**: O usuário pode registrar vários bilhetes e visualizar os resultados diretamente no terminal.  

✅ **Ordenação dos números sorteados**: Para facilitar a visualização, os números sorteados são exibidos em **ordem crescente**.  

---

## ⚙️ Tecnologias Utilizadas  

🔹 **Java (JDK X.X)** – Linguagem principal do projeto.  

🔹 **Scanner (java.util.Scanner)** – Para entrada de dados do usuário.  

🔹 **ArrayList (java.util.ArrayList)** – Para armazenar os bilhetes registrados.  

🔹 **Random (java.util.Random)** – Para gerar os números aleatórios do sorteio.  

🔹 **Arrays (java.util.Arrays)** – Para manipulação e ordenação dos números.  

---

## 🚀 Como Executar o Projeto  

1. **Clone o repositório:**  

   ```bash
   git clone https://github.com/seu-usuario/simulador-loteria.git
   cd simulador-loteria
Abra o projeto em uma IDE (IntelliJ, Eclipse, VS Code).

Compile e execute o código:

javac secao_loteria/SimuladorLoteria.java
java secao_loteria.SimuladorLoteria
Siga as instruções no terminal para registrar seus bilhetes e visualizar os resultados.

📷 Exemplo de Execução

Digite 6 números para seu bilhete (entre 1 e 60):  
Digite o número 1: 5  
Digite o número 2: 12  
Digite o número 3: 23  
Digite o número 4: 34  
Digite o número 5: 45  
Digite o número 6: 56  

Deseja registrar outro bilhete? (s / n)  
n  

Realizando o sorteio...

📜 Números escolhidos: [5, 12, 23, 34, 45, 56]  
🎲 Números sorteados: [3, 12, 25, 34, 42, 50]  
✅ Você teve 2 acertos. 
 
📌 Melhorias Futuras

🔹 Evitar números repetidos no bilhete e no sorteio.


🔹 Aprimorar a interface com um menu interativo para melhor experiência do usuário.


🔹 Criar uma versão gráfica utilizando Java Swing ou JavaFX.


🔹 Registrar os bilhetes e resultados em um banco de dados ou arquivo de texto.


🔹 Permitir diferentes tipos de apostas, como Mega-Sena, Quina, Lotofácil, etc.


🔗 Autor: 📌 João Santos
