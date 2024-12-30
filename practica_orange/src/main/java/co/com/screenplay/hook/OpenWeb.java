package co.com.screenplay.hook;

import net.serenitybdd.core.environment.EnvironmentSpecificConfiguration;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.util.EnvironmentVariables;

import static co.com.screenplay.utils.Constans.WEB_URL;
import static net.serenitybdd.screenplay.Tasks.instrumented;

public class OpenWeb implements Task {

    private EnvironmentVariables environmentVariables;

    @Override
    public <T extends Actor> void performAs(T actor) {
        String pathwebUrl = EnvironmentSpecificConfiguration.from(environmentVariables).getProperty(WEB_URL);
        actor.attemptsTo(Open.url(pathwebUrl));

    }
    public static Performable broserURL(Object WEB_URL_MAP){
        return instrumented(OpenWeb.class);
    }
}