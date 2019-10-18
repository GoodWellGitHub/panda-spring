package xml;

import com.xml.org.inte.Knight;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class KnightMain {
    public static void main(String[] args){
        ApplicationContext context=new ClassPathXmlApplicationContext("/di/spring_bean.xml");
        Knight knight=(Knight) context.getBean("knight");
        knight.embarkOnQuest();
    }
}
