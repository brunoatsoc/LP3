#jogo Craps

#Importação dos pacotes que serão usados
from random import randint

#Função que rola dois dados e retorna os dois valores
def rollDice():
    return randint(1, 6), randint(1, 6)

#Função que verifica se se o jogador ganhou ou vai para o segundo estágio
def verification(dice1, dice2):
    score = dice1 + dice2

    if (score == 7) or (score == 11):
        print("\nDado 1: ", dice1, "\nDado 2: ", dice2, "\nPonto: ", score, "\n\nVocê ganhou\n\n", sep="", end="")
    elif (score >= 4 and score <= 6) or (score >= 8 and score <= 10):
        print("\nDado 1: ", dice1, "\nDice 2: ", dice2, "\nPonto: ", score, "\n\nIniciando estagio 2\n\n", sep="", end="")
        secondStage(score)
    else:
        print("\nDado 1: ", dice1, "\nDice 2: ", dice2, "\nPonto: ", score, "\n\nVocê perdeu :-(\n\n", sep="", end="")

#Função que faz o segundo estágio caso o jogador não ganhe de primeira
def secondStage(value):
    i = 1

    while True:
        dice1, dice2 = rollDice()

        score = dice1 + dice2

        print("Dado 1: ", dice1, "\nDado 2: ", dice2, "\nJogada ", i, " : ", score, "\n\n", sep="", end="")
        
        if score == 7:
            print("Você perdeu :-(\n\n", end="")
            break
        elif score == value:
            print("Você venceu\n\n", sep="", end="")
            break
        
        i += 1

#O programa começa aqui
choice = 1

while choice != 0:
    dice1, dice2 = rollDice()
    verification(dice1, dice2)
    choice = int(input("Você quer continuar? (0 para sair e 1 para continuar): "))