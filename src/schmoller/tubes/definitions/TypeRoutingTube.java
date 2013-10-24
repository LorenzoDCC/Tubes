package schmoller.tubes.definitions;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.EnumChatFormatting;
import net.minecraft.util.Icon;
import schmoller.tubes.types.BaseTube;
import schmoller.tubes.types.RoutingTube;

public class TypeRoutingTube extends TubeDefinition
{
	public static Icon center;
	public static Icon colours;
	
	public static int[] sideColours = new int[] {15, 0, 11, 14, 4, 9};
	public static EnumChatFormatting[] sideColoursText = new EnumChatFormatting[] {EnumChatFormatting.DARK_GRAY, EnumChatFormatting.WHITE, EnumChatFormatting.BLUE, EnumChatFormatting.RED, EnumChatFormatting.YELLOW, EnumChatFormatting.DARK_AQUA};
	
	@Override
	public void registerIcons( IconRegister register )
	{
		center = register.registerIcon("Tubes:tube-routing-center");
		colours = register.registerIcon("Tubes:tube-routing-colours");
	}
	
	@Override
	public Icon getCenterIcon()
	{
		return TypeNormalTube.centerIcon;
	}

	@Override
	public Icon getStraightIcon()
	{
		return TypeNormalTube.straightIcon;
	}

	@Override
	public BaseTube createTube()
	{
		return new RoutingTube();
	}
}
