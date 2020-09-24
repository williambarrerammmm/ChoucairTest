package com.choucair.certification.newexperience.questions;

import com.choucair.certification.newexperience.models.ApplicationInformation;
import com.choucair.certification.newexperience.userinterface.App;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.questions.Text;

import static net.serenitybdd.screenplay.questions.ValueOf.the;

public class Application implements Question<ApplicationInformation>{
	
	@Override
    public ApplicationInformation answeredBy(Actor actor) {
        String title = BrowseTheWeb.as(actor).getTitle();
        String heading = the(Text.of(App.MAIN_HEADING).viewedBy(actor));
        String aboutInformation = the(Text.of(App.FOOTER).viewedBy(actor));

        return new ApplicationInformation(title, heading, aboutInformation);
    }

    public static Application information() {
        return new Application();
    }

}
