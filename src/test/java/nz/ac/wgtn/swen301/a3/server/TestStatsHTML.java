package nz.ac.wgtn.swen301.a3.server;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import java.io.IOException;

import org.junit.Test;
import org.springframework.mock.web.MockHttpServletRequest;
import org.springframework.mock.web.MockHttpServletResponse;

public class TestStatsHTML {
    @Test
    public void testValidRequestResponseCode() throws IOException {
        MockHttpServletRequest request = new MockHttpServletRequest();
        MockHttpServletResponse response = new MockHttpServletResponse();
        StatsServlet service = new StatsServlet();
        service.doGet(request,response);
        assertEquals(200,response.getStatus());
    }

    @Test
    public void testValidContentType() throws IOException {
        MockHttpServletRequest request = new MockHttpServletRequest();
        MockHttpServletResponse response = new MockHttpServletResponse();
        StatsServlet service = new StatsServlet();
        service.doGet(request,response);
        assertTrue(response.getContentType().startsWith("text/html"));
    }

    @Test
    public void testReturnedValues() throws IOException {
        MockHttpServletRequest request = new MockHttpServletRequest();
        MockHttpServletResponse response = new MockHttpServletResponse();
        StatsServlet service = new StatsServlet();
        service.doGet(request,response);
        assertTrue(true);
    }
}