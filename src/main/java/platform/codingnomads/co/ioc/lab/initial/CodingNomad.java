package platform.codingnomads.co.ioc.lab.initial;

import lombok.RequiredArgsConstructor;
import net.minidev.json.JSONUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.text.MessageFormat;

@Component
@RequiredArgsConstructor()
public class CodingNomad {
    private final JDK jdk;
    private final IDE ide;
    private final Framework framework;
    @Autowired
    public Computer computer;
    public Laptop laptop;

    public String createAwesomeSoftware(){
        return MessageFormat
                .format("This code nomad is created awesome software using, "+ "IDE: ({0}:{1}, JDK: ({2}:{3}), Framework: ({4}:{5}), Laptop: ({6}:{7}), Computer:({8}:{9}))",
                        ide.getName(),
                        ide.getVersion(),
                        jdk.getName(),
                        jdk.getVersion(),
                        framework.getName(),
                        framework.getVersion(),
                        getLaptop().getName(),
                        getLaptop().getVersion(),
                        computer.getName(),
                        computer.getVersion()

                );

    }
    @Autowired
    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }

    public Laptop getLaptop() {
        return laptop;
    }
}
