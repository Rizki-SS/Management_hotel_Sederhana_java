/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.ArrayList;
import junit.framework.TestCase;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author rizki
 */
public class TamuTest extends TestCase{
    
    Tamu instance;
    
    public TamuTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Tamu("test", "test", "01892985");
        System.out.format("Start Test %s \n", this.getName());
    }
    
    @After
    public void tearDown() {
        System.out.format("Finish Test %s \n", this.getName());
    }
    
    @Test
    public void testSearch() {
        System.out.println("search");
        String key = "test";
        ArrayList<Tamu> result = instance.search(key);
        ArrayList<Tamu> expResult = instance.getByDetai(instance.getNamaTamu(), instance.getAlamat(), instance.getTelp());
        assertEquals(expResult.size(), result.size());
    }

    @Test
    public void testSave() {
        System.out.println("save");
        this.instance.save();
        ArrayList<Tamu> expResult = instance.getByDetai(instance.getNamaTamu(), instance.getAlamat(), instance.getTelp());
        assertTrue(expResult.size()>0);
    }
    
}
