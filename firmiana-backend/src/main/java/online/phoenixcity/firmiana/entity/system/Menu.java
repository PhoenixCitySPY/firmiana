package online.phoenixcity.firmiana.entity.system;

import jakarta.persistence.*;
import lombok.Data;
import online.phoenixcity.firmiana.enums.system.MenuType;

@Entity
@Table(name = "sys_menu")
@Data
public class Menu {
    // 主键，自动生成
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    // 菜单名称，最大长度50，非空
    @Column(name = "name", length = 50, nullable = false)
    private String name;

    // 父菜单ID，指向父级菜单的ID
    @Column(name = "pid")
    private Integer pid;

    // 菜单类型，使用枚举表示，0=目录, 1=菜单, 2=按钮
    @Enumerated(EnumType.STRING)
    @Column(name = "type", length = 20, nullable = false)
    private MenuType type;

    // 菜单图标，最大长度50
    @Column(name = "icon", length = 50)
    private String icon;

    // 是否外链，1表示是外链，0表示不是
    @Column(name = "is_link")
    private Boolean isLink;

    // 外链地址，最大长度500
    @Column(name = "link_url", length = 500)
    private String linkUrl;

    // 是否可见，1表示隐藏，0表示可见
    @Column(name = "hidden")
    private Boolean hidden;

    // 路由地址，最大长度500
    @Column(name = "path", length = 500)
    private String path;

    // 前端组件地址，最大长度200
    @Column(name = "component", length = 200)
    private String component;

    // 菜单排序号，用于菜单显示顺序
    @Column(name = "sort")
    private Integer sort;

    // 是否缓存，1表示启用缓存，0表示不启用
    @Column(name = "cache")
    private Boolean cache;

}
