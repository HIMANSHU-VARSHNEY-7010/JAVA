package com.demo.service;

import com.demo.domain.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class OrderServiceTest {

    @Test
    public void Test_getInstance(){
        OrderService orderService = OrderService.getInstance();
        assertTrue(orderService instanceof OrderService);
    }

    @Test
    public void Test_getInstance_False(){
        OrderService orderService = OrderService.getInstance();
        assertFalse(orderService instanceof OrderService);
    }

    @Test
    public void placeOrderTest(){
        Order order = new Order();
        assertTrue(OrderService.getInstance().placeOrder(order, "hv@gmail.com"));
    }
    @Test
    public void placeOrderTest_False(){
        Order order = new Order();
        assertFalse(OrderService.getInstance().placeOrder(order, "hv@gmail.com"));
    }

}
