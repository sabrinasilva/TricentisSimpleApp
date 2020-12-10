#language:pt

Funcionalidade: Consultar ofertas
    Como um consultor
    Eu quero verificar as ofertas
    Para que possa negociar com o cliente

Cenário: Deve ofertar produtos ao cliente
    Dado que possuo acesso ao sistema Sales
    E informo o CPF do cliente "658.575.850-15"
    Quando crio atendimento ao cliente
    Então os produtos "Cartão Múltiplo, Conta Corrente, Seguro de Vida, Cartão Benefício, Receber na Conta Corrente, Oferta Completa" devem ser ofertados com sucesso