# 📊 Simulador de Investimentos em Fundos Imobiliários (FII)

Esta planilha foi desenvolvida como parte de um laboratório prático de Excel, com o objetivo de auxiliar investidores a simularem seus aportes em **fundos imobiliários** ao longo do tempo. A ferramenta oferece uma visão clara do crescimento do patrimônio, dos dividendos mensais estimados e do valor total investido, permitindo decisões mais informadas e estratégicas.

## 🧠 Conceitos aplicados
- Juros compostos  
- Funções financeiras do Excel (`FV`, multiplicações, etc.)  
- Automatização de cálculos  
- Visual atraente e organizado  

## 📁 Estrutura da Planilha

### 1. Resumo da Simulação

Nesta aba, o usuário insere os dados principais do investimento:

- 💵 **Investimento Mensal**
- ⏳ **Tempo de Investimento (em meses)**
- 📈 **Taxa de Rendimento Mensal (% estimada)**  

Com base nesses dados, a planilha calcula automaticamente:

- ✅ **Total Investido**
- 📊 **Patrimônio Final Estimado**
- 💰 **Dividendos Mensais Esperados**

### 2. Simulação Mensal

Simula a evolução mês a mês do investimento com os seguintes dados:

- 📆 Mês
- 📥 Aporte aplicado
- 📈 Patrimônio acumulado (com rendimento composto)
- 💵 Dividendos mensais estimados com base no patrimônio do mês

## 🧮 Fórmulas principais utilizadas

- `=B2*B3` → Cálculo do total investido  
- `=FV(B4,B3,-B2,0)` → Valor futuro do patrimônio com juros compostos  
- `=B6*B4` → Estimativa dos dividendos mensais  
- Cálculo iterativo mês a mês para evolução do patrimônio e dividendos  

---

