const choices = ["ROCK", "PAPER", "SCISSORS"]; // Corrigido para "choices"
const images = {
    ROCK: "./assets/rock.png",
    PAPER: "./assets/paper.png",
    SCISSORS: "./assets/scissors.png"
};

let score1 = 0;
let score2 = 0;

// Função para obter uma escolha aleatória
function getRandomChoice() {
    return choices[Math.floor(Math.random() * choices.length)];
}

// Função para determinar o vencedor
function getWinner(choice1, choice2) {
    if (choice1 === choice2) return "DRAW";
    if (
        (choice1 === "ROCK" && choice2 === "SCISSORS") ||
        (choice1 === "PAPER" && choice2 === "ROCK") ||
        (choice1 === "SCISSORS" && choice2 === "PAPER")
    ) {
        return "PLAYER 1";
    } else {
        return "PLAYER 2";
    }
}

// Evento para jogar uma rodada
document.getElementById("playButton").addEventListener("click", () => {
    // Escolhas aleatórias para os dois jogadores
    const choice1 = getRandomChoice();
    const choice2 = getRandomChoice();

    // Atualizar as imagens e os textos das escolhas
    document.getElementById("player1").querySelector("img").src = images[choice1];
    document.getElementById("player2").querySelector("img").src = images[choice2];
    document.getElementById("choice1").textContent = choice1;
    document.getElementById("choice2").textContent = choice2;

    // Determinar o vencedor
    const winner = getWinner(choice1, choice2);

    // Atualizar os placares
    if (winner === "PLAYER 1") {
        score1++;
        document.getElementById("score1").textContent = score1;
    } else if (winner === "PLAYER 2") {
        score2++;
        document.getElementById("score2").textContent = score2;
    }

    // Exibir o resultado da rodada
    if (winner === "DRAW") {
        alert("It's a DRAW!");
    } else {
        alert(`${winner} WINS this round!`);
    }
});
