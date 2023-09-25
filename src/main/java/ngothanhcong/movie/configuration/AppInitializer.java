package ngothanhcong.movie.configuration;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;



public class AppInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	 
		@Override
		protected Class<?>[] getRootConfigClasses() {
			return new Class[] { PersistenceJPAConfig.class, WebSecurityConfig.class};
			//return null;
		}
	 
		@Override
		protected Class<?>[] getServletConfigClasses() {
			return new Class[] { WebMvcConfig.class };
		}
	 
		@Override
		protected String[] getServletMappings() {
			return new String[] { "/" };
		} 

}
