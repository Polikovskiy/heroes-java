Войска.

Базовые типы юнитов:
- Unit: Абстрактный воин специализирующийся на нанесении физического урона
- SpellCaster: Абстрактный воин специализирующийся на нанесении магического урона

Вполне логично, что все юниты, наносящие магический урон способны наносить и физический. Физический урон, который наносит SpellCaster должен быть небольшим, так же SpellCaster имеет меньшее, по сравнению с Unit, количество очков здоровья.

Юниты, наносящие физический урон:
- Soldier [Солдат] : юнит без всяких специальных возможностей
- Rogue [Разбойник] : разбойника невозможно контратаковать
- Berserker [Берсерк] : на берсеркера не действует магия
- Vampire [Вампир] : при атаке / контратаке потребляет часть жизненных сил противника
- Werewolf [Оборотень] : умеет превращаться в волка (в состоянии волка имеет более высокий показатель жизненных сил и атаки, но получает больший урон от магии)

Юниты, способные к магии:
- Wizard [Волшебник] : атакует боевыми заклинаниями (лечебные заклинания имеют только половину силы)
- Healer [Целитель] : владеет целебными заклинаниями (боевые заклинания имеют только половину силы)
- Priest [Священник] : владеет целебными заклинаниями (боевые заклинания имеют только половину силы), наносит x2 урон нежити (Vampire, Necromancer)
- Warlock [Чернокнижник] : призывает демонов (класс Demon немного расширяет класс Soldier)
- Necromancer [Некромант] : следит за всеми кого атаковал, в случае смерти атакованого юнита, получает часть его жизненных сил

Интерфейсы:
- Observer [наблюдатель] : пригодится для Necromancer
- Observable [наблюдаемое] : пригодится для всех остальных

Напрячь мозг и:
- Вынести механику атаки в виде отдельных классов
- Вынести заклинания в виде отдельных классов
- Вынести состояния юнитов в виде отдельных классов

- Придумать внятную систему разделения боевых магов и целителей
- Придумать внятную систему маркировки нежити

- Разделить урон на физический и магический
- Реализовать волшебникам книгу заклинаний (std::map и enum вам в этом помогут)
- Структурировать исходный код

Дополнительные возможности:
- Вампир может сделать вампиром другого юнита (исключение Werewolf)
- Оборотень может сделать оборотнем другого юнита (исключение Vampire)