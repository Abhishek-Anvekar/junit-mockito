package com.abhi.test.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class GSTServiceTest {
    @Mock
    private GstProvider mockProvider;
    @InjectMocks
    private GSTService gstService;
//    @BeforeEach
//    public void init(){
//        MockitoAnnotations.initMocks(this);
//    }
    @Test
    public void calculateGSTTest(){
//        GstProvider gstProvider = new GSTProviderImpl();
//        GstProvider mockProvider = Mockito.mock(GstProvider.class);
//        GSTService gstService = new GSTService(mockProvider);
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
