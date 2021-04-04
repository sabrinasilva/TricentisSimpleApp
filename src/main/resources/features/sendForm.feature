#language:pt

Funcionalidade: Preencher formulário
    Como usuário
    Eu quero preencher o formulário
    Para que possa enviar os dados

Cenário: Estou na página de formulário de seguro

    Dado que estou na pagina de formulário
    Quando eu estou na aba preecha os dados do veículo
    E eu preencho os campos do veículo com os valores
        | make                | Audi         |
        | model               | Scooter      |
        | cylindercapacity    | 150          |
        | engineperformance   | 300          |
        | dateofmanufacture   | 06/03/2020   |
        | numberofseats       | 2            | 
    E seleciono a direção direita como não
    E preencho os outros campos do veículo com os valores
        | campos                  | valores   |
        | numberofseatsmotorcycle | 2         |
        | fuel                    | Petrol    |
        | payload                 | 200       |
        | totalweight             | 1000      |
        | listprice               | 500       |
        | licenseplatenumber      | zzz-9999  |
        | annualmileage           | 10000     |
    E clico em próximo na página veículo
    Então eu vou para aba dados do seguro
    Quando eu estou na aba preecha os dados do seguro
    E eu preencho os campos do seguro com os valores
        | campos      | valores          |
        | firstname   | Alan             |
        | lastname    | Garner           |
        | birthdate   | 03/06/1993       |
    E seleciono o genero como masculino
    E preencho os outros campos do seguro com os valores
        | campos        | valores        |
        | streetaddress | Avenida Brasil | 
        | country       | Brazil         |
        | zipcode       | 37915000       |
        | city          | São Paulo      |
        | occupation    | Employee       |
    E seleciono dois hobbies
    E preencho o campo website com o link
        | campo         | link           |
        | website       | www.google.com |
    E clico em próximo para página do produto
    Então eu vou para a aba dados do produto
    Quando eu estou na aba preecha os dados do produto
    E eu preencho os campos do produto com os valores
        | campos          | valores           |
        | startdate       | 07/01/2021        |
        | insurancesum    | 25.000.000,00     |
        | meritrating     | Malus 10          |
        | damageinsurance | Partial Coverage  |
    E seleciono o produto opicional defesa legal
    E preencho o campo de carro reserva
    		|campos          | valores            |
    		|courtesycar     | No                 |
    E clico em próximo para selecionar opção de preço
    Então eu vou para a aba opção de preço
    
    Quando eu estou na aba selecione uma opção de preço
    E eu seleciono uma opção Gold
    E clico em próximo para a aba enviar cotação
    Então eu vou para a aba enviar cotação
    
    Quando eu estou na aba para eviar cotação
    E eu prencho os campos da cotação com os valores
        | campos          | valores                      |
        | email           | ginaldolaranjeiras@gmail.com |
        | phone           | 5579991147935                |
        | username        | alan_garner                  |
        | password        | abC123                       |
        | confirmpassword | abC123                       |
        | Comments        | It's a hard form!            |
    E clico no botão enviar cotação
    Então eu recebo a mensagem "Sending e-mail success!"
    
    
    