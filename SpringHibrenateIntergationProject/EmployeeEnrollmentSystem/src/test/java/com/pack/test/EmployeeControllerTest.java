package com.pack.test;

import static org.mockito.Mockito.verifyZeroInteractions;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.view;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertEquals;
import static org.hamcrest.Matchers.hasProperty;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.internal.matchers.InstanceOf;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

 

import com.pack.controller.EmployeeController;
import com.pack.model.Employee;
import com.pack.service.EmployeeService;

 

 

@RunWith(SpringJUnit4ClassRunner.class)//indicates that the class should use Spring JUnit facilities
@ContextConfiguration(locations= {"classpath:test-servlet.xml"})//indicates which xml file contains all application context or all bean information
@WebAppConfiguration
public class EmployeeControllerTest {
    
    @InjectMocks
    EmployeeController employeeController;
    
    @Mock
    EmployeeService employeeService;
    
    private MockMvc mockMvc;
    
    
    @Before 
    public void setup() {
        MockitoAnnotations.initMocks(this);
        mockMvc=MockMvcBuilders.standaloneSetup(employeeController).build();
    }
    
    @Test
    public void testEmployeeRegistrationPage() throws Exception {
        mockMvc.perform(get("/"))
                        .andExpect(status().isOk())
                        .andExpect(view().name("EmployeeRegister"))
                        .andExpect(model().attribute("employeeForm",new InstanceOf(Employee.class)));
        verifyZeroInteractions(employeeService);
    }
    
    @Test
    public void testSaveEmployee() throws Exception {
        Date d=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String sdoj=sdf.format(d);
        mockMvc.perform(post("/insertEmp")
                        //.param("employeeid","2")
                        .param("name","Ramesh1")
                        .param("age","25")
                        .param("address","Chennai")
                        .param("gender","male")
                        .param("doj",sdoj)
                        .param("email","ramesh1@gmail.com"))
                        .andExpect(status().is2xxSuccessful())
                        .andExpect(view().name("EmployeeSuccess"))
                        .andExpect(model().attribute("employeeForm",new InstanceOf(Employee.class)))
                        //.andExpect(model().attribute("employeeForm",hasProperty("employeeid",is(2))))
                        .andExpect(model().attribute("employeeForm",hasProperty("name",is("Ramesh1"))))
                        .andExpect(model().attribute("employeeForm",hasProperty("age",is(25))))
                        .andExpect(model().attribute("employeeForm",hasProperty("address",is("Chennai"))))
                        .andExpect(model().attribute("employeeForm",hasProperty("gender",is("male"))))
                        .andExpect(model().attribute("employeeForm",hasProperty("doj",is(sdf.parse(sdoj)))))
                        .andExpect(model().attribute("employeeForm",hasProperty("email",is("ramesh1@gmail.com"))));
        
        ArgumentCaptor<Employee> argCap=ArgumentCaptor.forClass(Employee.class);
        Mockito.verify(employeeService).insertEmployee(argCap.capture());
        assertEquals("Ramesh1",argCap.getValue().getName());
                        
    }
    
    /*@Test
    public void testSaveEmployeeWithValidationError() throws Exception {
        Date d=new Date();
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
        String sdoj=sdf.format(d);
        mockMvc.perform(post("/insertEmp")
                .param("name","Ramesh111")
                .param("age","25")
                .param("address","Chennai")
                .param("gender","male")
                .param("doj",sdoj)
                .param("email","ramesh111@gmail.com"))
                .andExpect(status().is2xxSuccessful())
                .andExpect(view().name("EmployeeRegister"));
        
        ArgumentCaptor<Employee> argCap=ArgumentCaptor.forClass(Employee.class);
        verifyZeroInteractions(employeeService);
    }*/
    
    @Test
    public void testDeleteEmployee() throws Exception{
        mockMvc.perform(get("/deleteEmp/1"))
                .andExpect(view().name("EmployeeSuccess"));
        verify(employeeService,times(1)).deleteEmployee(1);
    }
    
    @Test
    public void testFetchEmployeeById() throws Exception{
        when(employeeService.fetchEmployeeById(1)).thenReturn(new Employee());
        mockMvc.perform(get("/fetchById/1"))
                .andExpect(status().isOk())
                .andExpect(view().name("EmployeeUpdate"))
                .andExpect(model().size(1))
                .andExpect(model().attributeExists("editForm"))
                .andExpect(model().attribute("editForm",new InstanceOf(Employee.class)));
    }
    
    @Test
    public void testUpdateEmployee() throws Exception{
        Employee e=new Employee(30,"Rajesh",24,"Chennai",new Date(),"male","raj@gmail.com");
        Mockito.when(employeeService.fetchEmployeeById(Mockito.anyInt())).thenReturn(e);
        ArgumentCaptor<Employee> argCap=ArgumentCaptor.forClass(Employee.class);
        e.setAddress("Delhi");
        employeeService.updateEmployee(e);
        Mockito.verify(employeeService).updateEmployee(argCap.capture());
        assertEquals("Delhi",argCap.getValue().getAddress());
        
    }
}