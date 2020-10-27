//package com.example.beanpost.reflection;
//
//import com.sun.org.glassfish.gmbal.Description;
//import org.w3c.dom.ls.LSOutput;
//
//import java.lang.annotation.Annotation;
//import java.lang.reflect.Field;
//import java.lang.reflect.Method;
//import java.util.ArrayList;
//import java.util.Arrays;
//
//
//public class Main {
//    public static void main(String[] args) throws ClassNotFoundException, NoSuchFieldException, IllegalAccessException {
////        Class<?> carClass = Class.forName("Reflection.Car");
////        System.out.println(carClass.toString());
////
////
////        Car car = new Car();
////        Class<?> carClass1 = car.getClass();
////        System.out.println(carClass1);
//
////
////        Class<?> carClass3 = Car.class;
////        System.out.println(carClass3);
////
////        Field[] fields = carClass3.getFields();
////        System.out.println(fields.length);
////        for (Field field : fields) {
////            System.out.println(field);
////
////        }
////
////        Field field = carClass3.getDeclaredField("serialNumber");
////        System.out.println(field + " serialNumber");
////
////        Method[] methods = Car.class.getMethods();
////        for (Method method : methods) {
////            System.out.println(method);
//        //}
////        Car car  = new Car(3, "Name");
//        Car car1 = new Car(2, "Name2");
//
//        Class<?> carClass = car1.getClass();
//        Field field1 = carClass.getDeclaredField("serialNumber");
//        String stringSerial = (String) field1.get(car1);
//        System.out.println(stringSerial);
//
////        Annotation[] annotations = field1.getAnnotations(); //1
////        System.out.println(Arrays.toString(annotations));
//
//       MyAnnotation descriptionAnnotation = field1.getAnnotation(MyAnnotation.class); //2
//        System.out.println(descriptionAnnotation);
//        System.out.println(descriptionAnnotation.name());
//        field1.setAccessible(true);
//        String s = descriptionAnnotation.name();
//        car1.setSerialNumber(s);
//        System.out.println(car1);
//
////        Annotation[] annotationsByType = field1.getAnnotationsByType(MyAnnotation.class); //3
////        System.out.println(Arrays.toString(annotationsByType));
//
//    }
//}
