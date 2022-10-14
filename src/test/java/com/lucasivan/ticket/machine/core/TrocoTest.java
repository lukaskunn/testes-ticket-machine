package com.lucasivan.ticket.machine.core;

import org.junit.Assert;
import org.junit.Test;

public class TrocoTest {

    //inicializando mocks
    Troco troco100 = new Troco(103);
    Troco troco50 = new Troco(53);
    Troco troco20 = new Troco(23);
    Troco troco10 = new Troco(13);
    Troco troco5 = new Troco(6);
    Troco troco2 = new Troco(2);
    Troco.TrocoIterator trocoIterator = new Troco.TrocoIterator(troco2);

    @Test
    public void getIteratorTest(){
        //provando que aquela chamada pode ser não nula
        Assert.assertNotNull(troco100.getIterator());
    }

    @Test
    public void getTrocoTest(){
        //testando cada um dos (que seriam antes) whiles
        Assert.assertEquals(troco100.getTroco(), 102);
        Assert.assertEquals(troco50.getTroco(), 52);
        Assert.assertEquals(troco20.getTroco(), 22);
        Assert.assertEquals(troco10.getTroco(), 12);
        Assert.assertEquals(troco5.getTroco(), 5);
        Assert.assertEquals(troco2.getTroco(), 2);
    }

    @Test
    public void hasNextTest(){
        //provando que agora tem como dar true
        Assert.assertTrue(trocoIterator.hasNext());
    }

    @Test
    public void nextTest(){
        //provando que agora tem como não ser nulo e que existe retorno
        Assert.assertNotNull(trocoIterator.next());
    }


}
