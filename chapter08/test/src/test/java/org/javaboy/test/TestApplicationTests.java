package org.javaboy.test;

import org.javaboy.test.dao.UserDao;
import org.javaboy.test.model.User;
import org.javaboy.test.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MockMvcBuilder;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * webEnvironment：指定 web 应用环境：
 *
 * - MOCK
 * - RANDOM_PORT
 * - DEFINED_PORT
 * - NONE
 *
 * classes：指定应用启动类
 */
@SpringBootTest()
class TestApplicationTests {

    @Autowired
    WebApplicationContext webApplicationContext;
    MockMvc mockMvc;
    @BeforeEach
    void setUp() {
//        mockMvc = MockMvcBuilders.webAppContextSetup(webApplicationContext).build();
        mockMvc = MockMvcBuilders.standaloneSetup(new UserController()).build();
    }
    @Test
    void contextLoads() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/user/99").accept(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("{\"id\":99,\"username\":\"javaboy\"}"))
                .andDo(MockMvcResultHandlers.print());
    }

    @MockBean
    UserDao userDao;
    @Autowired
    UserService userService;
    @Test
    void test1() {
        User user = new User();
        user.setId(99L);
        user.setUsername("javaboy");
        Mockito.when(userDao.getUserById(99L)).thenReturn(user);

        User u = userService.getUserById(99L);
        Assertions.assertEquals(99L,u.getId());
        Assertions.assertEquals("javaboy", u.getUsername());
    }
}
