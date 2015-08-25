package hibernateDemo.hibernateDemo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.zz.pojo.News;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Configuration cfg = new Configuration().configure();
        SessionFactory sf = cfg.buildSessionFactory();
        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();
        
        News news = new News();
        news.setTitle("title 标题");
        news.setContent("content 内容");
        
        session.save(news);
        tx.commit();
        session.close();
        sf.close();
    }
}
