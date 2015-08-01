
import org.junit.*;
import static org.junit.Assert.*;
import java.util.*;

import br.com.ufti.rpncalculadora.RPNCalculadoraModel;
import dalvik.annotation.TestTargetClass;


/**
 * Created by Frederico on 01/08/2015.
 */
public class RPNCalculadoraModelTest {

@Test

   public void testDisplay(){

    RPNCalculadoraModel calculadora = new RPNCalculadoraModel();

    calculadora.numberPressed("0");
    calculadora.numberPressed("0");
    calculadora.numberPressed("2");
    calculadora.numberPressed("0");
    calculadora.numberPressed("3");

    String expected="203";

    String atual = calculadora.getDisplay();
    assertEquals(expected,atual);



}












}
