/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab09.factory;

/**
 *
 * @author james
 */
public class Sunday implements MessageFactory{
    @Override
    public String createIntroMessage() {
        return "Dzień dobry Niedziela.";
    }

    @Override
    public String createMainMessage() {
        return "W niedzielę tym bardziej nie pracuję :D";
    }

    @Override
    public String createClosingMessage() {
        return "Zaraz znowu poniedziałek :(((";
    }
    
}
