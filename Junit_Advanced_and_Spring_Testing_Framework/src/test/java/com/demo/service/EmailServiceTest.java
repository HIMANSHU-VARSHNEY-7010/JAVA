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
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class EmailServiceTest {
    @Mock
    Order mockOrder;
//    Order mockOrder = mock(Order.class);
    @InjectMocks
    EmailService emailService ;
    @Captor
    ArgumentCaptor<Exception> argumentCaptor;

    @Test(expected = RuntimeException.class)
    public void testSendEmail(){
        emailService.sendEmail(mockOrder);
    }
    @Test
    public void testSendEmailBoolean_True(){
        String cc = "hv@gmail.com" ;
        assertTrue(emailService.sendEmail(mockOrder, cc)) ;
    }
    @Test
    public void getInstanceTest(){
        assertNotNull(emailService);
    }
//    @Test
//    public void testSendEmailBoolean_False(){
//        String cc = "hv@gmail.com" ;
////        given(emailService.sendEmail(mockOrder, cc)).willReturn(false);
//        assertFalse(emailService.sendEmail(mockOrder, cc)) ;
//    }

}