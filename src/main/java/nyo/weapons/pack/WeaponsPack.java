package nyo.weapons.pack;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
import net.minecraft.util.registry.Registry;
import nyo.weapons.pack.item.blade;
import nyo.weapons.pack.item.bo_staff;
import nyo.weapons.pack.item.deathsinger_sword;
import nyo.weapons.pack.item.diamond_scythe;
import nyo.weapons.pack.item.diamond_spear;
import nyo.weapons.pack.item.diamond_staff;
import nyo.weapons.pack.item.diamond_sword;
import nyo.weapons.pack.item.double_blade;
import nyo.weapons.pack.item.gold_spear;
import nyo.weapons.pack.item.iron_scythe;
import nyo.weapons.pack.item.iron_spear;
import nyo.weapons.pack.item.iron_sword;
import nyo.weapons.pack.item.special;
import nyo.weapons.pack.item.stone;
import nyo.weapons.pack.item.tidesinger_staff;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemStack;
import net.minecraft.item.SwordItem;
import net.minecraft.item.ToolItem;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

//Credit where credit is due, I did not create ANY art for this (although i edited some textures slightly) and all the
//textures are from Songs Of War by Black Plasma Studios https://www.youtube.com/watch?v=yCNUP2NAt-A its very good please watch, 
//Terraria (by ReLogic) or from the site NovaSkin, although things get passed around a lot on there like the
//crucible sword and lightsaber textures idk who is the original owner, if they have any problems let me know :)

//this is the first mod i've made so please excuse me for any errors or slipups, i designed Weapons Pack for a private
//server so it's not incredible or anything lol

//oh and don't expect too many updates since i dont even know how to update it.. although i guess i can learn if there is demand XD

public class WeaponsPack implements ModInitializer {

	public static final Logger LOGGER = LoggerFactory.getLogger("weaponspack");

	public static final Item GROUPICON = new Item(new Item.Settings());
	public static final Item SPECIALICON = new Item(new Item.Settings());


	public static final ItemGroup GROUP = FabricItemGroupBuilder.build(new Identifier("weaponspack", "group"), () -> new ItemStack(GROUPICON));
	public static final ItemGroup SPECIAL = FabricItemGroupBuilder.build(new Identifier("weaponspack", "special"), () -> new ItemStack(SPECIALICON));

    public static final Identifier ID(String path) {
        return new Identifier("group", path);
    }

	public static final Identifier ID2(String path) {
        return new Identifier("special", path);
    }

	public static final Item QUARTER_DIAMOND = new Item(new Item.Settings().group(GROUP));
	public static final ToolItem TIDESINGER_STAFF = new SwordItem(tidesinger_staff.INSTANCE, 5, -1.9F, new Item.Settings().rarity(Rarity.UNCOMMON).group(GROUP));
	public static final ToolItem DOUBLE_BLADED_SWORD = new SwordItem(double_blade.INSTANCE, 4, -2.1F, new Item.Settings().group(GROUP));
	public static final ToolItem DOUBLE_ENDED_STAFF = new SwordItem(double_blade.INSTANCE, 5, -2.6F, new Item.Settings().group(GROUP));
	public static final ToolItem BO_STAFF = new SwordItem(bo_staff.INSTANCE, 3, -1.9F, new Item.Settings().group(GROUP));
	public static final ToolItem DEATHSINGER_SWORD = new SwordItem(deathsinger_sword.INSTANCE, 9, -2.75F, new Item.Settings().rarity(Rarity.UNCOMMON).group(GROUP));
	public static final ToolItem VOLTARIS_STAFF = new SwordItem(diamond_staff.INSTANCE, 6, -2.60F, new Item.Settings().rarity(Rarity.RARE).group(GROUP));
	public static final ToolItem KALTARIS_STAFF = new SwordItem(diamond_staff.INSTANCE, 7, -2.90F, new Item.Settings().rarity(Rarity.RARE).group(GROUP));
	public static final ToolItem MENDORIS_STAFF = new SwordItem(diamond_staff.INSTANCE, 5, -2.30F, new Item.Settings().rarity(Rarity.RARE).group(GROUP));
	public static final ToolItem NESTORIS_STAFF = new SwordItem(diamond_staff.INSTANCE, 4, -2.00F, new Item.Settings().rarity(Rarity.RARE).group(GROUP));
	public static final ToolItem SENDARIS_STAFF = new SwordItem(diamond_staff.INSTANCE, 5, -2.50F, new Item.Settings().rarity(Rarity.RARE).group(GROUP));
	public static final ToolItem DIAMOND_SCYTHE = new SwordItem(diamond_scythe.INSTANCE, 7, -2.30F, new Item.Settings().group(GROUP));
	public static final ToolItem IRON_SCYTHE = new SwordItem(iron_scythe.INSTANCE, 5, -2.30F, new Item.Settings().group(GROUP));
	public static final ToolItem DIAMOND_KATANA = new SwordItem(diamond_scythe.INSTANCE, 8, -2.65F, new Item.Settings().group(GROUP));
	public static final ToolItem IRON_KATANA = new SwordItem(iron_scythe.INSTANCE, 7, -2.75F, new Item.Settings().group(GROUP));
	public static final ToolItem SOUL_BLADE = new SwordItem(blade.INSTANCE, 9, -2.45F, new Item.Settings().fireproof().rarity(Rarity.EPIC).group(SPECIAL));
	public static final ToolItem NETHER_BLADE = new SwordItem(blade.INSTANCE, 9, -2.45F, new Item.Settings().fireproof().rarity(Rarity.EPIC).group(SPECIAL));
	public static final ToolItem ENDER_BLADE = new SwordItem(blade.INSTANCE, 9, -2.45F, new Item.Settings().fireproof().rarity(Rarity.EPIC).group(SPECIAL));

	public static final ToolItem TYGREN_SWORD = new SwordItem(iron_sword.INSTANCE, 5, -2.1F, new Item.Settings().group(GROUP));
	public static final ToolItem IRON_CLAYMORE = new SwordItem(iron_sword.INSTANCE, 8, -3F, new Item.Settings().group(GROUP));
	public static final ToolItem IRON_GUARD_SWORD = new SwordItem(iron_sword.INSTANCE, 7, -2.70F, new Item.Settings().group(GROUP));
	public static final ToolItem IRON_KUKURI = new SwordItem(iron_sword.INSTANCE, 5, -1.90F, new Item.Settings().group(GROUP));
	public static final ToolItem IRON_SCIMITAR = new SwordItem(iron_sword.INSTANCE, 6, -2.10F, new Item.Settings().group(GROUP));
	public static final ToolItem IRON_BROADSWORD = new SwordItem(iron_sword.INSTANCE, 7, -2.50F, new Item.Settings().group(GROUP));
	public static final ToolItem DIAMOND_BROADSWORD = new SwordItem(diamond_sword.INSTANCE, 8, -2.43F, new Item.Settings().group(GROUP));
	public static final ToolItem DIAMOND_CUTLASS = new SwordItem(diamond_sword.INSTANCE, 6, -2.30F, new Item.Settings().group(GROUP));
	public static final ToolItem THIN_DIAMOND_SWORD = new SwordItem(diamond_sword.INSTANCE, 7, -2.45F, new Item.Settings().group(GROUP));
	public static final ToolItem THIN_IRON_SWORD = new SwordItem(iron_sword.INSTANCE, 6, -2.45F, new Item.Settings().group(GROUP));

	public static final ToolItem HONORGUARD_GOLD_STAFF = new SwordItem(gold_spear.INSTANCE, 5, -2.70F, new Item.Settings().group(GROUP));
	public static final ToolItem HONORGUARD_IRON_STAFF = new SwordItem(iron_spear.INSTANCE, 6, -2.70F, new Item.Settings().group(GROUP));
	public static final ToolItem HONORGUARD_DIAMOND_STAFF = new SwordItem(diamond_spear.INSTANCE, 7, -2.65F, new Item.Settings().group(GROUP));
	public static final ToolItem IRON_GLAIVE = new SwordItem(iron_spear.INSTANCE, 5, -2.40F, new Item.Settings().group(GROUP));
	public static final ToolItem IRON_SPEAR = new SwordItem(iron_spear.INSTANCE, 6, -2.60F, new Item.Settings().group(GROUP));
	public static final ToolItem RIA_SPEAR = new SwordItem(iron_spear.INSTANCE, 7, -2.60F, new Item.Settings().group(GROUP));
	public static final ToolItem DIAMOND_SPEAR = new SwordItem(diamond_spear.INSTANCE, 7, -2.60F, new Item.Settings().group(GROUP));
	public static final ToolItem VOLTARIS_SPEAR = new SwordItem(diamond_spear.INSTANCE, 8, -2.60F, new Item.Settings().group(GROUP));
	public static final ToolItem IRON_HOOK = new SwordItem(iron_spear.INSTANCE, 6, -2.50F, new Item.Settings().group(GROUP));
	public static final ToolItem DIAMOND_HOOK = new SwordItem(diamond_spear.INSTANCE, 7, -2.50F, new Item.Settings().group(GROUP));
	public static final ToolItem IRON_FORKED_SPEAR = new SwordItem(iron_spear.INSTANCE, 7, -2.80F, new Item.Settings().group(GROUP));
	public static final ToolItem DIAMOND_FORKED_SPEAR = new SwordItem(diamond_spear.INSTANCE, 8, -2.80F, new Item.Settings().group(GROUP));
	public static final ToolItem IRON_ARDONI_SPEAR = new SwordItem(iron_spear.INSTANCE, 6, -2.70F, new Item.Settings().group(GROUP));
	public static final ToolItem DIAMOND_ARDONI_SPEAR = new SwordItem(diamond_spear.INSTANCE, 7, -2.70F, new Item.Settings().group(GROUP));
	
	public static final ToolItem STONE_HALBERD = new SwordItem(stone.INSTANCE, 4, -3F, new Item.Settings().group(GROUP));
	public static final ToolItem IRON_HALBERD = new SwordItem(iron_sword.INSTANCE, 6, -2.95F, new Item.Settings().group(GROUP));
	public static final ToolItem DIAMOND_HALBERD = new SwordItem(diamond_sword.INSTANCE, 7, -2.90F, new Item.Settings().group(GROUP));
	public static final ToolItem IRON_GREATAXE = new SwordItem(iron_sword.INSTANCE, 7, -2.75F, new Item.Settings().group(GROUP));
	public static final ToolItem IRON_BATTLEAXE = new SwordItem(iron_sword.INSTANCE, 7, -2.60F, new Item.Settings().group(GROUP));
	public static final ToolItem DIAMOND_BATTLEAXE = new SwordItem(diamond_sword.INSTANCE, 8, -2.60F, new Item.Settings().group(GROUP));

	public static final ToolItem HYPERION = new SwordItem(special.INSTANCE, 12, -2.45F, new Item.Settings().fireproof().rarity(Rarity.EPIC).group(SPECIAL));
	public static final ToolItem LIGHTSABER = new SwordItem(special.INSTANCE, 12, -2.45F, new Item.Settings().fireproof().rarity(Rarity.EPIC).group(SPECIAL));
	public static final ToolItem CRUCIBLE = new SwordItem(special.INSTANCE, 12, -2.60F, new Item.Settings().fireproof().rarity(Rarity.EPIC).group(SPECIAL));
	public static final ToolItem ZENITH = new SwordItem(special.INSTANCE, 14, -2.45F, new Item.Settings().fireproof().rarity(Rarity.EPIC).group(SPECIAL));
	public static final ToolItem TERRABLADE = new SwordItem(special.INSTANCE, 13, -2.45F, new Item.Settings().fireproof().rarity(Rarity.EPIC).group(SPECIAL));
	public static final ToolItem STARWRATH = new SwordItem(special.INSTANCE, 12, -2.45F, new Item.Settings().fireproof().rarity(Rarity.EPIC).group(SPECIAL));
	public static final ToolItem INFLUXWAVER = new SwordItem(special.INSTANCE, 12, -2.45F, new Item.Settings().fireproof().rarity(Rarity.EPIC).group(SPECIAL));
	public static final ToolItem NIGHTSEDGE = new SwordItem(special.INSTANCE, 12, -2.45F, new Item.Settings().fireproof().rarity(Rarity.EPIC).group(SPECIAL));
	public static final ToolItem MEOWMERE = new SwordItem(special.INSTANCE, 12, -2.45F, new Item.Settings().fireproof().rarity(Rarity.EPIC).group(SPECIAL));



	@Override
	public void onInitialize() {

		Registry.register(Registry.ITEM, new Identifier("weaponspack", "quarter_diamond"), QUARTER_DIAMOND);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "tidesinger_staff"), TIDESINGER_STAFF);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "groupicon"), GROUPICON);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "specialicon"), SPECIALICON);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "deathsinger_sword"), DEATHSINGER_SWORD);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "double_bladed_sword"), DOUBLE_BLADED_SWORD);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "double_ended_staff"), DOUBLE_ENDED_STAFF);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "bo_staff"), BO_STAFF);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "voltaris_staff"), VOLTARIS_STAFF);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "nestoris_staff"), NESTORIS_STAFF);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "mendoris_staff"), MENDORIS_STAFF);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "kaltaris_staff"), KALTARIS_STAFF);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "sendaris_staff"), SENDARIS_STAFF);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "diamond_scythe"), DIAMOND_SCYTHE);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "iron_scythe"), IRON_SCYTHE);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "diamond_katana"), DIAMOND_KATANA);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "iron_katana"), IRON_KATANA);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "soul_blade"), SOUL_BLADE);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "nether_blade"), NETHER_BLADE);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "ender_blade"), ENDER_BLADE);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "tygren_sword"), TYGREN_SWORD);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "iron_claymore"), IRON_CLAYMORE);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "iron_guard_sword"), IRON_GUARD_SWORD);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "iron_kukuri"), IRON_KUKURI);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "iron_scimitar"), IRON_SCIMITAR);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "iron_broadsword"), IRON_BROADSWORD);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "diamond_broadsword"), DIAMOND_BROADSWORD);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "diamond_cutlass"), DIAMOND_CUTLASS);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "thin_diamond_sword"), THIN_DIAMOND_SWORD);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "thin_iron_sword"), THIN_IRON_SWORD);

		Registry.register(Registry.ITEM, new Identifier("weaponspack", "honorguard_gold_staff"), HONORGUARD_GOLD_STAFF);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "honorguard_iron_staff"), HONORGUARD_IRON_STAFF);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "honorguard_diamond_staff"), HONORGUARD_DIAMOND_STAFF);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "iron_glaive"), IRON_GLAIVE);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "iron_spear"), IRON_SPEAR);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "ria_spear"), RIA_SPEAR);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "voltaris_spear"), VOLTARIS_SPEAR);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "diamond_spear"), DIAMOND_SPEAR);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "iron_hook"), IRON_HOOK);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "diamond_hook"), DIAMOND_HOOK);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "iron_forked_spear"), IRON_FORKED_SPEAR);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "diamond_forked_spear"), DIAMOND_FORKED_SPEAR);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "iron_ardoni_spear"), IRON_ARDONI_SPEAR);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "diamond_ardoni_spear"), DIAMOND_ARDONI_SPEAR);

		Registry.register(Registry.ITEM, new Identifier("weaponspack", "stone_halberd"), STONE_HALBERD);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "iron_halberd"), IRON_HALBERD);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "diamond_halberd"), DIAMOND_HALBERD);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "iron_greataxe"), IRON_GREATAXE);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "iron_battleaxe"), IRON_BATTLEAXE);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "diamond_battleaxe"), DIAMOND_BATTLEAXE);

		Registry.register(Registry.ITEM, new Identifier("weaponspack", "hyperion"), HYPERION);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "lightsaber"), LIGHTSABER);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "crucible"), CRUCIBLE);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "zenith"), ZENITH);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "terrablade"), TERRABLADE);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "starwrath"), STARWRATH);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "influxwaver"), INFLUXWAVER);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "nightsedge"), NIGHTSEDGE);
		Registry.register(Registry.ITEM, new Identifier("weaponspack", "meowmere"), MEOWMERE);


		LOGGER.info("Among Us!!! Sussy!!!!");
	}
}



//i love the fabric wiki <3


//well except when it doesnt help much at all and you have to spend hours going through google in order to find that
//the problem was like idk a dorito stuck in your code