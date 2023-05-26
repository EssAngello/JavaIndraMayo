package indra.talentCamp.dependencyInjection.ioc;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BeanFactoryV2 {

    List<Dependency> dependencies = new ArrayList<Dependency>();

    public void registerDepency(Class<?>source, String fieldName, Object destination){
        throw new Error("Not implemented yet");
    }

    public void registerDependency(Class<?> source, String fieldName, Class<?> destination){
        this.dependencies.add(new Dependency(source, fieldName,destination));
    }

    public Object createBean(Class<?> source){
        try {
            Object result = source.getConstructor().newInstance();

            List<Dependency> sourceDependencies = this.dependencies.stream().filter(d->d.getSource() == source).collect(Collectors.toList());

            for(Dependency dependency : sourceDependencies){
                Object destinationObject = dependency.getDestination().getConstructor().newInstance();
                Field field = source.getDeclaredField(dependency.getFieldName());
                field.setAccessible(true);
                field.set(result, destinationObject);
            }

            return result;
        } catch (Exception e) {
            throw new Error(e.getMessage());
        }
    }

}
