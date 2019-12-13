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
public class PembayaranTest extends TestCase{
    
    Pembayaran instance;
    
    public PembayaranTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
        instance = new Pembayaran("Test", "1124080981");
        System.out.format("Start Test %s \n", this.getName());
    }
    
    @After
    public void tearDown() {
        System.out.format("Start Test %s \n", this.getName());
    }

    @Test
    public void testSave() {
        System.out.println("save");
        this.instance.save();
        ArrayList<Pembayaran> expResult = instance.getByDetai(instance.getNama(), instance.getNo_id());
        assertTrue(expResult.size()>0);
    }

    
}
