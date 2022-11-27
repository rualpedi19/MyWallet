//Aplicacao Despesa
    //Emprestimo
            instituicao

            titular
                nif
                informacao bancaria
        
        data inicial emprestimo
            DD/MM/YYYY
        
        duracao emprestimo
            X anos + Y meses + Z dias

            montante inicial
                valor + moeda
        
        taxa juros associada
            X fixa ou var

        tipo de pagamento
            mensal ou semestral ou anual
        
        prestacao c/ juros e s/juros
        
        data final emprestimo
            DD/MM/YYYY
        
        valor total pago -> ate ao momento | total c/ juros | total s/ juros | total de juros

    
    
    
    posso fazer informacao inicial //class informacaoInicial
    e informacao do momento //class informacaoAtualizada

/* 
    private -> só é visievl para a propria classe (nao da para usar noutras classes)
    void -> nao devolve resultado apenas faz alguma coisa
    
*/



    
class emprestimo {

    String instituicao;     //Bank of America
    //titular               // Person's inf.
    String planoPagamento; //Mensal, Semestral, Anual



}

class montante {

    int valor;            // 100
    String moeda;         // EUR
    String valorDescrito; // cem euros

}

class taxaJuro {

    Double taxa;        //  4,3
    String percentagem; //  %
    String tipoTaxa;    //  fixa     ou variavel
}




//IBAN -> PT50 .... .... .... .. .... .

class titular {
    String nomeCompleto;      // Cristiano Ronaldo
    int nif;                  //Nº indentificacao fiscal
    int numeroIdentificacao;  //Nº Cartao Cidadao
    String iban;              //PT50 1234 5678 9012 3456
    Data dataNascimento;      // DD/MM/YYYY
    String nacionalidade;     //Português
    String sexo;              // Masculino ou Feminino
    String estadoCivil;       // Casado, Solteiro, etc... (ver as opçoes burocratiocas)
    //MORADA;
    int numeroTelemovel;      //914567890
    int numeroTelefone;       //212 
    String email;

}




/////////////////////----MORADA----/////////////////////////////////////

/* ^     ()()()

Vivenda -> lote
Apartamentos -> andar e porta
	
	
Se for VIVENDA
	entao escolher LOTE
	
Se for Apartamento
	entao escolher LOTE, ANDAR e PORTA

    */

class morada {
    
    String distrito;
    String concelho;
    String freguesia;
    CodigoPostal codigoPostal;
    String rua;                 // Rua Manuel Mendes
    String lote;                // 22º
    String andar;               // Nao haveria -> ()()()
}



class codigoPostal {

    int cpPrimario;
    int cpSecundario;

    
codigoPostal(int valor1, int valor2) {

    int validationcpPrimario;
    int validationcpSecundario;
    
    validationcpPrimario   = 0;
    validationcpSecundario = 0;	
    
    if (valor1>=1000 && valor1<=9999) 
        validationcpPrimario += 1;
    
    if (valor2>=100 && valor2<=999) 
        validationcpSecundario += 1;
    
    if (validationcpPrimario == 1 && validationcpSecundario == 1) {
    
        cpPrimario = valor1;
        cpSecundario = valor2;
        
    }	else {
        
        System.out.println("The inserted values are not between standard regulations");
        System.out.println("The regulations are as following:");
        System.out.println("The cpPrimario should be between 1000 and 9999. Your inserted value was:" + valor1 +".");
        System.out.println("The cpSecundario should be between 100 and 999 Your inserted value was:" + valor2 +".");
        
    }
}

class Data {

    int dia;
    int mes;
    int ano;

}