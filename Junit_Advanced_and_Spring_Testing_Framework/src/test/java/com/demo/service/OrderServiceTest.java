package com.demo.service;

import com.demo.domain.Order;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;
import static org.powermock.api.mockito.PowerMockito.mock;

@RunWith(MockitoJUnitRunner.class)
public class OrderServiceTest {

    @Mock
    public EmailService emailService ;
    @Mock
    public Order mockOrder;
//    Order mockOrder = mock(Order.class);

    @InjectMocks
    OrderService orderService ;
    @Captor
    ArgumentCaptor<Order> argumentCaptor;

    @Test()
    public void testPlaceOrder(){
        assertNotNull(mockOrder);
        orderService.placeOrder(mockOrder);
        verify(emailService,times(1)).sendEmail(argumentCaptor.capture());
        assertEquals(mockOrder,argumentCaptor.getValue());
    }

    @Test
    public void testBooleanPlaceOrderTrue(){
        assertNotNull(mockOrder);
        String cc = "hv@gmail.com" ;
        when(emailService.sendEmail(mockOrder , cc)).thenReturn(true);
        assertTrue(orderService.placeOrder(mockOrder , cc)); ;
    }
    @Test
    public void testBooleanPlaceOrderFalse(){
        assertNotNull(mockOrder);
        String cc = "hv@gmail.com" ;
        when(emailService.sendEmail(mockOrder , cc)).thenReturn(false);
        assertFalse(orderService.placeOrder(mockOrder , cc)); ;
    }
    @Test
    public void getInstanceTest() {
        assertNotNull(mockOrder);
    }

}