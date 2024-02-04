package com.abhi.test.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

public class GSTServiceTest {
    @Test
    public void calculateGSTTest(){
//        GstProvider gstProvider = new GSTProviderImpl();
        GstProvider mockProvider = Mockito.mock(GstProvider.class);
        GSTService gstService = new GSTService(mockProvider);
        Mockito.when(mockProvider.getGSTDetails()).thenReturn(18);
        int result = gstService.calculateGST();
        Assertions.assertEquals(18,result);
    }
}

//class GSTProviderImpl implements GstProvider{
//
//    @Override
//    public int getGSTDetails() {
//        return 18;
//    }
//}
