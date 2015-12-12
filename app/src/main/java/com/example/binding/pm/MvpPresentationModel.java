package com.example.binding.pm;

import org.robobinding.presentationmodel.HasPresentationModelChangeSupport;
import org.robobinding.presentationmodel.PresentationModelChangeSupport;

/**
 * Created by chenrong on 15/12/11.
 */
@org.robobinding.annotation.PresentationModel
public class MvpPresentationModel implements HasPresentationModelChangeSupport {
    private PresentationModelChangeSupport changeSupport;
    private String name;

    public MvpPresentationModel() {
        changeSupport = new PresentationModelChangeSupport(this);
    }

    public String getHello() {
        return name + ": hello Android MVVM(Presentation Model)!";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        changeSupport.firePropertyChange("hello");
    }

    @Override
    public PresentationModelChangeSupport getPresentationModelChangeSupport() {
        return changeSupport;
    }
}
