package com.demo.service;

import com.demo.domain.Order;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.assertTrue;

@RunWith(MockitoJUnitRunner.class)
public class OrderServiceTest {

    @Test
    public void Test_getInstance(){
        OrderService orderService = OrderService.getInstance();
        assertTrue(orderService instanceof OrderService);
    }

    @Test
    public void placeOrderTest(){
        Order order = new Order(4, "Amul Butter", 54);
        assertTrue(OrderService.getInstance().placeOrder(order, "hv@gmail.com"));
    }

}
