package indra.talentCamp.relaciones;

import indra.talentCamp.relaciones.composite.Multiplicacion;
import indra.talentCamp.relaciones.composite.Operacion;
import indra.talentCamp.relaciones.composite.Suma;
import indra.talentCamp.relaciones.composite.Valor;

import org.mozilla.javascript.*;

public class Program {

    public static void main(String[] args) {

        //vamos a realizar el siguiente calculo: 2+2*3
        Operacion calculo = new Suma(
                new Valor(2),
                new Multiplicacion(new Valor(2), new Valor(3))
        );

        //6*5+3*8
        Operacion calculo2 = new Suma(
                new Multiplicacion(new Valor(6), new Valor(5)),
                new Multiplicacion(new Valor(3), new Valor(8))
        );


        //5+3*8+4*3

        Operacion calculo3 = new Suma(
                5,
                new Suma(
                        new Multiplicacion(3, 8),
                        new Multiplicacion(4, 3)
                        )
        );


        System.out.println("2+2*3 = " + calculo.calcular());
        System.out.println("6*5+3*8 = " + calculo2.calcular());
        System.out.println("5+3*8+4*3 = " + calculo3.calcular());

        String expresion = "5+3*8+4*3";

        Context jsContext = Context.enter();

        try {
            var res = jsContext.evaluateString(jsContext.initSafeStandardObjects(),
                    expresion,
                    "Calculo",
                    0,
                    null);
            System.out.println("El resultado es: ");
            System.out.println(expresion + "=" + res);
        } finally {
            Context.exit();
        }
    }

}
