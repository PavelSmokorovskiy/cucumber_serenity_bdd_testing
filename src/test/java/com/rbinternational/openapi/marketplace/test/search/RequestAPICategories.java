package com.rbinternational.openapi.marketplace.test.search;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;

import static net.serenitybdd.screenplay.Tasks.instrumented;


public class RequestAPICategories implements Task {


    public static RequestAPICategories getAPICategories(){
        return instrumented(RequestAPICategories.class);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                //BrowseTheWeb.as(theActor).findBy(pathTo(target))

        );
    }

    public RequestAPICategories() {
    }

}
