package indra.talentCamp.generics;

public class RectanguloInteger extends FiguraGenerica<Integer> {
    private int base;
    private int altura;

    public RectanguloInteger(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public int getAltura() {
        return altura;
    }

    @Override
    public Integer calcularArea() {
        return this.getBase() * this.getAltura();
    }

    @Override
    public Integer calcularPerimetro() {
        return 2*(this.getBase() + this.getAltura());
    }

}
