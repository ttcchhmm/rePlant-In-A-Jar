package io.github.coolmineman.plantinajar.compat;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import net.fabricmc.loader.api.FabricLoader;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.RegistryKey;

public class CompatManager {
    private static final List<Compat> compats = new ArrayList<>();

    public static void init() {
        compats.clear();
        if (FabricLoader.getInstance().isModLoaded("byg")) {
            compats.add(new EasyCompat()
                .addTree("byg:aspen_sapling", "byg:aspen_log", "byg:aspen_leaves")
                .addTree("byg:baobab_sapling", "byg:baobab_log", "byg:baobab_leaves")
                .addTree("byg:blue_enchanted_sapling", "byg:blue_enchanted_log", "byg:blue_enchanted_leaves")
                .addTree("byg:blue_spruce_sapling", "minecraft:spruce_log", "byg:blue_spruce_leaves")
                .addTree("byg:brown_birch_sapling", "minecraft:birch_log", "byg:brown_birch_leaves")
                .addTree("byg:brown_oak_sapling", "minecraft:oak_log", "byg:brown_oak_leaves")
                .addTree("byg:cika_sapling", "byg:cika_log", "byg:cika_leaves")
                .addTree("byg:cypress_sapling", "byg:cypress_log", "byg:cypress_leaves")
                .addTree("byg:ebony_sapling", "byg:ebony_log", "byg:ebony_leaves")
                .addTree("byg:fir_sapling", "byg:fir_log", "byg:fir_leaves")
                .addTree("byg:green_enchanted_sapling", "byg:green_enchanted_log", "byg:green_enchanted_leaves")
                .addTree("byg:holly_sapling", "byg:holly_log", "byg:holly_berry_leaves")
                .addTree("byg:jacaranda_sapling", "byg:jacaranda_log", "byg:jacaranda_leaves")
                .addTree("byg:indigo_jacaranda_sapling", "byg:jacaranda_log", "byg:indigo_jacaranda_leaves")
                .addTree("byg:joshua_sapling", "minecraft:oak_log", "byg:ripe_joshua_leaves")
                .addTree("byg:mahogany_sapling", "byg:mahogany_log", "byg:mahogany_leaves")
                .addTree("byg:mangrove_sapling", "byg:mangrove_log", "byg:mangrove_leaves")
                .addTree("byg:maple_sapling", "byg:maple_log", "byg:maple_leaves")
                .addTree("byg:orange_birch_sapling", "minecraft:birch_log", "byg:orange_birch_leaves")
                .addTree("byg:orange_oak_sapling", "minecraft:oak_log", "byg:orange_oak_leaves")
                .addTree("byg:orange_spruce_sapling", "minecraft:spruce_log", "byg:orange_spruce_leaves")
                .addTree("byg:orchard_sapling", "minecraft:oak_log", "byg:orchard_leaves")
                .addTree("byg:palo_verde_sapling", "byg:palo_verde_log", "byg:palo_verde_leaves")
                .addTree("byg:pine_sapling", "byg:pine_log", "byg:pine_leaves")
                .addTree("byg:pink_cherry_sapling", "byg:cherry_log", "byg:pink_cherry_leaves")
                .addTree("byg:rainbow_eucalyptus_sapling", "byg:rainbow_eucalyptus_log", "byg:rainbow_eucalyptus_leaves")
                .addTree("byg:red_birch_sapling", "minecraft:birch_log", "byg:red_birch_leaves")
                .addTree("byg:red_maple_sapling", "byg:maple_log", "byg:red_maple_leaves")
                .addTree("byg:red_oak_sapling", "minecraft:oak_log", "byg:red_oak_leaves")
                .addTree("byg:red_spruce_sapling", "minecraft:spruce_log", "byg:red_spruce_leaves")
                .addTree("byg:redwood_sapling", "byg:redwood_log", "byg:redwood_leaves")
                .addTree("byg:silver_maple_sapling", "byg:maple_log", "byg:silver_maple_leaves")
                .addTree("byg:skyris_sapling", "byg:skyris_log", "byg:green_apple_skyris_leaves")
                .addTree("byg:white_cherry_sapling", "byg:cherry_log", "byg:white_cherry_leaves")
                .addTree("byg:willow_sapling", "byg:willow_log", "byg:willow_leaves")
                .addTree("byg:witch_hazel_sapling", "byg:witch_hazel_log", "byg:witch_hazel_leaves")
                .addTree("byg:yellow_birch_sapling", "minecraft:birch_log", "byg:yellow_birch_leaves")
                .addTree("byg:yellow_spruce_sapling", "minecraft:spruce_log", "byg:yellow_spruce_leaves")
                .addTree("byg:zelkova_sapling", "byg:zelkova_log", "byg:zelkova_leaves")
            );
        }
        if (FabricLoader.getInstance().isModLoaded("ferroustry")) {
            EasyCompat ferroustryCompat = new EasyCompat();
            String[] materials = {
                "copper",
                "coal",
                "gold",
                "redstone",
                "lead",
                "lapis",
                "tin",
                "aluminum",
                "iron",
                "silver",
                "diamond",
                "emerald",
                "quartz",
                "bismuth"
            };
            for (String material : materials) {
                ferroustryCompat.addTree("ferroustry:" + material + "_sapling", "ferroustry:" + material + "_log", "ferroustry:" + material + "_leaves");
            }
            compats.add(ferroustryCompat);
        }

        if (FabricLoader.getInstance().isModLoaded("betterend")) {
            compats.add(new EasyCompat()
                .addTree("betterend:mossy_glowshroom_sapling", "betterend:mossy_glowshroom_log", "betterend:mossy_glowshroom_cap")
                .addTree("betterend:pythadendron_sapling", "betterend:pythadendron_log", "betterend:pythadendron_leaves")
                .addTree("betterend:lacugrove_sapling", "betterend:lacugrove_log", "betterend:lacugrove_leaves")
                .addTree("betterend:dragon_tree_sapling", "betterend:dragon_tree_log", "betterend:dragon_tree_leaves")
                .addTree("betterend:tenanea_sapling", "betterend:tenanea_log", "betterend:tenanea_leaves")
                .addTree("betterend:helix_tree_sapling", "betterend:helix_tree_log", "betterend:helix_tree_leaves")
                .addTree("betterend:umbrella_tree_sapling", "betterend:umbrella_tree_log", "betterend:umbrella_tree_membrane")
                .addTree("betterend:hydralux_sapling", "betterend:hydralux_petal_block", "betterend:hydralux_petal")
            );
        }
        if (FabricLoader.getInstance().isModLoaded("betternether")) {
            compats.add(new EasyCompat()
                .addTree("betternether:willow_sapling", "betternether:willow_log", "betternether:willow_leaves")
                .addTree("betternether:mushroom_fir_sapling", "betternether:mushroom_fir_stem", "minecraft:air")
                .addTree("betternether:rubeus_sapling", "betternether:rubeus_log", "betternether:rubeus_leaves")
                .addTree("betternether:anchor_tree_sapling", "betternether:anchor_tree_log", "betternether:anchor_tree_leaves")
                .addTree("betternether:stalagnate_seed", "betternether:stalagnate_stem", "minecraft:air")
                .addTree("betternether:wart_seed", "betternether:wart_log", "minecraft_air")
                .addTree("betternether:nether_sakura_sapling", "betternether:nether_sakura_log", "betternether:nether_sakura_leaves")
            );
        }
        if (FabricLoader.getInstance().isModLoaded("sakurarosea")) {
            compats.add(new EasyCompat()
                .addTree("sakurarosea:sakura_sapling", "sakurarosea:sakura_log", "sakurarosea:sakura_leaves")
            );
        }
    }

    public static BlockState getTreeBlockWood(BlockState sappling) {
        for (Compat c : compats) {
            BlockState a = c.getTreeBlockWood(sappling);
            if (a != null) return a;
        }
        return null;
    }

    public static BlockState getTreeBlockLeaf(BlockState sappling) {
        for (Compat c : compats) {
            BlockState a = c.getTreeBlockLeaf(sappling);
            if (a != null) return a;
        }
        return null;
    }

    public static List<ItemStack> getExtraDrops(ItemStack plant) {
        ArrayList<ItemStack> result = new ArrayList<>();
        for (Compat c : compats) {
            for (ItemStack i : c.getExtraDrops(plant)) {
                result.add(i);
            }
        }
        return result;
    }  

    public static Optional<Boolean> isTree(BlockState plant) {
        for (Compat c : compats) {
            Optional<Boolean> b = c.isTree(plant);
            if (b.isPresent()) return b;
        }
        return Optional.empty();
    }

    public void addCompat(Compat c) {
        compats.add(c);
    }

    private CompatManager(){}
}