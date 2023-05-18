package indra.talentCamp.relaciones.composite;

public class Multiplicacion extends OperacionBinaria{

    public Multiplicacion(Operacion operandoIzquierdo, Operacion operandoDerecho) {
        super(operandoIzquierdo, operandoDerecho);
    }

    public Multiplicacion(double operandoIzquierdo, double operandoDerecho) {
        super(operandoIzquierdo, operandoDerecho);
    }

    public Multiplicacion(double operandoIzquierdo, Operacion operandoDerecho) {
        super(operandoIzquierdo, operandoDerecho);
    }

    public Multiplicacion(Operacion operandoIzquierdo, double operandoDerecho) {
        super(operandoIzquierdo, operandoDerecho);
    }

    @Override
    public double calcular() {
        return this.operandoIzquierdo.calcular() * this.operandoDerecho.calcular();
    }

}
