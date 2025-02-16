class heroi{
    constructor(nome, idade, tipo){
        this.nome = nome
        this.idade = idade
        this.tipo = tipo
    }

    atacar(){
        let ataque = ""

        if(this.tipo == "mago"){
            ataque = "magia"
        }

        else if(this.tipo == "guerreiro"){
            ataque = "espada"
        }

        else if(this.tipo == "monge"){
            ataque = "artes marciais"
        }

        else if(this.tipo == "ninja"){
            ataque = "shuriken"
        }

        else{
            ataque = "as mãos"
        }

        console.log(`O ${this.tipo} atacou usando ${ataque}`)
    }
}

let personagem = new heroi("Claudio", 45, "mago")
let personagem2 = new heroi("André", 15, "ninja")
let personagem3 = new heroi("Sara", 23, "heroi") // se colocar um heroi que não está registrado, irá aparecer que o ataque dele é com as mãos

personagem.atacar()
personagem2.atacar()
personagem3.atacar()