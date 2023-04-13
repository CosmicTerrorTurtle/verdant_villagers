package io.github.cosmic_terror_turtle.verdant_villagers.util;

import io.github.cosmic_terror_turtle.verdant_villagers.VerdantVillagers;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {

        // Blocks that the village will never remove.
        public static final TagKey<Block> VILLAGE_UNTOUCHED_BLOCKS = createTag("village_untouched_blocks");
        // Blocks that are considered to be part of the natural ground like stone, dirt, terracotta, sand etc.
        public static final TagKey<Block> VILLAGE_GROUND_BLOCKS = createTag("village_ground_blocks");

        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(VerdantVillagers.MOD_ID, name));
        }

        private static TagKey<Block> createCommonTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier("c", name));
        }
    }

    public static class Items {

        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(VerdantVillagers.MOD_ID, name));
        }

        private static TagKey<Item> createCommonTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier("c", name));
        }
    }
}
