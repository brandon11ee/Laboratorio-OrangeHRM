package swag.utils.dates;

import net.serenitybdd.annotations.Step;
import net.serenitybdd.annotations.Steps;
import net.serenitybdd.core.pages.PageObject;
public class WebSite {

    @Steps(shared = true)
    PageObject swag;

    @Step("navigate site web")
    public void navigateTo(String url){
        swag.setDefaultBaseUrl(url);
        swag.open();
    }
}
