package rdp.spring.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope(value= ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class UserImpl implements  User{

    @Autowired
    private User2 user2Impl;


    public String getName() {
        return "I am UserImpl;" + user2Impl.getName();
    }
}
