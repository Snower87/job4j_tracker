package ru.job4j.pojo;

import java.util.Date;
import java.util.Objects;

/**
 * @Раздел Блок 2. ООП / 3. Инкапсуляция
 * @Задание 2. Модель данных. [174683#271560] (ver.1)
 * @Описание 1. Практика создания моделей данных на примере лицензии для машин (по описанию к задаче)
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 *
 * @Раздел Блок 2. ООП / 3. Инкапсуляция
 * @Задание 4. Сравнение моделей. Метод equals. [174893#271562] (ver.2)
 * @Описание 1. Практика создания моделей данных на примере лицензии для машин (по описанию к задаче)
 * 2. Загрузите код в github. Оставьте ссылку на коммит.
 * @author Sergei Begletsov
 * @since 21.05.2021
 * @version 2
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

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        License license = (License) o;
        return Objects.equals(owner, license.owner) &&
                Objects.equals(model, license.model) &&
                Objects.equals(code, license.code) &&
                Objects.equals(created, license.created);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, model, code, created);
    }
}