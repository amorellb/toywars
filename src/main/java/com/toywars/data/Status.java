package com.toywars.data;

import static com.toywars.data.Action.CREATE;

/**
 * La clase Status representará el nivel y los puntos obtenidos durante la partida.
 *
 * El nivel solo podrá aumentar, de forma que cada cambio de estado sumará de 0 a n niveles al actual.
 *
 * Los puntos podrán sumarse o restarse en función de la acción realizada.
 */
public class Status {

    /**
     * Puntos y nivel que irán modificándose a medida que el juego avance.
     */
    private Integer currentLevel;
    private Integer finalLevel;
    private Integer currentPoints;
    private Integer finalScore;

    /**
     * Registro de la acción actual.
     */
    private Action currentAction;

    public Status() {
        this.currentLevel = 1;
        this.finalLevel = 1;
        this.finalScore = 0;
        this.currentPoints = 0;
        this.currentAction = CREATE;
    }

    public Integer getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(Integer currentLevel) {
        this.currentLevel = currentLevel;
    }

    public Integer getFinalLevel() {
        return finalLevel;
    }

    public void setFinalLevel(Integer finalLevel) {
        this.finalLevel = finalLevel;
    }

    public Integer getFinalScore() {
        return finalScore;
    }

    public void setFinalScore(Integer finalScore) {
        this.finalScore = finalScore;
    }

    public Integer getCurrentPoints() {
        return currentPoints;
    }

    public void setCurrentPoints(Integer currentPoints) {
        this.currentPoints = currentPoints;
    }

    public Action getCurrentAction() {
        return currentAction;
    }

    public void setCurrentAction(Action currentAction) {
        this.currentAction = currentAction;
    }
}
