package main;
import org.springframework.context.ApplicationContext;
import org.springframework.core.SpringVersion;
import org.springframework.context.support.GenericApplicationContext;

class Start {
    public static void main(String[] data) {
        GenericApplicationContext context;
        context = new GenericApplicationContext();
        context.registerBean(Party.class);
        context.registerBean(Member.class);
        context.refresh();
        
        Party p = (Party)context.getBean(Party.class);
        p.setName("Liberty");
        p.setPoint(72);
        System.out.println( p.isOK() );

        String[] all = context.getBeanDefinitionNames();
        for(int i = 0; i < all.length; i++){
            //System.out.println( all[i] );
        }
               
    }
}

class Member {}
