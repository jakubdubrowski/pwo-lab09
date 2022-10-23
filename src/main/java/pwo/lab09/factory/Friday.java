/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pwo.lab09.factory;

/**
 *
 * @author james
 */
public class Friday implements MessageFactory{
    @Override
    public String createIntroMessage() {
        return "Dzień dobry Piątek.";
    }

    @Override
    public String createMainMessage() {
        return "Byle do 16 wytrzymać";
    }

    @Override
    public String createClosingMessage() {
        return "Piątek weekendu początek :)";
    }
    
}
