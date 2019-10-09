package rdp.spring.demo;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
//注入范围
@Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class User2Impl implements User2 {

    public User2Impl(){
        String i = "3233";
    }

    public String getName() {
        return "I am User2Impl";
    }
}
