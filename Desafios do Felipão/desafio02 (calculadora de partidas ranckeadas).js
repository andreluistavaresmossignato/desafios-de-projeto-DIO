let vitorias = 56
let derrotas = 1
let resultado = calcular(vitorias, derrotas)
let rank = ""

if(resultado < 10){
    rank = "Ferro"
}

else if(resultado >= 11 && resultado <= 20){
    rank = "Bronze"
}

else if(resultado >= 21 && resultado <= 50){
    rank = "Prata"
}

else if(resultado >= 51 && resultado <= 80){
    rank = "Ouro"
}

else if(resultado >= 81 && resultado <= 90){
    rank = "Diamante"
}

else if(resultado >= 91 && resultado <= 100){
    rank = "Lendário"
}

else{
    rank = "Imortal"
}

console.log(`O herói tem de saldo de ${resultado} está no nível de ${rank}`)

function calcular(v, d){
    return vitorias - derrotas
}