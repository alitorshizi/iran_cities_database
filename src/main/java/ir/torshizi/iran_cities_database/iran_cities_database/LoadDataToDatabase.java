package ir.torshizi.iran_cities_database.iran_cities_database;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.core.io.ClassPathResource;
import org.springframework.jdbc.datasource.init.ResourceDatabasePopulator;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;

@Component
public class LoadDataToDatabase {
    @Autowired
    private DataSource dataSource;

    @EventListener(ApplicationReadyEvent.class)
    public void loadData() {
        ResourceDatabasePopulator iran = new ResourceDatabasePopulator(false, false, "UTF-8", new ClassPathResource("static/iran_cities_database/Province.sql"));
        iran.addScript(new ClassPathResource("static/iran_cities_database/Township.sql"));
        iran.addScript(new ClassPathResource("static/iran_cities_database/County.sql"));
        iran.addScript(new ClassPathResource("static/iran_cities_database/City.sql"));
        //iran.addScript(new ClassPathResource("static/County_3.sql"));
        iran.execute(dataSource);
    }
}
