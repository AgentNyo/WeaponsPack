package nyo.weapons.pack;

import net.fabricmc.api.ModInitializer;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.entry.RegistryEntry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;
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

	private static void accept(ItemGroup.DisplayContext displayContext, ItemGroup.Entries entries) {
		entries.add(QUARTER_DIAMOND);
	}

	public static final Item GROUPICON = new Item(new Item.Settings());
	public static final Item SPECIALICON = new Item(new Item.Settings());

	public static final Item QUARTER_DIAMOND = new Item(new Item.Settings());
	public static final SwordItem TIDESINGER_STAFF = new SwordItem(tidesinger_staff.INSTANCE, 5, -1.9F, new Item.Settings().rarity(Rarity.UNCOMMON));
	public static final SwordItem DOUBLE_BLADED_SWORD = new SwordItem(double_blade.INSTANCE, 4, -2.1F, new Item.Settings());
	public static final SwordItem DOUBLE_ENDED_STAFF = new SwordItem(double_blade.INSTANCE, 5, -2.6F, new Item.Settings());
	public static final SwordItem BO_STAFF = new SwordItem(bo_staff.INSTANCE, 3, -1.9F, new Item.Settings());
	public static final SwordItem DEATHSINGER_SWORD = new SwordItem(deathsinger_sword.INSTANCE, 9, -2.75F, new Item.Settings().rarity(Rarity.UNCOMMON));
	public static final SwordItem VOLTARIS_STAFF = new SwordItem(diamond_staff.INSTANCE, 6, -2.60F, new Item.Settings().rarity(Rarity.RARE));
	public static final SwordItem KALTARIS_STAFF = new SwordItem(diamond_staff.INSTANCE, 7, -2.90F, new Item.Settings().rarity(Rarity.RARE));
	public static final SwordItem MENDORIS_STAFF = new SwordItem(diamond_staff.INSTANCE, 5, -2.30F, new Item.Settings().rarity(Rarity.RARE));
	public static final SwordItem NESTORIS_STAFF = new SwordItem(diamond_staff.INSTANCE, 4, -2.00F, new Item.Settings().rarity(Rarity.RARE));
	public static final SwordItem SENDARIS_STAFF = new SwordItem(diamond_staff.INSTANCE, 5, -2.50F, new Item.Settings().rarity(Rarity.RARE));
	public static final SwordItem DIAMOND_SCYTHE = new SwordItem(diamond_scythe.INSTANCE, 7, -2.30F, new Item.Settings());
	public static final SwordItem IRON_SCYTHE = new SwordItem(iron_scythe.INSTANCE, 5, -2.30F, new Item.Settings());
	public static final SwordItem DIAMOND_KATANA = new SwordItem(diamond_scythe.INSTANCE, 8, -2.65F, new Item.Settings());
	public static final SwordItem IRON_KATANA = new SwordItem(iron_scythe.INSTANCE, 7, -2.75F, new Item.Settings());
	public static final SwordItem SOUL_BLADE = new SwordItem(blade.INSTANCE, 9, -2.45F, new Item.Settings().fireproof().rarity(Rarity.EPIC));
	public static final SwordItem NETHER_BLADE = new SwordItem(blade.INSTANCE, 9, -2.45F, new Item.Settings().fireproof().rarity(Rarity.EPIC));
	public static final SwordItem ENDER_BLADE = new SwordItem(blade.INSTANCE, 9, -2.45F, new Item.Settings().fireproof().rarity(Rarity.EPIC));

	public static final SwordItem TYGREN_SWORD = new SwordItem(iron_sword.INSTANCE, 5, -2.1F, new Item.Settings());
	public static final SwordItem IRON_CLAYMORE = new SwordItem(iron_sword.INSTANCE, 8, -3F, new Item.Settings());
	public static final SwordItem IRON_GUARD_SWORD = new SwordItem(iron_sword.INSTANCE, 7, -2.70F, new Item.Settings());
	public static final SwordItem IRON_KUKURI = new SwordItem(iron_sword.INSTANCE, 5, -1.90F, new Item.Settings());
	public static final SwordItem IRON_SCIMITAR = new SwordItem(iron_sword.INSTANCE, 6, -2.10F, new Item.Settings());
	public static final SwordItem IRON_BROADSWORD = new SwordItem(iron_sword.INSTANCE, 7, -2.50F, new Item.Settings());
	public static final SwordItem DIAMOND_BROADSWORD = new SwordItem(diamond_sword.INSTANCE, 8, -2.43F, new Item.Settings());
	public static final SwordItem DIAMOND_CUTLASS = new SwordItem(diamond_sword.INSTANCE, 6, -2.30F, new Item.Settings());
	public static final SwordItem THIN_DIAMOND_SWORD = new SwordItem(diamond_sword.INSTANCE, 7, -2.45F, new Item.Settings());
	public static final SwordItem THIN_IRON_SWORD = new SwordItem(iron_sword.INSTANCE, 6, -2.45F, new Item.Settings());

	public static final SwordItem HONORGUARD_GOLD_STAFF = new SwordItem(gold_spear.INSTANCE, 5, -2.70F, new Item.Settings());
	public static final SwordItem HONORGUARD_IRON_STAFF = new SwordItem(iron_spear.INSTANCE, 6, -2.70F, new Item.Settings());
	public static final SwordItem HONORGUARD_DIAMOND_STAFF = new SwordItem(diamond_spear.INSTANCE, 7, -2.65F, new Item.Settings());
	public static final SwordItem IRON_GLAIVE = new SwordItem(iron_spear.INSTANCE, 5, -2.40F, new Item.Settings());
	public static final SwordItem IRON_SPEAR = new SwordItem(iron_spear.INSTANCE, 6, -2.60F, new Item.Settings());
	public static final SwordItem RIA_SPEAR = new SwordItem(iron_spear.INSTANCE, 7, -2.60F, new Item.Settings());
	public static final SwordItem DIAMOND_SPEAR = new SwordItem(diamond_spear.INSTANCE, 7, -2.60F, new Item.Settings());
	public static final SwordItem VOLTARIS_SPEAR = new SwordItem(diamond_spear.INSTANCE, 8, -2.60F, new Item.Settings());
	public static final SwordItem IRON_HOOK = new SwordItem(iron_spear.INSTANCE, 6, -2.50F, new Item.Settings());
	public static final SwordItem DIAMOND_HOOK = new SwordItem(diamond_spear.INSTANCE, 7, -2.50F, new Item.Settings());
	public static final SwordItem IRON_FORKED_SPEAR = new SwordItem(iron_spear.INSTANCE, 7, -2.80F, new Item.Settings());
	public static final SwordItem DIAMOND_FORKED_SPEAR = new SwordItem(diamond_spear.INSTANCE, 8, -2.80F, new Item.Settings());
	public static final SwordItem IRON_ARDONI_SPEAR = new SwordItem(iron_spear.INSTANCE, 6, -2.70F, new Item.Settings());
	public static final SwordItem DIAMOND_ARDONI_SPEAR = new SwordItem(diamond_spear.INSTANCE, 7, -2.70F, new Item.Settings());
	
	public static final SwordItem STONE_HALBERD = new SwordItem(stone.INSTANCE, 4, -3F, new Item.Settings());
	public static final SwordItem IRON_HALBERD = new SwordItem(iron_sword.INSTANCE, 6, -2.95F, new Item.Settings());
	public static final SwordItem DIAMOND_HALBERD = new SwordItem(diamond_sword.INSTANCE, 7, -2.90F, new Item.Settings());
	public static final SwordItem IRON_GREATAXE = new SwordItem(iron_sword.INSTANCE, 7, -2.75F, new Item.Settings());
	public static final SwordItem IRON_BATTLEAXE = new SwordItem(iron_sword.INSTANCE, 7, -2.60F, new Item.Settings());
	public static final SwordItem DIAMOND_BATTLEAXE = new SwordItem(diamond_sword.INSTANCE, 8, -2.60F, new Item.Settings());

	// Creative Only Items
	public static final SwordItem HYPERION = new SwordItem(special.INSTANCE, 12, -2.45F, new Item.Settings().fireproof().rarity(Rarity.EPIC));
	public static final SwordItem LIGHTSABER = new SwordItem(special.INSTANCE, 12, -2.45F, new Item.Settings().fireproof().rarity(Rarity.EPIC));
	public static final SwordItem CRUCIBLE = new SwordItem(special.INSTANCE, 12, -2.60F, new Item.Settings().fireproof().rarity(Rarity.EPIC));
	public static final SwordItem ZENITH = new SwordItem(special.INSTANCE, 14, -2.45F, new Item.Settings().fireproof().rarity(Rarity.EPIC));
	public static final SwordItem TERRABLADE = new SwordItem(special.INSTANCE, 13, -2.45F, new Item.Settings().fireproof().rarity(Rarity.EPIC));
	public static final SwordItem STARWRATH = new SwordItem(special.INSTANCE, 12, -2.45F, new Item.Settings().fireproof().rarity(Rarity.EPIC));
	public static final SwordItem INFLUXWAVER = new SwordItem(special.INSTANCE, 12, -2.45F, new Item.Settings().fireproof().rarity(Rarity.EPIC));
	public static final SwordItem NIGHTSEDGE = new SwordItem(special.INSTANCE, 12, -2.45F, new Item.Settings().fireproof().rarity(Rarity.EPIC));
	public static final SwordItem MEOWMERE = new SwordItem(special.INSTANCE, 12, -2.45F, new Item.Settings().fireproof().rarity(Rarity.EPIC));

	public static final ItemGroup GROUP = FabricItemGroup.builder()
			.icon(() -> new ItemStack(GROUPICON))
			.displayName(Text.translatable("itemGroup.weaponspack.group"))
			.entries((displayContext, entries) -> {
                entries.add(QUARTER_DIAMOND);

				entries.add(TIDESINGER_STAFF);
				entries.add(DOUBLE_BLADED_SWORD);
				entries.add(DOUBLE_ENDED_STAFF);
				entries.add(BO_STAFF);
				entries.add(DEATHSINGER_SWORD);
				entries.add(VOLTARIS_STAFF);
				entries.add(KALTARIS_STAFF);
				entries.add(MENDORIS_STAFF);
				entries.add(NESTORIS_STAFF);
				entries.add(SENDARIS_STAFF);
				entries.add(DIAMOND_SCYTHE);
				entries.add(IRON_SCYTHE);
				entries.add(DIAMOND_KATANA);
				entries.add(IRON_KATANA);
				entries.add(SOUL_BLADE);
				entries.add(NETHER_BLADE);
				entries.add(ENDER_BLADE);

				entries.add(TYGREN_SWORD);
				entries.add(IRON_CLAYMORE);
				entries.add(IRON_GUARD_SWORD);
				entries.add(IRON_KUKURI);
				entries.add(IRON_SCIMITAR);
				entries.add(IRON_BROADSWORD);
				entries.add(DIAMOND_BROADSWORD);
				entries.add(DIAMOND_CUTLASS);
				entries.add(THIN_DIAMOND_SWORD);
				entries.add(THIN_IRON_SWORD);

				entries.add(HONORGUARD_GOLD_STAFF);
				entries.add(HONORGUARD_IRON_STAFF);
				entries.add(HONORGUARD_DIAMOND_STAFF);
				entries.add(IRON_GLAIVE);
				entries.add(IRON_SPEAR);
				entries.add(RIA_SPEAR);
				entries.add(DIAMOND_SPEAR);
				entries.add(VOLTARIS_SPEAR);
				entries.add(IRON_HOOK);
				entries.add(DIAMOND_HOOK);
				entries.add(IRON_FORKED_SPEAR);
				entries.add(DIAMOND_FORKED_SPEAR);
				entries.add(IRON_ARDONI_SPEAR);
				entries.add(DIAMOND_ARDONI_SPEAR);

				entries.add(STONE_HALBERD);
				entries.add(IRON_HALBERD);
				entries.add(DIAMOND_HALBERD);
				entries.add(IRON_GREATAXE);
				entries.add(IRON_BATTLEAXE);
				entries.add(DIAMOND_BATTLEAXE);
            })
			.build();

	public static final ItemGroup SPECIAL = FabricItemGroup.builder()
			.icon(() -> new ItemStack(SPECIALICON))
			.displayName(Text.translatable("itemGroup.weaponspack.special"))
			.entries(((displayContext, entries) -> {
				entries.add(HYPERION);
				entries.add(LIGHTSABER);
				entries.add(CRUCIBLE);
				entries.add(ZENITH);
				entries.add(TERRABLADE);
				entries.add(STARWRATH);
				entries.add(INFLUXWAVER);
				entries.add(NIGHTSEDGE);
				entries.add(MEOWMERE);
			}))
			.build();

	@Override
	public void onInitialize() {

		Registry.register(Registries.ITEM, new Identifier("weaponspack", "quarter_diamond"), QUARTER_DIAMOND);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "tidesinger_staff"), TIDESINGER_STAFF);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "groupicon"), GROUPICON);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "specialicon"), SPECIALICON);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "deathsinger_sword"), DEATHSINGER_SWORD);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "double_bladed_sword"), DOUBLE_BLADED_SWORD);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "double_ended_staff"), DOUBLE_ENDED_STAFF);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "bo_staff"), BO_STAFF);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "voltaris_staff"), VOLTARIS_STAFF);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "nestoris_staff"), NESTORIS_STAFF);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "mendoris_staff"), MENDORIS_STAFF);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "kaltaris_staff"), KALTARIS_STAFF);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "sendaris_staff"), SENDARIS_STAFF);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "diamond_scythe"), DIAMOND_SCYTHE);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "iron_scythe"), IRON_SCYTHE);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "diamond_katana"), DIAMOND_KATANA);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "iron_katana"), IRON_KATANA);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "soul_blade"), SOUL_BLADE);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "nether_blade"), NETHER_BLADE);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "ender_blade"), ENDER_BLADE);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "tygren_sword"), TYGREN_SWORD);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "iron_claymore"), IRON_CLAYMORE);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "iron_guard_sword"), IRON_GUARD_SWORD);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "iron_kukuri"), IRON_KUKURI);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "iron_scimitar"), IRON_SCIMITAR);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "iron_broadsword"), IRON_BROADSWORD);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "diamond_broadsword"), DIAMOND_BROADSWORD);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "diamond_cutlass"), DIAMOND_CUTLASS);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "thin_diamond_sword"), THIN_DIAMOND_SWORD);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "thin_iron_sword"), THIN_IRON_SWORD);

		Registry.register(Registries.ITEM, new Identifier("weaponspack", "honorguard_gold_staff"), HONORGUARD_GOLD_STAFF);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "honorguard_iron_staff"), HONORGUARD_IRON_STAFF);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "honorguard_diamond_staff"), HONORGUARD_DIAMOND_STAFF);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "iron_glaive"), IRON_GLAIVE);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "iron_spear"), IRON_SPEAR);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "ria_spear"), RIA_SPEAR);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "voltaris_spear"), VOLTARIS_SPEAR);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "diamond_spear"), DIAMOND_SPEAR);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "iron_hook"), IRON_HOOK);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "diamond_hook"), DIAMOND_HOOK);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "iron_forked_spear"), IRON_FORKED_SPEAR);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "diamond_forked_spear"), DIAMOND_FORKED_SPEAR);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "iron_ardoni_spear"), IRON_ARDONI_SPEAR);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "diamond_ardoni_spear"), DIAMOND_ARDONI_SPEAR);

		Registry.register(Registries.ITEM, new Identifier("weaponspack", "stone_halberd"), STONE_HALBERD);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "iron_halberd"), IRON_HALBERD);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "diamond_halberd"), DIAMOND_HALBERD);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "iron_greataxe"), IRON_GREATAXE);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "iron_battleaxe"), IRON_BATTLEAXE);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "diamond_battleaxe"), DIAMOND_BATTLEAXE);

		Registry.register(Registries.ITEM, new Identifier("weaponspack", "hyperion"), HYPERION);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "lightsaber"), LIGHTSABER);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "crucible"), CRUCIBLE);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "zenith"), ZENITH);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "terrablade"), TERRABLADE);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "starwrath"), STARWRATH);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "influxwaver"), INFLUXWAVER);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "nightsedge"), NIGHTSEDGE);
		Registry.register(Registries.ITEM, new Identifier("weaponspack", "meowmere"), MEOWMERE);

		Registry.register(Registries.ITEM_GROUP, new Identifier("weaponspack", "group"), GROUP);
		Registry.register(Registries.ITEM_GROUP, new Identifier("weaponspack", "special"), SPECIAL);

		LOGGER.info("Among Us!!! Sussy!!!!");
	}
}

//i love the fabric wiki <3

//well except when it doesnt help much at all and you have to spend hours going through google in order to find that
//the problem was like idk a dorito stuck in your code