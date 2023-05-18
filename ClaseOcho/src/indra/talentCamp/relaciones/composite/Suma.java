package indra.talentCamp.relaciones.composite;

public class Suma extends OperacionBinaria{


    public Suma(Operacion operandoIzquierdo, Operacion operandoDerecho) {
        super(operandoIzquierdo, operandoDerecho);
    }

    public Suma(double operandoIzquierdo, double operandoDerecho) {
        super(operandoIzquierdo, operandoDerecho);
    }

    public Suma(double operandoIzquierdo, Operacion operandoDerecho) {
        super(operandoIzquierdo, operandoDerecho);
    }

    public Suma(Operacion operandoIzquierdo, double operandoDerecho) {
        super(operandoIzquierdo, operandoDerecho);
    }



    @Override
    public double calcular() {
        return this.operandoIzquierdo.calcular() + this.operandoDerecho.calcular();
    }
}
