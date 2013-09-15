package assets.tacotek.Items;

import java.util.List;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import assets.tacotek.common.tacotek;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class GenericEdible extends ItemFood {
	
	/**
	 * @param id The ID which to assign to the GenericFood
	 * @param name The UnlocalizedName which to give the Genericfood
	 * @param heal The amount it should heal when eaten.
	 * @param wolfFood Can it be fed to pet wolves?
	 */
	public GenericEdible(int id, String name, int heal, boolean wolfFood) {
		super(id, heal, wolfFood);
		this.setCreativeTab(tacotek.tacotekTab);
		this.setUnlocalizedName(name);
	}
	
	/**
	 * @param id The ID which to assign to the GenericFood
	 * @param name The UnlocalizedName which to give the Genericfood
	 * @param heal The amount it should heal when eaten.
	 * @param wolfFood Can it be fed to pet wolves?
	 * @param desc The Tool-tip Description to give the item.
	 */
	public GenericEdible(int id, String name, int heal, boolean wolfFood, int potID, int duration, int effectLvl, float chance) {
		this(id, name, heal, wolfFood);
		this.setPotionEffect(potID, duration, effectLvl, chance);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister reg) {
		this.itemIcon = reg.registerIcon(tacotek.modID + ":" + this.getUnlocalizedName() );
	}
}