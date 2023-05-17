package indra.talentCamp.generics;

@FunctionalInterface
public interface Operacion<T> {
    //si o si tiene que tener solo un metodo porque es una interfaz funcional
    T operar(T a, T b);

}
