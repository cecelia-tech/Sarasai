/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sarasai;

/**
 *
 * @author vita
 */
public class NaujaKlaida extends RuntimeException{

    public NaujaKlaida() {
    }

    public NaujaKlaida(String message) {
        super(message);
    }

    public NaujaKlaida(String message, Throwable cause) {
        super(message, cause);
    }

    public NaujaKlaida(Throwable cause) {
        super(cause);
    }

    
}
