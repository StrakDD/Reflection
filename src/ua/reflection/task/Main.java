package ua.reflection.task;

import java.lang.annotation.Annotation;
import java.lang.reflect.*;
import java.lang.reflect.Proxy;

/**
 * Created by Denis Starovoitenko on 29.08.2017.
 */
public class Main {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        RationalExpression expression = new RationalExpression(5);

        Class clazz = expression.getClass();
        Method[] methods = clazz.getMethods();

        for (Method method : methods) {
            //System.out.println("method = " + method.getName());
            Annotation[] annotations = method.getDeclaredAnnotations();
            for (Annotation annotation : annotations) {
                if (annotation.annotationType().equals(MyAnnotation.class)){
                    Parameter[] parameters = method.getParameters();
                    method.invoke(expression, 1);
                }
            }
        }

        System.out.println("Class name: " + clazz.getName());
        System.out.println("List of field: ");
        Field[] fields = clazz.getDeclaredFields();
        for (Field field : fields) {
            System.out.println(field.getName() + " " + field.getType().getName() + " " + Modifier.toString(field.getModifiers()));
        }
        System.out.println("List of Annotation: ");
        Annotation[] annotations = clazz.getDeclaredAnnotations();
        for (Annotation annotation : annotations) {
            System.out.println(annotation);
        }


        SomeImplementation userImplementation = new SomeImplementation("Its Proxy");
        SomeInterface userInterface = (SomeInterface) Proxy.newProxyInstance(SomeImplementation.class.getClassLoader(),
                SomeImplementation.class.getInterfaces(), new ua.reflection.task.Proxy(userImplementation));

        System.out.println(userInterface.get());
        userInterface.set("asf");
    }
}
