package servlet;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("*.do")
public class NewLifecycle extends HttpServlet {
        @PostConstruct
        public void myPostContstruct() {
                System.out.println("myPostConstruct");
        }
        
        @Override
        public void init() {
                System.out.println("init 호출!!");
        }
        
        @Override
        protected void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
                System.out.println("service 호출");
                super.service(req, res);
        }

        @Override
        protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
                System.out.println("doGet 호출");
                req.setAttribute("bts", "정국");
                req.getRequestDispatcher("/Lifecycle.jsp").forward(req, resp);
        }
        
        
        @Override
        public void destroy() {
                System.out.println("destroy 호출");
        }
        
        @PreDestroy
        public void myPreDestroy() {
                System.out.println("myPreDestroy 호출");
        }
}
