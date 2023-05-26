package indra.talentCamp.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class App {

    public static void main(String[] args) throws InstantiationException, InvocationTargetException, IllegalArgumentException, IllegalAccessException {
        System.out.println("Bienvenidos a la clase de reflection");

        try (Scanner in = new Scanner(System.in)) {
            Class<?> clazz = null;

            boolean claseEncontrada = false;

            while(!claseEncontrada){
                System.out.println("Ingrese el nombre completo de la clase para instanciar un objeto de la misma");
                String className = in.nextLine();

                try {
                    clazz = Class.forName(className);
                    claseEncontrada = true;
                } catch (Exception e) {
                    System.out.println("clase no encontrada. Vuelve a intentar");
                }
            }

            System.out.println("Los atributos de la clase son");
            Field[] fields = clazz.getDeclaredFields();
            for (Field field : fields){
                System.out.printf("%s %s : %s",
                        Modifier.toString(field.getModifiers()),
                        field.getName(),
                        field.getType().getName()
                );
                System.out.println();
            }

            System.out.println("Los metodos son");

            List<Method> metodos = Arrays.asList(clazz.getDeclaredMethods());
            metodos = metodos.stream().filter(m -> !m.getName().startsWith("set")  && !m.getName().startsWith("get")).collect(Collectors.toList());
            for(Method method : metodos){
                System.out.printf("     %s %s : %s",
                        Modifier.toString(method.getModifiers()),
                        method.getName(),
                        method.getReturnType().getName()
                );
                System.out.println();
            }

            System.out.println("Instanciando un objeto de ese tipo");
            Object objeto = clazz.getConstructors()[0].newInstance();
            System.out.println("Objetos instanciados");

            System.out.println("Desea modificar algun atributo?");
            String modificarAtributo = in.nextLine();
            while(modificarAtributo.equalsIgnoreCase("S")){

                boolean atributoEncontrado = false;
                while(!atributoEncontrado) {
                    System.out.println("Que atributo desea modificar?");
                    String atributo = in.nextLine();
                    try {
                        Field f = clazz.getDeclaredField(atributo);
                        String valor = in.nextLine();
                        f.setAccessible(true); //rompo el encapsulamiento con reflection y seteo atributos privados
                        f.set(objeto, valor);
                        atributoEncontrado = true;
                    }catch (Exception e) {
                        System.out.println("Atributo no encontrado/ no se puede setear vuelva  a escribir" + e.getMessage());
                    }
                }


                System.out.println("Desea modificar otro atributo?");
                modificarAtributo = in.nextLine();
            }

            System.out.println("Los atributos quedan asi:");
            for (Field field : fields) {
                field.setAccessible(true); //ROMPO EL ENCAPSULAMIENTO
                System.out.printf("%s : %s",
                        field.getName(),
                        field.get(objeto)
                );
                System.out.println();
            }

        }
    }

}
