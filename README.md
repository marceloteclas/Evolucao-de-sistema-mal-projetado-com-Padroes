# Trabalho de Padrões de Projeto – Criação e Evolução de um Sistema Mal Projetado com Aplicação Guiada de Padrões
- **Instituição:** IFBA - Instituto Federal da Bahia
- **Curso:** Análise e Desenvolvimento de Sistemas (ADS)
- **Disciplina:** Padrões de Projeto 
- **Projeto:** Criação e Evolução de um Sistema Mal Projetado com Aplicação Guiada de Padrões
- **Professor:** Felipe de Souza Silva
- **Semestre:** 5
- **Ano:** 2025.1

# 📌 Projeto:Sistema Mal Projetado e Refatorado

## Integrantes do Projeto

<table>
  <tr>
        <td align="center">
      <img src="https://avatars.githubusercontent.com/u/129338943?v=4" width="100px;" alt="Foto da Integrante Ronaldo"/><br />
      <sub><b><a href="https://github.com/Ronaldo-Correia">Ronaldo Correia</a></b></sub>
    </td>
    <td align="center">
      <img src="https://avatars.githubusercontent.com/u/114780494?v=4" width="100px;" alt="Foto da Integrante Marcelo"/><br />
      <sub><b><a href="https://github.com/marceloteclas">Marcelo Jesus</a></b></sub>
    </td>
    <td align="center">
      <img src="https://avatars.githubusercontent.com/u/129909472?v=4" width="100px;" alt="Foto da Integrante Franklin"/><br />
      <sub><b><a href="https://github.com/FranklinFelixADS">Franklin Felix</a></b></sub>
    </td>

  </tr>
</table>

## Estrutura do Projeto
- **fase1/** → Código inicial, mal projetado (sem padrões de projeto).
- **fase3/** → Código refatorado, aplicando padrões de projeto.
- **Main.java** → Classe principal que executa as duas fases (comparação antes/depois).

---

## 🚩Problemas da Versão Inicial (fase1)
- **Baixa coesão**: a classe `sistemaMonitoramento` concentrava muitas responsabilidades (cadastrar sensores, coletar dados, exibir relatórios).  
- **Violação do SRP (Single Responsibility Principle)**: lógica de negócio misturada com saída no console.  
- **Alto acoplamento**: difícil de estender ou substituir comportamentos.  
- **Anti-padrão Spaghetti Code**: métodos longos, muitos `if/else`, difícil manutenção.

---

## ✅Padrões Aplicados na Refatoração (fase3)
- **Facade (SalaFacade)**  
  - Fornece uma interface simplificada para interação com o sistema.  
  - Facilita o uso, reduz acoplamento e melhora a organização.

- **Observer (RelatorioObserver, AlarmeObserver)**  
  - Permite notificar automaticamente diferentes partes do sistema quando novos dados são coletados.  
  - Resolve o problema de saída acoplada diretamente no `sistemaMonitoramento`.

- **Factory Method (SensorFactory)**  
  - Criação centralizada de sensores (`SensorTemperatura`, `SensorPresenca`, `SensorLuminosidade`).  
  - Elimina duplicação de código e uso excessivo de `if/else`.

- **Separação de Responsabilidades (Relatorio)**  
  - A geração de relatórios foi extraída para uma classe específica.  
  - Garante que `SistemaMonitoramentoRefatorado` cuide apenas da coleta de dados.

---

## 👨‍💻Como Executar
1. Clone este repositório:
   ```bash
   git clone https://github.com/marceloteclas/Evolucao-de-sistema-mal-projetado-com-Padroes.git
   ```
2. Compile o código:
   
   javac src/main/java/com/**/*.java
 
4. Rode o Main:
   
   java src/main/java/com/Main
   
