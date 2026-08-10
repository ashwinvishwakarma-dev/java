package design_pattern.creational;

public class AbstractFactory {
    public static void main(String[] args) {

        ThemeFactory themeFactory = new LightThemeFactory();

        Button button = themeFactory.createButton();
        CheckBox checkBox = themeFactory.createCheckBox();

        button.submit();
        checkBox.check();


    }
}

interface Button {
    void submit();
}

interface CheckBox {
    void check();
}

class LightButton implements Button {
    @Override
    public void submit() {
        System.out.println("Light Button");
    }
}

class LightCheckBox implements CheckBox {
    @Override
    public void check() {
        System.out.println("Light CheckBox");
    }
}

class DarkButton implements Button {
    @Override
    public void submit() {
        System.out.println("Dark Button");
    }
}

class DarkCheckBox implements CheckBox {
    @Override
    public void check() {
        System.out.println("Dark CheckBox");
    }
}

interface ThemeFactory {
    Button createButton();
    CheckBox createCheckBox();
}

class DarkThemeFactory implements ThemeFactory {

    @Override
    public Button createButton() {
        return new DarkButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new DarkCheckBox();
    }
}

class LightThemeFactory implements ThemeFactory {

    @Override
    public Button createButton() {
        return new LightButton();
    }

    @Override
    public CheckBox createCheckBox() {
        return new LightCheckBox();
    }
}
