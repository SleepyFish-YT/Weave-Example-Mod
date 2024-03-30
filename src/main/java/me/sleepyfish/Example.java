package me.sleepyfish;

import net.minecraft.client.Minecraft;

public class Example {

    public static Example instance = new Example();
    
    private String name;
    private String author;
    private double version;

    public Minecraft mc;
    
    public void inject() {
        this.name = "Example Client";
        this.author = "SleepyFish";
        this.version = 1.0D;

        this.mc = Minecraft.getMinecraft();
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    public double getVersion() {
        return version;
    }
}