package online.phoenixcity.firmiana.enums.system;

import lombok.Getter;

@Getter
public enum MenuType {

    CATALOG(0, "目录"),
    MENU(1, "菜单"),
    BUTTON(2, "按钮");
    private final int value;
    private final String name;

    MenuType(int value, String name) {
        this.value = value;
        this.name = name;
    }
}
