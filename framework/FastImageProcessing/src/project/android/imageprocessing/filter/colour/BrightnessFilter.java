package project.android.imageprocessing.filter.colour;

/**
 * A image brightness adjusting filter extension of BasicFilter.
 * This filter addes the given brightness to the red, green and blue values of each pixel.
 * Values should be in [-1, 1].
 * Values outside of -1 and 1 will produce pure black and pure white images respectively.
 * @author Chris Batt
 */
public class BrightnessFilter extends ColourMatrixFilter {
	
	/**
	 * Creates a ImageBrightnessFilter that adds a given amount to red, green and blue.
	 * @param brightness
	 * The amount that should be added to red, green and blue.
	 */
	public BrightnessFilter(float brightness) {
		super(new float[] {
				1f,	0f,	0f,	brightness,
				0f,	1f,	0f,	brightness,
				0f,	0f,	1f,	brightness,
				0f,	0f,	0f,	1f
		}, 1.0f);
	}
}