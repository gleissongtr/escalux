package br.com.glsystem.escalux.config;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.Ordered;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

@Component
@Order(Ordered.HIGHEST_PRECEDENCE)
public class SecurityRequestFilter implements Filter {

    private static final String HTTP_OPTIONS = "OPTIONS";
    private Logger log = LoggerFactory.getLogger(SecurityRequestFilter.class);

    @Override
	public void doFilter(ServletRequest req, ServletResponse res, FilterChain chain) {
        HttpServletResponse response = (HttpServletResponse) res;
        HttpServletRequest request = (HttpServletRequest) req;

        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setHeader("Access-Control-Allow-Methods", "POST, PUT, GET, OPTIONS, DELETE");
        response.setHeader("Access-Control-Allow-Headers", "x-requested-with");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Credentials", "true");

        if (!(request.getMethod().equalsIgnoreCase(HTTP_OPTIONS))) {
            try {
                chain.doFilter(req, res);
            } catch(Exception e) {
            	log.error(e.getMessage(),e);
            }
        } else {
            response.setHeader("Access-Control-Allow-Methods", "POST,PUT,GET,DELETE");
            response.setHeader("Access-Control-Max-Age", "3600");
            response.setHeader("Access-Control-Allow-Headers", "authorization, content-type," +
                    "access-control-request-headers,access-control-request-method,accept,origin,authorization,x-requested-with,usuario,senha");
            response.setStatus(HttpServletResponse.SC_OK);
        }

    }

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		log.info("Init SecurityRequestFilter");
	}

	@Override
	public void destroy() {
		log.info("Destroy SecurityRequestFilter");
	}

}
