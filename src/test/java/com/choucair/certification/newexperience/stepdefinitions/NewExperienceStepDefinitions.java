package com.choucair.certification.newexperience.stepdefinitions;

import java.util.List;

import org.junit.Before;
import org.openqa.selenium.WebDriver;

import com.choucair.certification.newexperience.questions.TheItems;
import com.choucair.certification.newexperience.tasks.AddAItem;
import com.choucair.certification.newexperience.tasks.DeleteAnItem;
import com.choucair.certification.newexperience.tasks.FilterItems;
import com.choucair.certification.newexperience.tasks.Start;

import cucumber.api.java.BeforeStep;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.demos.todos.cucumber.MissingTodoItemsException;
import net.thucydides.core.annotations.Managed;

import static java.util.Collections.EMPTY_LIST;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static org.hamcrest.Matchers.hasItem;
import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class NewExperienceStepDefinitions {
	@Managed(driver="chrome")
	private WebDriver driver;
	private Actor actor = Actor.named("Actor");
	
	@Before
	public void setUp() {
		actor.can(BrowseTheWeb.with(driver));
	}

	    @Given("that {actor} has an empty todo list")
	    public void that_James_has_an_empty_todo_list(Actor actor) {
	        actor.wasAbleTo(Start.openPage());
	    }

	    @When("{actor} adds {string} to his/her list")
	    public void adds_to_his_list(Actor actor, String item) {
	        actor.attemptsTo(AddAItem.called(item));
	    }

	    @When("{actor} deletes the item called {string}")
	    public void deletes_an_item(Actor actor, String item) {
	        actor.attemptsTo(DeleteAnItem.called(item));
	    }

	    @Then("{string} should be recorded in his/her cart")
	    public void item_should_be_recorded_in_the_list(String expectedItem) {
	        theActorInTheSpotlight().should(seeThat(TheItems.displayed(), hasItem(expectedItem))
	                .orComplainWith(MissingTodoItemsException.class, "Missing todo " + expectedItem));
	    }

	    @Then("{actor}'s todo list should contain {items}")
	    public void a_users_todo_list_should_contain(Actor actor, List<String> expectedItems) {
	        actor.should(seeThat(TheItems.displayed(), equals(expectedItems))
	                .orComplainWith(MissingTodoItemsException.class, "Missing todos " + expectedItems));
	    }


	    @Then("his/her todo list should be empty")
	    public void todo_list_should_be_empty() {
	        theActorInTheSpotlight().should(seeThat(TheItems.displayed(), equals(EMPTY_LIST)));
	    }

	    @Then("^s?he (?:completes|has completed) the task called '(.*)'$")
	    public void completes_task_called(String item) {
	        theActorInTheSpotlight().attemptsTo(
	                SelectItem.called(item)
	        );
	    }


	

}
