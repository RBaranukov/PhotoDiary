//package photo_diary.aspects;
//
//
//import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Before;
//import org.springframework.stereotype.Component;
//import photo_diary.entity.Client;
//
//import java.util.ArrayList;
//import java.util.List;
//
//@Component
//@Aspect
//public class ClientAspect {
//
//
//    @Before("execution(* photo_diary.dao.*.save*(..))")
//    public Object beforeSaveClient(JoinPoint joinPoint){
//        Object[] clientList = joinPoint.getArgs();
//        clientList.equals()
//   }
//}
