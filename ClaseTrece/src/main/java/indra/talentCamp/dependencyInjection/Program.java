package indra.talentCamp.dependencyInjection;

import indra.talentCamp.dependencyInjection.constructor.ConstructorInjectionDemo;
import indra.talentCamp.dependencyInjection.field.FieldInjectionDemo;
import indra.talentCamp.dependencyInjection.ioc.IocInjectionDemo;
import indra.talentCamp.dependencyInjection.reflection.ReflectionInjectionDemo;

public class Program {
    public static void main(String[] args) {
        System.out.println("Constructor Injection Demo");
        ConstructorInjectionDemo.aTodoGas();
        System.out.println();

        System.out.println("Field/Setter injection Demo");
        FieldInjectionDemo.aTodoGas();
        System.out.println();

        System.out.println("Reflection injection Demo");
        ReflectionInjectionDemo.aTodoGas();
        System.out.println();

        System.out.println("Ejemplo de Ioc Container");
        IocInjectionDemo.aTodoGas();
        System.out.println();

    }
}
