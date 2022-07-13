package main;
import org.springframework.core.SpringVersion;
import org.springframework.context.support.GenericApplicationContext;

class Start {
    public static void main(String[] data) {
        var version = SpringVersion.getVersion();
        System.out.println(version);
        
        var context = new GenericApplicationContext();
        context.registerBean(SimpleBean.class);
        
        var all = context.getBeanDefinitionNames();
        for (var s : all) {
            System.out.println(s);
        }
    }
}

class SimpleBean {
    
}
