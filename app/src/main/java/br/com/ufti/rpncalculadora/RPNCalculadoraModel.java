package br.com.ufti.rpncalculadora;

import java.util.Stack;

/**
 * Created by Frederico on 01/08/2015.
 */
public class RPNCalculadoraModel implements CalculadoraInterface{


    private Stack<Integer> pilha = new Stack<>();
    private String display = "0";

    @Override
    public String getDisplay() {
        return display;
    }

    @Override
    public void numberPressed(String num) {

    display = display + num;
        int numDisplay = Integer.parseInt(display);
        display = "" + numDisplay;

    }

    @Override
    public void OperationPressed(String op) {


        if(op.equals("="))
        {
            int numDisplay = Integer.parseInt(display);
            pilha.push(numDisplay);
            display="0";


        }else if(op.equals("+")){
            int num1= pilha.pop();
            int num2= pilha.pop();
            int res = num1 + num2;

            pilha.push(res);
            display =" "+ res;
;        }else if (op.equals("*")){

            int num1= pilha.pop();
            int num2= pilha.pop();
            int res = num1 * num2;

        }else if(op.equals("/")){

            int num1= pilha.pop();
            int num2= pilha.pop();
            int res = num1 / num2;

        }






    }
}
