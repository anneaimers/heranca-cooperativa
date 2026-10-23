# Cooperativa de Açaí

Desafio de herança em Java que modela o pagamento de cooperados de uma
cooperativa de açaí em Igarapé-Miri.


## Regras de pagamento

| Tipo       | Cálculo                             |
|------------|-------------------------------------|
| Cooperado  | `valorBase`                         |
| Peconheiro | `valorBase + 15,00 * rasasColhidas` |
| Batedor    | `valorBase + 2,50 * litrosBatidos`  |

## Dados de teste

| Nome | Matrícula | Tipo       | Base | Adicional |
|------|-----------|------------|------|-----------|
| Ana  | C01       | Cooperado  | 300  | nenhum    |
| João | C02       | Peconheiro | 300  | 12 rasas  |
| Rita | C03       | Batedor    | 300  | 50 litros |

## Cálculo esperado

- Ana: 300,00
- João: 300,00 + 15,00 × 12 = 480,00
- Rita: 300,00 + 2,50 × 50 = 425,00
- Total da folha: 1205,00

## Conceitos aplicados

- Herança com `extends` e reuso de atributos `protected`.
- Chamada a `super(...)` no construtor das subclasses.
- Sobrescrita de método com `@Override`.
- Polimorfismo em tempo de execução.
- Coleção genérica com `ArrayList<Cooperado>`.
- Formatação numérica com `Locale` e `System.out.printf`.
