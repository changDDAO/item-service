package com.changddao.itemservice.domain.item;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.*;

class ItemRepositoryTest {
    ItemRepository itemRepository = new ItemRepository();

    @AfterEach
    void clearStore() {
        itemRepository.clearStore();
    }

    @Test
    void 아이템_등록() {
        //given
        Item item = new Item("itemA", 10000, 10);
        //when
        itemRepository.save(item);
        //that
        assertThat(itemRepository.findById(item.getId())).isEqualTo(item);
        List<Item> all = itemRepository.findAll();
        assertThat(all.get(0)).isEqualTo(item);
    }

    @Test
    void 전체_아이템_목록() {
        //given
        Item item1 = new Item("itemA", 10000, 10);
        Item item2 = new Item("itemB", 20000, 20);
        itemRepository.save(item1);
        itemRepository.save(item2);
        //when
        List<Item> findItems = itemRepository.findAll();
        //that
        assertThat(findItems.size()).isEqualTo(2);
        assertThat(findItems).containsExactly(item1, item2);
    }

    @Test
    void 특정_아이템_업데이트() {
        //given

        //when

        //that
    }

}