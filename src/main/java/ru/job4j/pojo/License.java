package ru.job4j.pojo;

import java.util.Date;

/**
 * @Раздел Блок 2. ООП / 3. Инкапсуляция
 * @Задание 2. Модель данных. [174683#271560]
 * @Описание 1. Практика создания моделей данных на примере лицензии для машин (по описанию к задаче)
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 21.05.2021
 * @version 1
 */

public class License {
    private String owner; //владелец
    private String model; //марка машины
    private String code;  //номер машины
    private Date created; //дата сборки

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Date getCreated() {
        return created;
    }

    public void setCreated(Date created) {
        this.created = created;
    }
}