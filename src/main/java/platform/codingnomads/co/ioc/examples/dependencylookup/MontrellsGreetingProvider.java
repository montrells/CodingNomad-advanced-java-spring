package platform.codingnomads.co.ioc.examples.dependencylookup;

public class MontrellsGreetingProvider implements GreetingProvider {
    @Override
    public String getGreeting() {
        return "Hello CodingNomads its Montrell!!!!";
    }
}
