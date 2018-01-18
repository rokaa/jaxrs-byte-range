package kz.astana.roka;

import to.lova.jaxrs.filter.RangeResponseFilter;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by rone on 1/18/18.
 */
@ApplicationPath("app")
public class MyApplication extends Application {


    @Override
    public Set<Class<?>> getClasses() {
        final Set<Class<?>> classes = new HashSet<>();

        classes.add(HelloWorldService.class);
        classes.add(RangeResponseFilter.class);

        return classes;
    }

}
