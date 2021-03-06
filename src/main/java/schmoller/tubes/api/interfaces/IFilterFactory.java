package schmoller.tubes.api.interfaces;

import schmoller.tubes.api.Payload;
import codechicken.lib.data.MCDataInput;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTTagCompound;

public interface IFilterFactory
{
	/**
	 * Creates a new filter
	 * @param heldItem The item on the cursor being clicked into the slot
	 * @param existing The existing filter (if there is one)
	 * @param button The mouse button used (0 = left, 1 = right, 2 = middle)
	 * @param shift Whether the shift key was pressed
	 * @param ctrl Whether the ctrl (command) key was pressed
	 * @param mustHavePayload When true, the returned filter must have a corresponding payload type
	 * @return A new filter, or null if none would have been created
	 */
	public IFilter getFilterFrom(ItemStack heldItem, IFilter existing, int button, boolean shift, boolean ctrl, boolean mustHavePayload);
	
	/**
	 * Creates a filter that holds the specified payload
	 * @param payload The payload to copy
	 * @return A filter, or null
	 */
	public IFilter getFilterFrom(Payload payload);
	
	/**
	 * Load a filter from an NBTTagCompound
	 * @param filterName The name of the filter being loaded
	 * @param tag The filter data
	 * @return Return the filter with the loaded data, or null if this factory cannot load that type
	 */
	public IFilter loadFilter(String filterName, NBTTagCompound tag);
	/**
	 * Load a filter from an MCDataInput
	 * @param filterName The name of the filter being loaded
	 * @param input The filter data
	 * @return Return the filter with the loaded data, or null if this factory cannot load that type
	 */
	public IFilter loadFilter(String filterName, MCDataInput input);
}
