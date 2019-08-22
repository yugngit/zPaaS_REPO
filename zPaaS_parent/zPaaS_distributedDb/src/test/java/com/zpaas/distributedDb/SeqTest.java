package com.zpaas.distributedDb;

import com.zpaas.db.sequence.Sequence;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:distributedDbContext.xml")
public class SeqTest {

    @Resource(name="demo_test_seq")
    private Sequence demoTestSeq;

    @org.junit.Test
    public void testNextFor10(){
        for(int i= 0 ; i < 10; i++){
            System.out.println("=====");
            System.out.println(demoTestSeq.nextValue());
            System.out.println("=====");
        }
    }

    @org.junit.Test
    public void testNextForOne(){
        System.out.println("=====");
        System.out.println(demoTestSeq.nextValue());
        System.out.println("=====");
    }

}
